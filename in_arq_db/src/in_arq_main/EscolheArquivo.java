package in_arq_main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import in_arq_layoutControl.RegTp00Control;

public class EscolheArquivo {
	
	String linhaArquivo = "";
	public int totalLinhas = 1;
	private int totalLinhasErro = 0;
	private int header = 0;

	
	
	public void buscar() throws ParseException, SQLException {
	
	// implementa os tipos de arquivos que aparecerão para escolher
	FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("csv", "txt");
	
	// instancia o selecionador de arquivos
	JFileChooser fc = new JFileChooser("C:\\Users\\Servo\\Desktop\\Projetos\\Access_Stage\\ArquivosTeste");
	
	// adicionando os arquivos que foram selecionados
	fc.setFileFilter(fileNameExtensionFilter);

	// nome da tela localizadora de arquivos
	fc.setDialogTitle("Escolha de arquivo csv");
	
	// recebe uma resposta da janela caso algum evento do localizador de arquivo seja acessado
	int resposta = fc.showOpenDialog(null);
	
	// verifica se a resposta recebida é igual a ok
	if(resposta == JFileChooser.APPROVE_OPTION) {
		
		// se sim abre um buffer do arquivo e joga na tela
		File file = new File(fc.getSelectedFile().getAbsolutePath());
		FileReader fis;
		try {
			fis = new FileReader(file);
			BufferedReader  bis = new BufferedReader(fis);
			
			while(bis.ready()) {
				
				// System.out.println(totalLinhas+ " " + bis.readLine()+"\n");
				
				// insere linha na variavel linhaArquivo
				linhaArquivo = bis.readLine();
				
				// chama metodo que verifica o tipo de registro
				verificaTpRegistro(linhaArquivo);
				
				// variavel totalLInhas para contagem da linha atual e terminando o while o total de linhas
				
				totalLinhas = getTotalLinhas() + 1;
				
				
			}
			totalLinhas = totalLinhas-1;
			System.out.println("Total de linhas neste arquivo: " + totalLinhas);
			System.out.println(new RegTp00Control().getMsgErro()); 
			totalLinhasErro = totalLinhasErro + new RegTp00Control().getMsgErro(); 
			System.out.println("Total de linhas com erro neste arquivo: " + totalLinhasErro);
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado \n" + e);
			e.printStackTrace();
			// TODO: Deixar amigável a mensagem de erro FileNotFoundException
		}catch (IOException e) {
			// TODO: Deixar amigável a mensagem de erro IOException
			System.out.println("Erro de entrada \n" + e);
			e.printStackTrace();
		}
	}
	}
	public void verificaTpRegistro(String l) throws ParseException, SQLException {
		
		String l2 = l;
		// quebra a linha
		String[] saida = l2.split(",");
		
		String tipoLayout = saida[0];
		
		//System.out.println(saida[0]);
		int numVirgula = 0;
		// verifica a quantidade de virgulas
		numVirgula = verificaQtdeVirgulas(l);
		// tamanho da linha menos a quantidade de virgulas
		int totalCaracterLinha = l.length() - numVirgula;
		
		//caso a linha não seja vazia
		if(l != "") {
			
			switch (tipoLayout) {
			case "00": {
				RegTp00Control lc = new RegTp00Control();
				if(totalCaracterLinha == 141){
					// chama metodo para inclusao do regTipo00
						lc.insereRegTp00(l);
				}else {
					System.out.println("Total de caracteres fora do padrao do layout!\n Verificar linha: " + totalLinhas);
					// TODO criar tabela para incluir dados não inseridos corretamente a base
					System.out.println("Cadastrado na tabela de registro que deram erro");
					totalLinhasErro += 1;
					if(new RegTp00Control().getMsgErro() == 1) {
						totalLinhasErro += 1;
					}
					System.out.println("Total de linhas com erro: " + totalLinhasErro);
					
				}
				break;
			}case "01": {
				RegTp00Control lc = new RegTp00Control();
				if(totalCaracterLinha == 141){
					// chama metodo para inclusao do regTipo00
						lc.insereRegTp00(l);
				}else {
					System.out.println("Total de caracteres fora do padrao do layout!\n Verificar linha: " + totalLinhas);
					// TODO criar tabela para incluir dados não inseridos corretamente a base
					System.out.println("Cadastrado na tabela de registro que deram erro");
					totalLinhasErro += 1;
					if(new RegTp00Control().getMsgErro() == 1) {
						totalLinhasErro += 1;
					}
					System.out.println("Total de linhas com erro: " + totalLinhasErro);
					
				}
				break;
			}
			default:
				totalLinhasErro += 1;
				System.out.println("TipoLayout: " + saida[0] + " Erro (Total de caracteres) ao inserir a linha: " + totalLinhas);
				break;
			}
			
		}
		
		
		
	}
	
	private int verificaQtdeVirgulas(String l) {
		
		// caracter a ser procurado
		char caracter = ',';
		// cria array
		char[] linha = l.toCharArray();
		// contador de caracter procurado
		int cont = 0;
		// percorre o array e compara ao 
		for (int i = 0; i < linha.length; i++) {
		    if (linha[i] == caracter) {
		        cont++;
		    }
		}
		//System.out.println("Número de ocorrências da letra '" + caracter + "': " + cont);
		return cont;
	}
	
	// getters and setters
	
	public String getLinhaArquivo() {
		return linhaArquivo;
	}
	public void setLinhaArquivo(String linhaArquivo) {
		this.linhaArquivo = linhaArquivo;
	}
	public int getTotalLinhas() {
		return totalLinhas;
	}
	public void setTotalLinhas(int totalLinhas) {
		this.totalLinhas = totalLinhas;
	}
	public int getTotalLinhasErro() {
		return totalLinhasErro;
	}
	public void setTotalLinhasErro(int totalLinhasErro) {
		this.totalLinhasErro = totalLinhasErro;
	}

	public int getHeader() {
		return header;
	}
	public void setHeader(int header) {
		this.header = header;
	}
	
}


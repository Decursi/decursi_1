package in_arq_layoutControl;

import java.sql.SQLException;
import java.text.ParseException;

import in_arq_bean.RegTp00Bean;
import in_arq_dao.RegTp00Dao;
import in_arq_main.EscolheArquivo;

public class RegTp00Control {
	
	private int msgErro =1;

	


	public void insereRegTp00(String l) throws ParseException, SQLException {
		// TODO criar layout 00
		
		// instancia um objeto Layout00
		// quebra a string e insere dentro de um vetor
		// verifica se o campo tem o tamanho definido pelo layout
		// insere cada valor do vetor para a variável correspondente
		
		RegTp00Bean lay0 = new RegTp00Bean();
				
		String[] saida = l.split(",");
		
		// verifica o tamanho de cada parte da linha
		if((saida[0].length()== 2) &&
			(saida[1].length()== 9) &&
			(saida[2].length()== 8) &&
			(saida[3].length()== 8) &&
			(saida[4].length()== 39) &&
			(saida[5].length()== 8) &&
			(saida[6].length()== 26) &&
			(saida[7].length()== 6) &&
			(saida[8].length()== 15) &&
			(saida[9].length()== 20)) {
		

		
		// tipo de registro
		//lay0.setNumTpReg(Integer.parseInt(saida[0]));
		lay0.setNumTpReg(saida[0]);
		// numero da matriz
		lay0.setNumMatriz(Integer.parseInt(saida[1]));
		// data de emissao
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		//lay0.setDtEmissao((Date) simpleDateFormat.parse(saida[2]));
		lay0.setDtEmissao(saida[2]);
		
		// data de movimento
		//SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
		//lay0.setDtMovimento((Date) simpleDateFormat.parse(saida[3]));
		lay0.setDtMovimento(saida[3]);
		// movimentacao diaria
		lay0.setMovimentacaoDiaria(saida[4]);
		// rede
		lay0.setRede(saida[5]);
		// nome comercial do estabelecimento
		lay0.setNomeComercial(saida[6]);
		// sequencia movimento
		lay0.setNumSeqMovimento(Integer.parseInt(saida[7]));
		// tipo de processamento
		lay0.setTipoProcessamento(saida[8]);
		// versao do arquivo
		lay0.setVersaoArquivo(saida[9]);
		
		RegTp00Dao ldao = new RegTp00Dao();
		ldao.addLayout00(lay0);
		
		}else {
			System.out.println("Layout 00 - Erro: Campos com valores menores, verificar linha: " + 
					new EscolheArquivo().getTotalLinhas());
					 
		}
		
	}

	public int getMsgErro() {
		return msgErro;
	}


	public void setMsgErro(int msgErro) {
		this.msgErro = msgErro;
	}
	
}

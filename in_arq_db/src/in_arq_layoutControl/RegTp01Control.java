package in_arq_layoutControl;

import java.sql.SQLException;
import java.text.ParseException;

import in_arq_bean.RegTp01Bean;
import in_arq_dao.RegTp01Dao;
import in_arq_main.EscolheArquivo;

/* Registro tipo 01 - Resumo de Vendas
002 Num. Tipo de registro
009 Num. Nº de filiação do ponto de venda
008 Num. Data de crédito (será demonstrado“zero” quando pré-datado)
008 Num. Data do resumo de vendas
009 Num. Nº do resumo de vendas
006 Num. Quantidade de comprovantes de vendas
015 9(13)V99 Valor bruto (para o compre e saque, este campo será composto pelo “Valor da Compra”+“Valor do Saque”)
015 9(13)V99 Valor desconto
015 9(13)V99 Valor líquido
001 Alfa Tipo de resumo (D – Débito à vista/ P – Pré-datado)
003 Num. Banco
006 Num. Agência
011 Num. Conta-corrente
001 Alfa Bandeira
*/


public class RegTp01Control {
	
	

	
	public void setLayout01(String l) throws ParseException, SQLException {
		// TODO criar layout 01
		
		// instancia um objeto Layout01
		// quebra a string e insere dentro de um vetor
		// verifica se o campo tem o tamanho definido pelo layout
		// insere cada valor do vetor para a variável correspondente
		
		RegTp01Bean lay0 = new RegTp01Bean();
				
		String[] saida = l.split(",");
		
		// verifica o tamanho de cada parte da linha
		if((saida[0].length()== 2) &&
			(saida[1].length()== 9) &&
			(saida[2].length()== 8) &&
			(saida[3].length()== 8) &&
			(saida[4].length()== 9) &&
			(saida[5].length()== 6) &&
			(saida[6].length()== 15) &&
			(saida[7].length()== 15) &&
			(saida[8].length()== 15) &&
			(saida[9].length()== 1) &&
			(saida[10].length()== 3) &&
			(saida[11].length()== 6) &&
			(saida[12].length()== 11) &&
			(saida[13].length()== 1)) {
			
			/* Registro tipo 01 - Resumo de Vendas
			
			003 Num. Banco
			006 Num. Agência
			011 Num. Conta-corrente
			001 Alfa Bandeira
			*/
		lay0.setNumTpReg(Integer.parseInt(saida[0]));
		lay0.setnFilPontoVenda(Integer.parseInt(saida[1]));
		lay0.setDtCredito(saida[2]);
		lay0.setDtResumoVendas(saida[3]);
		lay0.setnResumoVendas(Integer.parseInt(saida[4]));
		lay0.setQtdeComprovantesVendas(Integer.parseInt(saida[5]));
		lay0.setValorBruto(Integer.parseInt(saida[6]));
		lay0.setValorDesconto(Integer.parseInt(saida[7]));
		lay0.setValorLiquido(Integer.parseInt(saida[8]));
		lay0.setTpResumo(saida[9]);
		
		
		RegTp01Dao ldao = new RegTp01Dao();
		///ldao.addLayout01(lay0);
		}else {
			System.out.println("Layout 01 - Erro: Campos com valores menores, verificar linha: " + 
					new EscolheArquivo().getTotalLinhas());
		}
		
	}
	
}

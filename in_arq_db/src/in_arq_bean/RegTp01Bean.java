package in_arq_bean;

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

public class RegTp01Bean {

	private int idReg01;
	private int numTpReg;
	private int nFilPontoVenda;
	private String dtCredito;
	private String dtResumoVendas;
	private int nResumoVendas;
	private int qtdeComprovantesVendas;
	private int valorBruto;
	private int valorDesconto;
	private int valorLiquido;
	private String tpResumo;
	private int banco;
	private int agencia;
	private int contaCorrente;
	private char bandeira;
	
	
	//ggas
	public int getNumTpReg() {
		return numTpReg;
	}
	public void setNumTpReg(int numTpReg) {
		this.numTpReg = numTpReg;
	}
	public int getnFilPontoVenda() {
		return nFilPontoVenda;
	}
	public void setnFilPontoVenda(int nFilPontoVenda) {
		this.nFilPontoVenda = nFilPontoVenda;
	}
	public String getDtCredito() {
		return dtCredito;
	}
	public void setDtCredito(String dtCredito) {
		this.dtCredito = dtCredito;
	}
	public String getDtResumoVendas() {
		return dtResumoVendas;
	}
	public void setDtResumoVendas(String dtResumoVendas) {
		this.dtResumoVendas = dtResumoVendas;
	}
	public int getnResumoVendas() {
		return nResumoVendas;
	}
	public void setnResumoVendas(int nResumoVendas) {
		this.nResumoVendas = nResumoVendas;
	}
	public int getQtdeComprovantesVendas() {
		return qtdeComprovantesVendas;
	}
	public void setQtdeComprovantesVendas(int qtdeComprovantesVendas) {
		this.qtdeComprovantesVendas = qtdeComprovantesVendas;
	}
	public int getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(int valorBruto) {
		this.valorBruto = valorBruto;
	}
	public int getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(int valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public int getValorLiquido() {
		return valorLiquido;
	}
	public void setValorLiquido(int valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	public String getTpResumo() {
		return tpResumo;
	}
	public void setTpResumo(String saida) {
		this.tpResumo = saida;
	}
	public int getBanco() {
		return banco;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(int contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public char getBandeira() {
		return bandeira;
	}
	public void setBandeira(char bandeira) {
		this.bandeira = bandeira;
	}
	public int getIdReg01() {
		return idReg01;
	}
	
	
	
}

package in_arq_bean;

import java.sql.Date;


public class RegTp00Bean {
	
	/* 
	-- vendas a debito
	-- Layout 00

	Registro Tipo 00 - Cabeçalho do arquivo			

	Coluna | Tamanho máximo | Tipo | Descrição do campo
				
	1	2	Num	Tipo de registro
	2	9	Num	Nº- de filiação da matriz ou grupo comercial
	3	8	Num	Data de emissão (DDMMAAAA)
	4	8	Num	Data de movimento (DDMMAAAA)
	5	39	Alfa	“Movimentação diária – Cartões de débito”
	6	8	Alfa	“Rede”
	7	26	Alfa	Nome comercial do estabelecimento
	8	6	Num	Sequência de movimento
	9	15	Alfa	Tipo de processamento (diário/reprocessamento)
	10	20	Alfa	Versão do arquivo (V1.04 – 07/10 – EEVD)
	*/
	
	private int idReg00; // pk
	private String numTpReg; // tam 2
	private int numMatriz; // tam 9
	private String dtEmissao; // tam 8 - DDMMAAAA
	private String dtMovimento; // tam 8 - DDMMAAAA
	private String movimentacaoDiaria; // tam 39
	private String rede; // tam 8
	private String nomeComercial; // tam 26
	private int numSeqMovimento; // tam 6
	private String tipoProcessamento; // tam 15
	private String versaoArquivo; // tam 20
	private Date dt_inclusao; // datetime
	private Date dt_alteracao; // datetime

	
	// TODO Vincular usuario com criação do layout00
	// private Usuario idUsuario;
	
	
	
	// getters and setters
	
	public Date getDt_inclusao() {
		return dt_inclusao;
	}
	public void setDt_inclusao(Date dt_inclusao) {
		this.dt_inclusao = dt_inclusao;
	}
	public Date getDt_alteracao() {
		return dt_alteracao;
	}
	public void setDt_alteracao(Date dt_alteracao) {
		this.dt_alteracao = dt_alteracao;
	}
	public int getIdReg00() {
		return idReg00;
	}
	/*public void setIdReg00(int idReg00) {
		this.idReg00 = idReg00;
	}*/
	public String getNumTpReg() {
		return numTpReg;
	}
	public void setNumTpReg(String numTpReg) {
		this.numTpReg = numTpReg;
	}
	public int getNumMatriz() {
		return numMatriz;
	}
	public void setNumMatriz(int numMatriz) {
		this.numMatriz = numMatriz;
	}
	public String getDtEmissao() {
		return dtEmissao;
	}
	public void setDtEmissao(String dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	public String getDtMovimento() {
		return dtMovimento;
	}
	public void setDtMovimento(String date) {
		this.dtMovimento = date;
	}
	public String getMovimentacaoDiaria() {
		return movimentacaoDiaria;
	}
	public void setMovimentacaoDiaria(String movimentacaoDiaria) {
		this.movimentacaoDiaria = movimentacaoDiaria;
	}
	public String getRede() {
		return rede;
	}
	public void setRede(String rede) {
		this.rede = rede;
	}
	public String getNomeComercial() {
		return nomeComercial;
	}
	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}
	public int getNumSeqMovimento() {
		return numSeqMovimento;
	}
	public void setNumSeqMovimento(int numSeqMovimento) {
		this.numSeqMovimento = numSeqMovimento;
	}
	public String getTipoProcessamento() {
		return tipoProcessamento;
	}
	public void setTipoProcessamento(String tipoProcessamento) {
		this.tipoProcessamento = tipoProcessamento;
	}
	public String getVersaoArquivo() {
		return versaoArquivo;
	}
	public void setVersaoArquivo(String versaoArquivo) {
		this.versaoArquivo = versaoArquivo;
	}
	
	


}
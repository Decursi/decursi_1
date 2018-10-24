package in_arq_dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import in_arq_bean.RegTp00Bean;

public class RegTp00Dao {
	
	Connection con = new ConnectionFactory().getConnection();
	// inserindo dados no layout00 - header
	
	public void addLayout00(RegTp00Bean lay) throws SQLException {
	
		String sql = "insert into tb_reg00_t " +
				"(numTpReg, numMatriz, dtEmissao, dtMovimento, movimentacaoDiaria, " +
				"rede, nomeComercial, numSeqMovimento, tipoProcessamento, versaoArquivo, dt_inclusao)" +
				"values(?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, lay.getNumTpReg());
		stmt.setInt(2, lay.getNumMatriz());
		// TODO arrumar strings para data
		stmt.setString(3, lay.getDtEmissao());
		stmt.setString(4, lay.getDtMovimento());
		stmt.setString(5, lay.getMovimentacaoDiaria());
		stmt.setString(6, lay.getRede());
		stmt.setString(7, lay.getNomeComercial());
		stmt.setInt(8, lay.getNumSeqMovimento());
		stmt.setString(9, lay.getTipoProcessamento());
		stmt.setString(10, lay.getVersaoArquivo());
		
		Date dataHoraAtual = new Date();
		String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
		String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
		stmt.setString(11, data+" "+hora);
		//stmt.setDate(11, new java.sql.Date(
        //        Calendar.getInstance().getTimeInMillis()));
		
		stmt.execute();
		stmt.close();
		
		
		//System.out.println("Gravado com sucesso!");
		
		con.close();
		
	// retorna status
	//return null;
	
	

	}
}


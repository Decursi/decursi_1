package in_arq_main;

import java.sql.SQLException;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException, SQLException {
		
		
		EscolheArquivo arq = new EscolheArquivo();
		arq.buscar();
		/*LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);*/
	}

}

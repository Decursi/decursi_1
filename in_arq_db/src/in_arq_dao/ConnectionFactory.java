package in_arq_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	


    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    // desabilita mensagem denão uso de SSL ?autoReconnect=true&useSSL=false
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/access_da?autoReconnect=true&useSSL=false";
   // private static final String DRIVER = "com.mysql.jdbc.Driver";

    // Conectar ao banco
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    URL, USUARIO, SENHA);
        } catch (SQLException e) {
        	System.out.println("Erro de conexão");
        	throw new RuntimeException(e);
            
        }
    }

}

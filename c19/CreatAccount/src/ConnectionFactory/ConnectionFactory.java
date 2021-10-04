package ConnectionFactory;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	// Método responsavel por estabelecer a conexão com o banco mysql
	

	public static Connection creatConnection() {

		java.sql.Connection Conectar = null;

		// A linha abaixo CHAMA o driver
		String driver = "com.mysql.cj.jdbc.Driver";

		// Armazenando informações referente ao banco de dados
		String url = "jdbc:mysql://localhost:3306/Java_Crud";
		String user= "root";
		String password = "password";
		
		//Estabelecendo a conexão com o banco
		try {
			Class.forName(driver);
			Conectar = DriverManager.getConnection(url, user, password);
			return Conectar;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}


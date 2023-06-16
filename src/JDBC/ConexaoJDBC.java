package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {
    
    //chamaremos essa função todo vez que precisar fazer conexão com o DB
    
    public static Connection getConexao() throws SQLException {       
        try {
            final String url = "jdbc:mysql://localhost:3306/cadastro?verifyServerCertificate=false&usesSSL=true";
            final String usuario = "root";
            final String senha = "12345";
		
	Connection conexao = DriverManager.getConnection(url,usuario,senha);
        return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

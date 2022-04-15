package sistemapet.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private String url = "jdbc:mysql://localhost:3307/sistemapet";
    private String user = "root";
    private String pass = "";
    private String driver = "com.mysql.jdbc.Driver";

    private Connection connection;

    public Connection getConnection(){

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);



        } catch (ClassNotFoundException | SQLException e) {
           
            System.out.println("Erro: " + e);
            
        }

        return connection;
    }


}

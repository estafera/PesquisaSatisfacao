package Database;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author geoinformacao
 */
public class ConexaoSQL {
    //Status da conexao
    public static String status = "Não conectado.";
    public Connection conn;
    public Statement query;
    
    public void conectar(String banco, String login, String senha) {
        try
        {
            // Define Driver de conexão JDBC thin
            String URL =  "jdbc:sqlserver://Estacao01\\SQLEXPRESS:1433;databaseName=" + banco +
                          ";user=" + login + ";password="+senha;
            
            String URL2 =  "jdbc:sqlserver://CAS419248A10501\\CITADEL;databaseName=" + banco +
                          ";user=" + login + ";password="+senha;
 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL);                      
 
                    //Executa pedido SQL
            query = conn.createStatement();
            JOptionPane.showMessageDialog(null, "Conexão Efetuada com sucesso!");
        } 
 
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Erro na conexão!");
            ex.printStackTrace();
        }
    }
}

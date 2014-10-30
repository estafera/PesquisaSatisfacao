package Uteis;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author geoinformacao
 */
public class ConexaoSQL {
    //Status da conexao
    public static String status = "Não conectado.";
    public static Connection conn;
    public static Statement query;
    
    public static void conectar(String banco, String login, String senha) {
        try {            
            String URL =  "jdbc:sqlserver://CAS419237A10516\\CITADEL:60256;databaseName=" + banco +
                          ";user=" + login + ";password="+senha;
 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL);   
            
 
            //Executa pedido SQL
            query = conn.createStatement();
            System.out.println("Conexão efetuada com sucesso!");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erro na conexão!");
        }
    }
    
    public static void main(String[] args) {
        conectar("DBPesquisaSatisfacao", "ramon", "1234");
    }
}

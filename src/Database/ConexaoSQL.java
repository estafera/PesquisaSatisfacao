package Database;

import java.sql.*;

public class ConexaoSQL {
    //Status da conexao
    private static String status = "Não conectado";
    private static Connection conn;
    private static Statement query;
    
    //Atributos da conexao;
    private String servidor;
    private int porta;
    private String banco;
    private String login;
    private String senha;

    public ConexaoSQL(String servidor, int porta, String banco, String login, String senha) {
        this.servidor = servidor;
        this.porta = porta;
        this.banco = banco;
        this.login = login;
        this.senha = senha;
        
        conectar();
    }
    
    public ConexaoSQL(){
        this.servidor = "WIN-F9KH5MLL0II\\SQLEXPRESS";
        this.porta = 60256;
        this.banco = "DBPesquisaSatisfacao";
        this.login = "ramonh";
        this.senha = "1234";
        
        conectar();
    }
    
    public void conectar() {
        try {            
            String URL =  "jdbc:sqlserver://"+servidor+":"+porta+";databaseName=" + banco +
                          ";user=" + login + ";password="+senha;
 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL);
 
            //Executa pedido SQL
            query = conn.createStatement();
            status = "Conectado";
            
            System.out.println("A conexão com o banco de dados foi efetuada com sucesso.");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Houve um erro durante a conexão com o banco de dados.");
        }
    }
    
    public ResultSet consulta(String consulta){
        try {
            ResultSet rs = query.executeQuery(consulta);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public void executar(String comando){
        try {
           query.execute(comando);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //<editor-fold defaultstate="collapsed" desc="getters()">
    public String getStatus() {
        return status;
    }
    
    public String getServidor() {
        return servidor;
    }
    
    public int getPorta() {
        return porta;
    }
    
    public String getBanco() {
        return banco;
    }
    
    public String getLogin() {
        return login;
    }
    
    public String getSenha() {
        return senha;
    }
    
//</editor-fold>
    
}

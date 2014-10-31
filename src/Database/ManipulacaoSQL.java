/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Entidades.Cliente;
import Entidades.Taxista;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ramon Honorio
 */
public class ManipulacaoSQL {
    private static ConexaoSQL sql = new ConexaoSQL();
    private ResultSet result;
    
    public void imprimirPassageiros(){
        result = sql.consulta(""
                + "SELECT * FROM T_PASSAGEIRO "
                + "ORDER BY NOME_COMPLETO ASC");
        
        System.out.println("-------TABELA DE PASSAGEIROS-------");
        try {
            System.err.println("ID_PASSAGEIRO\t\t\t\tNOME_COMPLETO\t\tCPF");
            while(result.next()){
                System.out.print(result.getString("ID_PASSAGEIRO"));
                System.out.print("\t"+result.getString("NOME_COMPLETO"));
                System.out.println("\t"+result.getString("CPF"));
            }
            System.out.println("-----------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    public void inserirPassageiro(Cliente cliente){
        sql.executar(
            "INSERT INTO [dbo].[T_PASSAGEIRO]\n" +
            "           ([ID_PASSAGEIRO]\n" +
            "           ,[NOME_COMPLETO]\n" +
            "           ,[CPF])\n" +
            "     VALUES\n" +
            "           (NEWID()\n" +
            "           ,'"+cliente.getNome()+"'\n" +
            "           ,'"+cliente.getCPF()+"')"
        );
    }
    
    public boolean autenticarTaxista(Taxista login){        
        try {
            Taxista autentic = new Taxista(
                    result.getString("ID_TAXISTA"),
                    result.getString("NOME_COMPLETO"),
                    result.getString("CPF"),
                    result.getString("SENHA"));

            if(login.getSenha().equals(autentic.getSenha())){
                login.setNome(autentic.getNome());
                login.setId(autentic.getId());
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean existeTaxista(Taxista login){
        result = sql.consulta(""
                + "SELECT * FROM T_TAXISTA "
                + "WHERE CPF = '"+login.getCpf()+"'");
        
        try { 
            result.next();
            return result.getRow()!=0;
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
}

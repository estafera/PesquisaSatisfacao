/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.ResultSet;

/**
 *
 * @author Ramon Honorio
 */
public class ManipulacaoSQL {
    static ConexaoSQL sql = new ConexaoSQL();
    
    static void imprimirPassageiros(){
        ResultSet result = sql.consulta(""
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
    
    static void inserirPassageiro(String nome, String cpf){
        sql.executar(
            "INSERT INTO [dbo].[T_PASSAGEIRO]\n" +
            "           ([ID_PASSAGEIRO]\n" +
            "           ,[NOME_COMPLETO]\n" +
            "           ,[CPF])\n" +
            "     VALUES\n" +
            "           (NEWID()\n" +
            "           ,'"+nome+"'\n" +
            "           ,'"+cpf+"')"
        );
    }
    
    
    
}

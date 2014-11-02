/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceAdmin;

import Database.*;
import Entidades.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramon Honorio
 */
public class Somatorias {
    private static ConexaoSQL sql = new ConexaoSQL();
    private static ResultSet result;
    
    public static int pessimo, ruim, regular, bom, total;
    public static float pessimoPorcent, ruimPorcent, regularPorcent, bomPorcent;
    
    public static void main(String[] args) {
        carregarSomatorias();
        calcularPorcentagens();
        imprimirClassificacaoNumero();
        imprimirClassificacaoPorcent();
        
    }
    
    public static void carregarSomatorias(){
        somatoriaPessimo();
        somatoriaRuim();
        somatoriaRegular();
        somatoriaBom();
        somatoriaTotal();
    }
    
    static void somatoriaPessimo(){
        result = sql.consulta(
                "SELECT COUNT(RESPOSTA) as 'qtd'\n" +
                "	FROM T_QUESTIONARIO\n" +
                "	WHERE RESPOSTA = 'Péssimo'"
        );
        
        try {
            result.next();
            pessimo = result.getInt("qtd");
        } catch (SQLException ex) {
            Logger.getLogger(Somatorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void somatoriaRuim(){
        result = sql.consulta(
                "SELECT COUNT(RESPOSTA) as 'qtd'\n" +
                "	FROM T_QUESTIONARIO\n" +
                "	WHERE RESPOSTA = 'Ruim'"
        );
        
        try {
            result.next();
            ruim = result.getInt("qtd");
        } catch (SQLException ex) {
            Logger.getLogger(Somatorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void somatoriaRegular(){
        result = sql.consulta(
                "SELECT COUNT(RESPOSTA) as 'qtd'\n" +
                "	FROM T_QUESTIONARIO\n" +
                "	WHERE RESPOSTA = 'Regular'"
        );
        
        try {
            result.next();
            regular = result.getInt("qtd");
        } catch (SQLException ex) {
            Logger.getLogger(Somatorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void somatoriaBom(){
        result = sql.consulta(
                "SELECT COUNT(RESPOSTA) as 'qtd'\n" +
                "	FROM T_QUESTIONARIO\n" +
                "	WHERE RESPOSTA = 'Bom'"
        );
        
        try {
            result.next();
            bom = result.getInt("qtd");
        } catch (SQLException ex) {
            Logger.getLogger(Somatorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void somatoriaTotal(){
        result = sql.consulta(
                "SELECT COUNT(RESPOSTA) as 'total'\n" +
                "	FROM T_QUESTIONARIO"
        );
        
        try {
            result.next();
            total = result.getInt("total");
        } catch (SQLException ex) {
            Logger.getLogger(Somatorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void calcularPorcentagens(){
        pessimoPorcent = pessimo * 100 / total;
        ruimPorcent = ruim * 100 / total;
        regularPorcent = regular * 100 / total;
        bomPorcent = bom * 100 / total;
    }
    
    static void imprimirClassificacaoPorcent(){
        System.out.println("------------ CLASSIFICAÇÃO GERAL (%) ------------");
        System.out.printf("Pessimo: %.1f%%\n", pessimoPorcent);
        System.out.printf("Ruim: %.1f%%\n", ruimPorcent);
        System.out.printf("Regular: %.1f%%\n", regularPorcent);
        System.out.printf("Bom: %.1f%%\n", bomPorcent);
    }
    
    static void imprimirClassificacaoNumero(){
        System.out.println("--- CLASSIFICAÇÃO GERAL (NUMERO DE SELEÇÕES) ---");
        System.out.println("Péssimo: "+pessimo);
        System.out.println("Ruim: "+ruim);
        System.out.println("Regular: "+regular);
        System.out.println("Bom: "+bom);
        System.out.println("Total: "+total);
    }
    
}

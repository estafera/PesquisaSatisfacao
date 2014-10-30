/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Ramon Honorio
 */
public class Pesquisa {
    private String id;
    private LocalDate data;
    
    /*  JAVA 8
    
        data = LocalDate.now();
        System.out.println(data);
        
        hora = LocalTime.now();
        System.out.println(hora);
    */

    public Pesquisa(String id, LocalDate data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    

}

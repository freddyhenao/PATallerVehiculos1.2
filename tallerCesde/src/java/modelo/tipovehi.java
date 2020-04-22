/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author freddy
 */
public class tipovehi implements Serializable {
    // Atributos - propiedades 
    private int idtv;
    private String nomtv;

    // se inserta codigo Getter y SeTTer
    public int getIdtv() {
        return idtv;
    }

    public void setIdtv(int idtv) {
        this.idtv = idtv;
    }

    public String getNomtv() {
        return nomtv;
    }

    public void setNomtv(String nomtv) {
        this.nomtv = nomtv;
    }
    
    //constructor vacio

    public tipovehi() {
        this.idtv= 0;
        this.nomtv="";
    }

   
    //constructor con parametros 

    public tipovehi(int idtv, String nomtv) {
        this.idtv = idtv;
        this.nomtv = nomtv;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Daniel
 */
public abstract class Producto {
    
    private final String nombre;
    private final Date fechacaducidad;
    private final int numeroLote;

    
    public Producto(String nombre, int agno, int mes, int dia , int numeroLote) {
        this.nombre = nombre;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        fechacaducidad = calendario.getTime();
        this.numeroLote = numeroLote;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public Date getFechacaducidad() {
        return fechacaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }
    
    public abstract String darDescripcion();
    
    
    
    
   
    
}

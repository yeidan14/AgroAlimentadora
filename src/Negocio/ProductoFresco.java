/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Daniel
 */
import java.util.Date;
import java.util.GregorianCalendar;

public class ProductoFresco extends Producto {

    private Date fechaenvasado;
    private String paisOrigen;

    public ProductoFresco(String nombre, int aFc, int mesfc, int diafc, int numeroLote, int afe, int mesfe, int diafe, String paisO) {
        super(nombre, aFc, mesfc, diafc, numeroLote);
        GregorianCalendar fe = new GregorianCalendar(afe, mesfe - 1, diafe);
        fechaenvasado = fe.getTime();
        paisOrigen = paisO;

    }

    @Override
    public String darDescripcion() {
       return "Este Producto Fresco:"+"\n"+"Nombre : " + super.getNombre() +"\n" +"Fecha Caducidad : " + super.getFechacaducidad()+"\n"
               +"N° Lote : "+super.getNumeroLote()+"\n"+ "Fecha Envasado : "+fechaenvasado+"\n"+"Pais Origen : "+paisOrigen;
    }

}

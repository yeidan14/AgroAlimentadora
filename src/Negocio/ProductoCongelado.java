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
public class ProductoCongelado extends Producto{
    
    
    private int temperatura;

    public ProductoCongelado(String nombre, int agno, int mes, int dia, int numeroLote ,int Tempera) {
        super(nombre, agno, mes, dia, numeroLote);
        temperatura=Tempera;
    }
    
    

    @Override
    public String darDescripcion() {
        return "Este Producto Congelado:"+"\n"+"Nombre : " + super.getNombre() +"\n" +"Fecha Caducidad : " + super.getFechacaducidad()+"\n"
               +"N° Lote : "+super.getNumeroLote()+"\n"+ "Temperatura : "+ temperatura;
    }
    
    
    
}

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
public class ProductoRefigerado extends Producto{
    
    
    private int codigoOrganismo;
    

    public ProductoRefigerado(String nombre, int agno, int mes, int dia, int numeroLote , int codigoO) {
        super(nombre, agno, mes, dia, numeroLote);
        codigoOrganismo=codigoO;
    }

    @Override
    public String darDescripcion() {
        return "Este Producto Refrigerado:"+"\n"+"Nombre : " + super.getNombre() +"\n" +"Fecha Caducidad : " + super.getFechacaducidad()+"\n"
               +"N° Lote : "+super.getNumeroLote()+"\n"+ "Codigo del Organismo : "+codigoOrganismo;
    }
    
    
    
}

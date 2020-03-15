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
public class TestProducto { 
    
    
    public static void main(String[] args) {
        
        Producto[] pro=new Producto[5];
        
        pro[0]=new ProductoFresco("papa", 2030, 10, 24, 2324, 2019, 12, 23, "Peru");
        pro[1]=new ProductoFresco("Fresas", 2019, 2, 28, 1213, 2017, 13, 1, "Italia");
        pro[2]=new ProductoRefigerado("Patilla", 2018, 28, 3, 1223, 1234);
        pro[3]=new ProductoCongelado("Cerdo", 2023, 4, 6, 1233, 24);
        pro[4]=new ProductoFresco("Tomate", 2021, 3, 23, 1234, 2021, 2, 1, "Argentina");
        
        for (Producto producto : pro) {
              System.out.println(producto.darDescripcion()+"\n");
        }
      
    }
    
}

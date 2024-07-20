/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principales.principal;

import java.util.ArrayList;

/**
 *
 * @author Informatica
 */
public class Principal {

    public static void main(String[] args) 
    {
        try
        {
            Cliente cl1 = new Cliente("Eduardo","1234567890","El plan","1234-5678");
            
            CategoriaProducto cp1 = new CategoriaProducto("Frutas",3);
            
            Producto pr1 = new Producto("Manzana",40.00,cp1,2);
            Producto pr2 = new Producto("Mango",30.00,cp1,2);
            
            Factura fac1 = new Factura(1,"2024",cl1);
            
            fac1.agregarProducto(pr1);
            fac1.agregarProducto(pr2);
            
            Principal total = new Principal();
            
            
            System.out.println("Total es "+ total.pagarFactura(fac1));
           
        }
        catch(Exception error1)
        {
            System.out.println(error1);
        }

        
        

    }
    double pagarFactura(Factura fact1)   
    {
        double total = 0;
       ArrayList<Producto> producto1 = fact1.getProducto();
        for(int i = 0; i < producto1.size(); i++)
        {
            Producto produc = producto1.get(i);
            total = total + (produc.getCantidad() * produc.getPrecio());
        }
        
        return total;
    }
}

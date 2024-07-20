/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principales.principal;

import java.util.ArrayList;

/**
 *
 * @author Informatica
 */
public class Factura 
{
    private int numero;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> producto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }
    
    

    public Factura(int numero, String fecha, Cliente cliente ) throws Exception
    {
         if(numero <=0)
            throw new Exception("El valor no puede ser menor que 1.");
        
        if(fecha.isEmpty())
            throw new Exception("La casilla no puede estar vacia.");
        
        if(cliente == null)
            throw new Exception("La casilla no puede estar vacia.");
        
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = new ArrayList();
    }
    
    
    
    void agregarProducto(Producto producto) throws Exception
    {
       if(producto == null)
           throw new Exception("La casilla no puede estar vacia.");
        
      this.producto.add(producto);
        
    }
}

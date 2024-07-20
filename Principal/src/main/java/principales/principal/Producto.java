/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principales.principal;

/**
 *
 * @author Informatica
 */
public class Producto 
{
    private String nombre;
    private double precio;
    private CategoriaProducto categoria;
    private int cantidad;

    public Producto(String nombre, double precio, CategoriaProducto categoria, int cantidad) throws Exception 
    {
        if(nombre.isEmpty())
            throw new Exception("La casilla no puede estar vacia.");
        
        if(precio <= 0)
            throw new Exception("El valor no puede ser menor que 1.");
        
        if(categoria == null)
            throw new Exception("La casilla no puede estar vacia.");
        
        if(cantidad <= 0)
            throw new Exception("El valor no puede ser menor que 1");
        
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    


}

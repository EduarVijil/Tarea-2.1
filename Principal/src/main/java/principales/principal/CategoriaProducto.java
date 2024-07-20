/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principales.principal;

/**
 *
 * @author Informatica
 */
public class CategoriaProducto 
{
    private String nombre;
    private int pasillo;

    

    public CategoriaProducto(String nombre, int pasillo) throws Exception
    {
        if(nombre.isEmpty())
            throw new Exception("La casilla no puede estar vacia.");
        
        if(pasillo <= 0)
            throw new Exception("El valor no puede ser menor que 1");
        
        this.nombre = nombre;
        this.pasillo = pasillo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }
    
}

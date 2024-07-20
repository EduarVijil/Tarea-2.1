/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principales.principal;

/**
 *
 * @author Informatica
 */
public class Cliente 
{
    private String nombre;
    private String rtn;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String rtn, String direccion, String telefono) throws Exception 
    {
        if(nombre.isEmpty())
            throw new Exception("La casilla no puede estar vacia.");
        
        if(rtn.isEmpty())
            throw new Exception("La casilla no puede estar vacia.");
        
        if(direccion.isEmpty())
            throw new Exception("La casilla no puede estar vacia.");
        
        if(telefono.isEmpty())
            throw new Exception("La casilla no puede estar vacia.");

        this.nombre = nombre;
        this.rtn = rtn;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
}

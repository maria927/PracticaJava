/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaagenda;

public class Contacto {
    
    
    private String nombre;
    private String telefono;
    private String correo;

    public Contacto(String nombre, String telefono, String correo)
    {
           
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    

    @Override
    public String toString() {
    return "nombre=" + nombre + ", telefono=" + telefono+ ", correo=" + correo;
    }
    
    
    
    
}

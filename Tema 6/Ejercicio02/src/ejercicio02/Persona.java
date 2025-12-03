/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alumno
 */
public abstract class Persona {
    private String nombre;
    
    public Persona (){
        this.nombre = "";    
    }
    
    public Persona (String nombre){
        this.nombre = nombre;    
    }
    
    public String getNombre(){
        return this.nombre;    
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;     
    }
    
    public abstract String saludar ();
    
    @Override    
    public String toString (){    
        return "Mi nombre es " + nombre;
    }
}

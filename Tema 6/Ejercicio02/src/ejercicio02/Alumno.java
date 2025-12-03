/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{
    public String grupo;
    
    public Alumno (){
        super();
        this.grupo = "";    
    }
    
    public Alumno (String nombre, String grupo){
        super(nombre);
        this.grupo = grupo;        
    }
    
    public String getGrupo(){
        return this.grupo;
    }
    
    public void setGrupo (String grupo) {
        this.grupo = grupo;    
    }
    @Override
    public String saludar(){
        return "Hola, soy el alumno " + getNombre() + " y pertenezco al grupo " + grupo;    
    }
    
    @Override
    public String toString (){
    
    return "";
    }
    
    
}

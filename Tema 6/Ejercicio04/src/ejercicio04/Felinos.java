/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public abstract class Felinos extends Animal{
     public Felinos() {
        super();
    }
    
    public Felinos (String nombre,float peso, int edad){
        super(nombre,peso,edad);    
    }
    
    
    @Override   
    public String toString () {
        return super.toString();
    }
    
    
}

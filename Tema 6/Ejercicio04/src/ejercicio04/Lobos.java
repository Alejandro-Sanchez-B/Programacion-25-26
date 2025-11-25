/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public class Lobos extends Canidos {
    public Lobos() {
        super();
    }
    
    public Lobos (String nombre,float peso, int edad){
        super(nombre,peso,edad);    
    }
    
    @Override
    public  void sonido(){
        System.out.println("El lobo aulla");    
    }
    @Override
    public void alimentacion(){
        System.out.println("El lobo es carnívoro");
    }
    @Override
    public void habitat(){
        System.out.println("Su habitat es el bosque");
    }
    @Override
    public void nombreCientifico(){
        System.out.println("El nombre científico del lobo es Canis lupus");
    }
    @Override   
    public String toString () {
        return super.toString();
    }
}

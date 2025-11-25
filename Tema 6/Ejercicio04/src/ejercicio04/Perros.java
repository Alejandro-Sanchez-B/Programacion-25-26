/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public class Perros extends Canidos {
    
    public Perros() {
        super();
    }
    
    public Perros (String nombre,float peso, int edad){
        super(nombre,peso,edad);    
    }
    
    @Override
    public  void sonido(){
        System.out.println("El perro ladra");    
    }
    @Override
    public  void alimentacion(){
        System.out.println("El perro es carnívoro");
    }
    @Override
    public  void habitat(){
        System.out.println("Su habitat es doméstico");
    }
    @Override
    public  void nombreCientifico(){
        System.out.println("El nombre científico del perro es Canis lupus familiaris");
    }
    @Override   
    public String toString () {
        return super.toString();
    }
}

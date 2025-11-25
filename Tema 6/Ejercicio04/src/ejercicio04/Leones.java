/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public class Leones extends Felinos {
    public Leones() {
        super();
    }
    
    public Leones (String nombre,float peso, int edad){
        super(nombre,peso,edad);    
    }
    
    @Override
    public  void sonido(){
        System.out.println("El león ruge");    
    }
    @Override
    public void alimentacion(){
        System.out.println("El león es carnívoro");
    }
    @Override
    public void habitat(){
        System.out.println("Su habitat es la sabana");
    }
    @Override
    public void nombreCientifico(){
        System.out.println("El nombre científico del león es Panthera leo");
    }
    @Override   
    public String toString () {
        return super.toString();
    }
}


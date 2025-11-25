/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public abstract class Animal {
    private String nombre;
    private float peso;
    private int edad;
    
    public Animal (){
        this.nombre = "";
        this.peso = 0;
        this.edad = 0;
    }
    
    public Animal (String nombre,float peso, int edad ){
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }
    
    public String getNombre () {
        return this.nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;    
    }
    
    
     public float gePeso () {
        return this.peso;
    }
    
    public void setPeso (float peso) {
        this.peso = peso;   
    }
     public int getEdad () {
        return this.edad;
    }
    
    public void setEdad (int edad) {
        this.edad = edad;    
    }
    public abstract void sonido();
    public abstract void alimentacion();
    public abstract void habitat();
    public abstract void nombreCientifico();
    
    @Override   
    public String toString () {
    
        return "Nombre: " + this.nombre + " Peso: " + this.peso + " Edad: " + this.edad;
    }
}

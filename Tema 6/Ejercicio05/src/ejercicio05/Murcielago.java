/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador{
    private float altura;
    
    public Murcielago (){
        super();
        this.altura = 0;    
    }
    
    public Murcielago (String nombre,String sexo,String color,int edad, float altura){
        super(nombre,sexo,color,edad);
        this.altura = altura;    
    }
     public float getAltura() {
        return this.altura;
    }
    
    public void setAltura (float altura) {
        this.altura = altura;    
    }
    
    @Override
    public void obtenerMensajeVolador(){
        System.out.println("El murciélago es un animal volador");    
    }
    
    @Override
    public void aumentarAlturaVuelo(){
        altura+= 5;
    }
    
    @Override
    public void bajarAlturaVuelo(){
        altura-= 5;
    }
    @Override
    public void mostrarAlturaVuelo(){
        System.out.println(" Altura: " + this.altura + "m");    
    }
    
    @Override   
    public String toString () {
        return super.toString()+ " Altura: " + this.altura + "m";
    }
}

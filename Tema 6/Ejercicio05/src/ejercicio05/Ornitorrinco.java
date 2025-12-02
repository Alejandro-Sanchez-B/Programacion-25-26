package ejercicio05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Ornitorrinco extends Mamifero implements Oviparo{
    
    private int huevos;
    
    public Ornitorrinco (){
        super();
        this.huevos = 0;    
    }
    
    public Ornitorrinco (String nombre,String sexo,String color,int edad, int huevos){
        super(nombre,sexo,color,edad);
        this.huevos = huevos;    
    }
     public int getHuevos () {
        return this.huevos;
    }
    
    public void setHuevos (int huevos) {
        this.huevos = huevos;    
    }
    
    @Override
    public void obtenerMensajeOviparo(){
        System.out.println("El ornitorrinco es un mamífero ovíparo");   
    }
    @Override
    public void ponerHuevo(){
        huevos += 1;
    }
    
    @Override
    public void incubarHuevo(){
        huevos -= 1;
    }
    @Override
    public void mostrarNumHuevos(){
        System.out.println(" Numero de huevos: " + this.huevos);
    }
    
    @Override   
    public String toString () {
        return super.toString() + " Numero de huevos: " + this.huevos;
    }
}

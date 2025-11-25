/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Coche {
   
   //Atributos. Nunca se inicializan aqui
   private String marca;
   private String modelo;
   private String color;
   private int velocidad;
   private boolean motorEncendido;

   //Constructores
    public Coche (){
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
        this.motorEncendido = false;        
       }
    
    public Coche(String marca, String modelo, String color, int velocidad, boolean motorEncendido){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.motorEncendido = motorEncendido;         
    } 
    
    //Getters y Setters
    public String getMarca (){
        return this.marca;
    
    }
    public String getModelo (){
        return this.modelo;
    }
    public String getColor (){
        return this.color;
    }
    public int getVelocidad (){
        return this.velocidad;
    }
    public boolean getMotorEncendido (){
        return this.motorEncendido;
    
    }
    
    public void setMarca (String marca){
        this.marca = marca;
    }
     public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public void setColor (String color){
        this.color = color;
    }
     public void setVelocidad (int velocidad){
        this.velocidad = velocidad;
    }
     public void setMotorEncendido (boolean motorEncendido){
        this.motorEncendido = motorEncendido;  
    }
     //Métodos
    public void arrancarCoche(){
        this.motorEncendido = true;
        this.velocidad = 10;    
    }
    public void apagarCoche(){
        this.motorEncendido = false;
        this.velocidad = 0;
    }
    public void acelerarCoche(){
        this.velocidad = velocidad + 20;
    }
    public void frenarCoche(){
        this.velocidad = velocidad - 6;
    }
    public void obtenerEstado(){
    
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(color);
        System.out.println(velocidad);
        System.out.println(motorEncendido);
    
    }
    
    @Override
    public String toString(){
    
        return "Vehiculo: " + marca + " marca" + modelo + " modelo" + color + " color" + velocidad + " kilometros por hora" + motorEncendido + " está el motor";
        
    }
    
}

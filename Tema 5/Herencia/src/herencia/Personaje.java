/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author alumno
 */
public class Personaje {
    //Atributos
    public int vida;
    
    //Constructores
    
    public Personaje(){
        this.vida = 100;    
    }
    
    public Personaje (int vida) {
        this.vida = vida;
    
    }
    
    //Getters y Setters
    
    public int getVida() {
        return this.vida;
    
    }
    
    public void setVida (int vida) {
    
        this.vida = vida;
    
    }
    
    
    //Métodos
    
    public void atacar (){
        System.out.println("Atacando...");
    
    }
    //To String
    @Override
    public String toString(){
    
        return "El personaje tiene " + vida + "% de vida";
    }
    
}

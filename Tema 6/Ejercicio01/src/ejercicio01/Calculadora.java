/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    private float numero;
    
    public Calculadora (){
        this.numero=0;    
    }
    
    public Calculadora (float numero){
        this.numero=numero;    
    }
    
    public float getNumero () {
        return this.numero;
    }
    
    public void setNumero (float numero) {
        this.numero = numero;    
    }
    
    public abstract void realizarOperacion();
    
    @Override   
    public String toString () {
    
        return "El numero es " + numero;
    }
}

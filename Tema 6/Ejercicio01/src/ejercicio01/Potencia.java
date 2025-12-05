/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Potencia extends Calculadora{
    private float exponente;
    
    
    public Potencia(){
        super();
        this.exponente = 0;
        
    }
    
    public Potencia (float numero, float exponente){
        super(numero);
        this.exponente = exponente;
    }
    public float getPotencia () {
        return this.exponente;
    }
    
    public void setPotencia (float exponente) {
        this.exponente = exponente;    
    }
    @Override
    public void realizarOperacion() {
        float resultado;
        resultado = (float)Math.pow(super.getNumero(), this.exponente);
        System.out.println("el resultado de " + super.getNumero() + " elevado a " + this.exponente + " es " + resultado);
    }
    @Override   
    public String toString () {
    
        return "El numero es " + this.exponente;
    }
    

    
}

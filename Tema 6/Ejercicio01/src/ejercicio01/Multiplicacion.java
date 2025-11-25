/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Multiplicacion extends Calculadora{
    private float multiplicador;
    
    
    public Multiplicacion (){
        super();
        this.multiplicador = 0;
        
    }
    
    public Multiplicacion (float numero, float multiplicador){
        super(numero);
        this.multiplicador = multiplicador;
    }
    public float getMultiplicacion () {
        return this.multiplicador;
    }
    
    public void setMultiplicacion (float multiplicador) {
        this.multiplicador = multiplicador;    
    }
    @Override
    public void realizarOperacion() {
        float resultado;
        resultado = super.getNumero() * this.multiplicador;
        System.out.println("La multiplicacion de " + super.getNumero() + " * " + this.multiplicador + " es igual a " + resultado);
    }
    @Override   
    public String toString () {
    
        return "El numero es " + this.multiplicador;
    }
}

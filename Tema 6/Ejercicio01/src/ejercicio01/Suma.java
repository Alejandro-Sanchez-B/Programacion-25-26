/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora{
    private float sumando;
    
    
    public Suma (){
        super();
        this.sumando = 0;
        
    }
    
    public Suma (float numero, float sumando){
        super(numero);
        this.sumando = sumando;
    }
    public float getSumando () {
        return this.sumando;
    }
    
    public void setSumando (float sumando) {
        this.sumando = sumando;    
    }
    
    @Override
    public void realizarOperacion() {
        float resultado;
        resultado = super.getNumero()+ this.sumando;
        System.out.println("La suma de " + super.getNumero() + " + " + this.sumando + " es igual a " + resultado);
    }
    
    @Override
    public String toString () {
    return "El sumando es " + sumando;
    }
}

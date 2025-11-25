/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio023;

/**
 *
 * @author alumno
 */
public class Autobus extends Vehiculo {
    
    //Atributos
    private int numerPlazas;
    //Constructores
    public Autobus(){
        super();
        this.numerPlazas = 0;
    }
    
    public Autobus(String matricula, String modelo, int potenciaCV,int numerPlazas){
        super(matricula, modelo, potenciaCV);
        this.numerPlazas = numerPlazas;
    }
    //Getters y Setters
    
    public int getNumerPlazas (){
        return this.numerPlazas;    
    }
    
    public void setNumerPlazas (int numerPlazas) {
        this.numerPlazas = numerPlazas;
    }
    
    @Override
    public String toString(){
        return super.toString() + "y Numero de plazas " + numerPlazas;
    }
}

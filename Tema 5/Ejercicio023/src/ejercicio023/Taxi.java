/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio023;

/**
 *
 * @author alumno
 */
public class Taxi extends Vehiculo{
    //Atributos
    private int numeroLicencia;
    
    //Constructores
    public Taxi() {
        super();
        this.numeroLicencia = 0;
    }
    
    public Taxi(String matricula, String modelo, int potenciaCV, int numeroLicencia) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    
    }
    
    //Getter y Setter
    
    public int getNumeroLicencia (){
        return this.numeroLicencia;
    }
    
    public void setNumeroLicencia (int numeroLicencia){
         this.numeroLicencia = numeroLicencia;    
    }
    
    @Override
    public String toString(){
        return super.toString() + "y Numero licencia " + numeroLicencia;
    }
}

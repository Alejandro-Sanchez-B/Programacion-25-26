/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Cuenta {
    private String titular;
    private double dinero;
    
    public Cuenta() {
        this.titular = "";
        this.dinero = 0.0f;
    }

    public Cuenta(String titular, double dinero) {
        this.titular = titular;
        this.dinero = dinero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    public static double pedirCantidad(){
        Scanner entrada = new Scanner (System.in);
        return entrada.nextDouble();    
    }
    
    public  void ingresarDinero(){
        double ingreso = pedirCantidad(); 
        System.out.println("Introduzca la cantidad a ingresar");
        if(ingreso > 0 ){
           this.dinero += ingreso;
        
        }
    
    }
    
    public void retirarDinero() {
            double retirar = pedirCantidad();
        if (this.dinero - retirar < 0) {
            this.dinero = 0;
        } else {
            this.dinero -= retirar;
        }
    }
    
    

    @Override
     public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + dinero +
                '}';
    }
    
    
}

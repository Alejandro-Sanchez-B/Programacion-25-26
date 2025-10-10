/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio032;
import java.util.Scanner;//Importamos la clase Scanner
/**
 *
 * @author alumno
 */
public class Ejercicio032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Creamos el metodo de entrada de datos
        System.out.println("Introduzca la cantidad de dinero a calcular"); //Solicitamos al usuario la cantidad de dinero
        int dinero = entrada.nextInt(); //Creamos la variable de almacenamiento del dinero
        int billetes50 = dinero/50; //Dividimos la cantidad introducida por el usuario entre 50
        int billetes20 = (dinero % 50)/20; //Sacamos el resto de la division anterior y lo dividimos por el valor del billete de 20
        int billetes10 = (dinero % 20)/10;//Sacamos el resto de la division anterior y lo dividimos por el valor del billete de 10
        int billetes5 = (dinero % 10)/5;//Sacamos el resto de la division anterior y lo dividimos por el valor del billete de 5
        int monedas2 = (dinero % 5)/2;//Sacamos el resto de la division anterior y lo dividimos por el valor de las monedas de 2
        int monedas1 = (dinero % 2);//Sacamos el resto de la division anterior y lo dividimos por el valor de las monedas de 1
        
        
        System.out.println("El monto de billetes es: " 
                + billetes50 + " billetes de 50, " + billetes20 
                + " billetes de 20, " + billetes10 + " billetes de 10, " 
                + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 euros y " 
                + monedas1 + " monedas de 1 euro");
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio032;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dinero a calcular");
        int dinero = entrada.nextInt();
        int billetes50 = dinero/50;
        int billetes20 = (dinero % 50)/20;
        int billetes10 = (dinero % 20)/10;
        int billetes5 = (dinero % 10)/5;
        int monedas2 = (dinero % 5)/2;
        int monedas1 = (dinero % 2);
        
        
        System.out.println("El monto de billetes es: " 
                + billetes50 + " billetes de 50, " + billetes20 
                + " billetes de 20, " + billetes10 + " billetes de 10, " 
                + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 euros y " 
                + monedas1 + " monedas de 1 euro");
        
    }
    
}

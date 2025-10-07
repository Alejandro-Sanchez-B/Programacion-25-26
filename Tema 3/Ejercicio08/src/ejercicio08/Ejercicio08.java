/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dinero a calcular");
        int dinero = entrada.nextInt();
        int billetes50 = dinero/50;
        int billetes20 = (dinero % 50)/20; //Sacamos el resto de la division anterior y lo dividimos por el valor del billete
        int billetes10 = (dinero % 20)/10;
        int billetes5 = (dinero % 10)/5;
        int monedas2 = (dinero % 5)/2;
        int monedas1 = (dinero % 2);
        
        System.out.println("El monto de billetes es: ");
                
        if (billetes50 > 0) {
            System.out.println(billetes50 + " Billetes de 50 ");
        }
        if (billetes20 > 0) {
            System.out.println(billetes20 + " Billetes de 20 ");
        }
        if (billetes10 > 0) {
            System.out.println(billetes10 + " Billetes de 10 ");
        }
        if (billetes5 > 0) {
            System.out.println(billetes5 + " Billetes de 5 ");
        }
        if (monedas2 > 0) {
            System.out.println(monedas2 + " Monedas de 2 ");
        }
        if (monedas1 > 0) {
            System.out.println(monedas1 + " Monedas de 1 ");
        }
    }
    
}

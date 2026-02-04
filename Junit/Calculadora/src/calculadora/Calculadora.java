/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
    System.out.println("Por favor, introduzca dos numeros ");
    float num1 = entrada.nextFloat();
    float num2 = entrada.nextFloat();
    
    float suma = num1 + num2;
    float resta = num1 - num2;
    float multi = num1 * num2;
    float dividir = num1 / num2;
    
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(dividir);
    
    }
    
}

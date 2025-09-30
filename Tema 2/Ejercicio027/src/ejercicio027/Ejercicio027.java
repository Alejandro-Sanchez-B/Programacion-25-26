/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio027;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio027 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float num1, cuadrado, cubo;
        System.out.println("Introduzca el numero a calcular");
        num1=entrada.nextFloat();
        
        cuadrado = num1 * num1;
        cubo = num1 * num1 * num1;
        
        System.out.println("El cuadrado de " + num1 + " es: " + cuadrado);
        System.out.println("El cubo de " + num1 + " es: " + cubo) ;
    }
    
}

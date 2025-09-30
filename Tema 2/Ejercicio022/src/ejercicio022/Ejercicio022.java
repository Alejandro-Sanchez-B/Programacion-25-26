/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio022;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el lado de un triangulo equilatero");
        float lado = entrada.nextFloat();
        float area = (float)(Math.sqrt(3)/4)* (lado * lado);
        float perimetro = (lado *3)/2;
        System.out.println("El area de un triangulo cuyo lado es " + lado + " es igual a " + area);
        System.out.println("El perimetro de un triangulo cuyo lado es " + lado + " es igual a " + perimetro);
    }
    
}

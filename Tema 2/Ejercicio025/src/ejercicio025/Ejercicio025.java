/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio025;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        float num1 = entrada.nextFloat();
        System.out.println("Introduzca el segundo numero");
        float num2 = entrada.nextFloat();
        System.out.println("Introduzca el tercer numero");
        float num3 = entrada.nextFloat();
        
        float suma = num1 + num2 + num3;
        float producto = num1 * num2 * num3;
        
        System.out.println("La suma de los numeros introducidos es: " + suma);
        System.out.println("El producto de los numeros introducidos es: " + producto);
    }
    
}

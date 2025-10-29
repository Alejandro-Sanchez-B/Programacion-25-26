/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1, num2,num3, resultado;
        
        Scanner entrada = new Scanner (System.in); //Declaramos un objeto de entrada de datos
        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextFloat();
        System.out.println("Introduzca el segundo numero");
        num2 = entrada.nextFloat();
        System.out.println("Introduzca el tercer numero");
        num3 = entrada.nextFloat();
        
        resultado = Ordenacion.Ordenar(num1, num2, num3);
        System.out.println("El numero menor es: " + resultado); 
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       float num1, num2, resultado;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Introduce el primer numero");
       num1 = entrada.nextFloat();
       System.out.println("Introduce el segundo numero");
       num2 = entrada.nextFloat();
       
       if(num1 > 10){
           resultado = Operaciones.multiplicacion(num1,num2);
           System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es igual a : " + resultado);
       }else{
       
        resultado = Operaciones.suma(num1, num2);
         System.out.println("La suma de " + num1 + " + " + num2 + " es igual a : " + resultado);
       }
    }
    
}

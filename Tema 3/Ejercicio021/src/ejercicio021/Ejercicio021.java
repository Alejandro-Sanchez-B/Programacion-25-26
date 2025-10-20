/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio021;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1,num2, resultado;
        boolean correcto = true;
        Scanner entrada = new Scanner(System.in);
        do {
        
            try {
                System.out.println("Introduzca el primer numero");
                num1 = entrada.nextInt();
                
                System.out.println("Introduzca el segundo numero");
                num2 = entrada.nextInt();
                
                resultado = num1 / num2;
                System.out.println("La division entre " + num1 + " y " + num2 + " es igual a " + resultado);


            }catch (ArithmeticException e){
                System.out.println("Introduce un numero distinto a 0");
                correcto = false;
            }
         } while(correcto == false);
    }
}

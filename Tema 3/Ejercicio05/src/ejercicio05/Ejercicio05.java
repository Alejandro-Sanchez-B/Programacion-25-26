/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca el numero a comprobar");
        num = entrada.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
        
    }
    
}

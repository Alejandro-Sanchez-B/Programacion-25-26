/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio017;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float raiz, resultado;
        Scanner entrada = new Scanner(System.in);  
        do {
            
            
           System.out.println("Introduce el numero para calcular su raiz cuadrada");
           raiz = entrada.nextFloat();
           if (raiz < 0){
           
           
               System.out.println("Introduce un numero positivo ");
           
           }
        }while(raiz < 0);
         
           resultado = (float)(Math.sqrt(raiz));
           System.out.println("La raiz cuadrada de " + raiz + " es " + resultado);
           
        
    }
    
}

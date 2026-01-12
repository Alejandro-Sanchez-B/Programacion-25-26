/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio01 {
    
    
    /**
     * @param numeros
     */
    
    public static void rellenarArray (int numeros []) {
        Scanner entrada = new Scanner (System.in);
        int i, numero;
        System.out.println("Por favor, introduzca 10 números");
        for (i = 0; i < numeros.length; i++){
            numero = entrada.nextInt();
            numeros[i] = numero;        
        }
    }
   public static void mostrarArray (int numeros []){
       for (int numero : numeros){
           if (numero % 2 == 0) {
               System.out.println("El número " + numero + " es par");           
           }
       }
    
    
   
   }  
    
    public static void main(String[] args) {
       int [] numeros = new int [10];
       
       rellenarArray(numeros);
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");
       mostrarArray(numeros);
    }
    
}

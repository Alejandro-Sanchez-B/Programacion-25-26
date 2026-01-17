/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio03 {

    public static int pedirLongitudArray() {
    Scanner entrada = new Scanner(System.in);
    int longitud = 0;
    boolean valido = false;

    do {
        try {
            System.out.print("Introduce la longitud del array (entre 1 y 10): ");
            longitud = entrada.nextInt();

            if (longitud >= 1 && longitud <= 10) {
                valido = true;
            } else {
                System.out.println("Error: el número debe estar entre 1 y 10.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir un número entero.");
            entrada.next(); // Limpia el buffer del scanner
        }

    } while (!valido);

    return longitud;
}
    
    
    public static void rellenarArray (int numeros []) {
        int i;
        for (i = 0; i < numeros.length; i++){
            
            numeros[i] = (int)(Math.random()*6+1);        
        }
    
    }
    
    public static void mostrarArray (int numeros []){
       for (int numero : numeros){
           
          System.out.println(numero); 
       }
    }
    
    
    
    
    public static void main(String[] args) {
       
       int longitudarray = pedirLongitudArray();
       int [] numeros = new int [longitudarray];
       rellenarArray(numeros);
       mostrarArray(numeros);      
       
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Alex
 */
public class Ejercicio06 {
    
   
    public static boolean esPrimo(int num){
        boolean primo = true;
        int i = 2;

        if (num < 2) {
            primo = false;
        }

        while ((i < (num / 2)) && (primo == true)) {
            if ((num % i) == 0) {  
                primo = false;
            }
            i++; 
        }

        return primo;
    }
 public static void rellenarArray (int numerosprimos []) {
        
        int numero = 2; 

        for (int i = 0; i < numerosprimos.length; ) {
            if (esPrimo(numero)) {
                numerosprimos[i] = numero;
                i++; 
            }
            numero++; 
        }
    }
 public static void mostrarArray (int numerosprimos []){
       for (int numero : numerosprimos) {
            System.out.println(numero);
        }
    }
    
 
    public static void main(String[] args) {
        int [] numerosprimos = new int [80];
        rellenarArray(numerosprimos);
        mostrarArray(numerosprimos);
    }
    
}

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

    public static void rellenarArray (int numeros []) {
        Scanner entrada = new Scanner (System.in);
        int i, numero;
        System.out.println("Por favor, introduzca 7 números");
        for (i = 0; i < numeros.length; i++){
            numero = entrada.nextInt();
            numeros[i] = numero;        
        }
    }
    
    public static void mostrarArray (int numeros []){
       for (int numero : numeros){
           
          System.out.println(numero); 
       }
    }
    
    public static void intercambiarPosiciones(int numeros []){
        int aux;
                 
            aux = numeros[1];
            numeros[1] = numeros[3];
            numeros[3] = aux;
           
           
    }
    public static void main(String[] args) {
        int [] numeros = new int [7];
        
        rellenarArray(numeros);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        mostrarArray(numeros);
        intercambiarPosiciones(numeros);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        mostrarArray(numeros);
    }
    
}

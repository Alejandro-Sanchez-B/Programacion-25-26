/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Metodos {
    public static int pedirNumero (){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un numero entero positivo");
        return entrada.nextInt();    
    }
    
    public static void insertarNumeros (ArrayList <Integer> numeros){
        boolean comprobar = false;
        int numero;
        System.out.println("Para salir del programa, introduzca un numero negativo");
        do {
            numero = pedirNumero();
            if (numero >= 0){
                comprobar = true;
                numeros.add(numero);            
            }else {
                System.out.println("Saliendo...");
                comprobar = false;
            
            }
        
        
        }while (comprobar);
        
    
    }
    public static void mostrarArrayList (ArrayList <Integer> numeros){
        System.out.println("");
        System.out.print("La lista de numeros es: ");
        for(Integer numero : numeros){
            System.out.print(numero + " ");        
        }
    }
    
    public static void sumar (ArrayList <Integer> numeros) {
        int suma = 0;
               
        for (Integer numero : numeros){
            suma+= numero;
        }
        System.out.println("La suma de todos los numeros es: " + suma);
    }
    
    public static void mayor (ArrayList <Integer> numeros){
        int mayor = numeros.get(0);
        
        for(Integer numero : numeros){
            if (mayor < numero){
                mayor = numero;            
            }
        
        }
        System.out.println("El numero mayor es: " + mayor);
    
    
    }
    public static void menor (ArrayList <Integer> numeros){
        int menor = numeros.get(0);
        
        for(Integer numero : numeros){
            if (menor > numero){
                menor = numero;            
            }
        
        }
        System.out.println("El numero menor es: " + menor);
    
    
    }
}

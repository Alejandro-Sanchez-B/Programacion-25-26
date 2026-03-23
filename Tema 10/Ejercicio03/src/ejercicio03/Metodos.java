/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Metodos {
    public static void insertar(ArrayList <Integer> numeros){
        boolean comprobar = false;
        String opcion;
        int numero;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("¿Desea introducir un número? Y/N");
            opcion = entrada.nextLine();
            if(opcion.equalsIgnoreCase("y")){
                
                System.out.println("Introduzca el número");
                numero = Integer.parseInt(entrada.nextLine());;
                numeros.add(numero);
                comprobar = true;
            
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
    public static void intercambiarPosiciones(ArrayList <Integer> numeros){
      if (numeros.size() >= 4) {
        int aux = numeros.get(1);
        numeros.set(1, numeros.get(3));
        numeros.set(3, aux);
    } else {
        System.out.println("La lista necesita al menos 4 números para intercambiar.");
        }
    }
}

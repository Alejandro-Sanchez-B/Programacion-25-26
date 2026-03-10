/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

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
    
    
    public static boolean buscarRepetido(ArrayList <Integer> numeros, int num, int posicion){
        int i;
        boolean encontrado = false;
        i = posicion;
        while((i < numeros.size())&&(!encontrado)){
            if  (numeros.get(i) == num){  
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    
     public static void cambiarPorCeros(ArrayList <Integer> numeros){
        int i, j, num;
        boolean repetido;
        for(i = 0;i < numeros.size();i++){
            if  (numeros.get(i) != 0){
                num = numeros.get(i);
                //Llamo al buscarRepetido con el vector y el número a buscar
                repetido = buscarRepetido(numeros, num, i + 1);
                if  (repetido){
                    for(j = i;j < numeros.size();j++){
                        if  (numeros.get(j) == num){
                            numeros.set(j, 0);
                        }
                    }
                }
            }
        }
    }
}

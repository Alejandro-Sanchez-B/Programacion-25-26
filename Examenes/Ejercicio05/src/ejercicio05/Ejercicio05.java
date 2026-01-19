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
    
    public static void rellenarMatriz (int numeros [] []){
        Scanner entrada = new Scanner (System.in);
        
        for (int i = 0 ; i < numeros.length; i++){
            for(int j = 0 ; j < numeros[0].length; j++){
                System.out.println("Introduzca un número");
                numeros[i][j] = entrada.nextInt();
                System.out.println(" ");
            }
        
        }
    
    }

    public static void mostrarMatriz (int numeros[][]){
        for (int i = 0; i < numeros.length; i++){
            
            for(int j = 0; j < numeros[0].length; j++){
                
                System.out.print(numeros[i][j] + " ");
                   
                
            }
        System.out.println("");
        }
    
    
    }
     
    public static int sumarMatriz (int numeros [][]){
     int suma = 0;
    for (int i = 0; i < numeros.length; i++){
            
            for(int j = 0; j < numeros[0].length; j++){             
              suma += numeros[i][j];        
                
            }
         }
    
    return suma;
    }
    
    public static int mayorMatriz(int numeros [][]) {
        int mayor = numeros [0][0];
        for (int i = 0; i < numeros.length; i++){
            
            for(int j = 0; j < numeros[0].length; j++){             
              if (mayor < numeros[i][j]){
                  mayor = numeros[i][j];
              
              }        
                
            }
         }
        
        return mayor;
    
    }
    
    public static int menorMatriz(int numeros [][]) {
        int menor = numeros [0][0];
        for (int i = 0; i < numeros.length; i++){
            
            for(int j = 0; j < numeros[0].length; j++){             
              if (menor > numeros[i][j]){
                  menor = numeros[i][j];
              
              }        
                
            }
         }
        
        return menor;
    
    }
    
    
    public static void main(String[] args) {
        int numeros [] [] = new int [4][2];
        rellenarMatriz(numeros);
        mostrarMatriz(numeros);
        System.out.println("  ");
        System.out.println("La suma de todos los números es " + sumarMatriz(numeros));
        System.out.println("El mayor de todos los números es " + mayorMatriz(numeros));
        System.out.println("El menor de todos los números es " + menorMatriz(numeros));
    }
    
}

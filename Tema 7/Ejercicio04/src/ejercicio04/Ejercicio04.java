/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author Alex
 */
public class Ejercicio04 {

    public static void rellenarMatriz (int numerosaleatorios[][]){
        for (int i = 0; i < numerosaleatorios.length; i++){
            
            for(int j = 0; j < numerosaleatorios[0].length; j++){
                numerosaleatorios[i][j] = (int)(Math.random() * 101 + 100);            
            }
        
        }
    
    
    }
    
    public static void mostrarMatriz (int numerosaleatorios[][]){
        for (int i = 0; i < numerosaleatorios.length; i++){
            
            for(int j = 0; j < numerosaleatorios[0].length; j++){
                if (numerosaleatorios[i][j] % 2 == 0) {
                System.out.print(numerosaleatorios[i][j] + " ");
                }   
                
            }
        System.out.println("");
        }
    
    
    }
    
    public static void main(String[] args) {
        int numerosaleatorios [] [] = new int [4][3]; 
        rellenarMatriz(numerosaleatorios);
        mostrarMatriz(numerosaleatorios);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio010;

/**
 *
 * @author Alex
 */
public class Ejercicio010 {

    public static void rellenarArray (int random []) {
        
        for (int i = 0; i < random.length; i++){
            
            random[i] = (int)(Math.random()*8+1);        
        }
    
    }
    
    public static void mostrarArray (int random []){
       for (int numero : random){
           
          System.out.print(numero); 
           System.out.print(" ");
       }
        System.out.println("  ");
    }
    public static void sustituirNumeros(int[] random) {
    for (int i = 0; i < random.length; i++) {
        for (int j = i + 1; j < random.length; j++) {
            if (random[i] == random[j]) {
                random[j] = 0;
            }
        }
    }
}

    
    
    public static void main(String[] args) {
        int random [] = new int [10];
        
        rellenarArray(random);
        mostrarArray(random);
        sustituirNumeros(random);
        mostrarArray(random);
    }
    
}

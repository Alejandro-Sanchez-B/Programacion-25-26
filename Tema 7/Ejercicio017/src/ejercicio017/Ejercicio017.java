/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio017;

/**
 *
 * @author Alex
 */
public class Ejercicio017 {

     public static void rellenarArray (int ordenados []) {
        int i;
        for (i = 0; i < ordenados.length; i++){
            
            ordenados[i] = (int)(Math.random()*10);        
        }
    
    }
     public static void mostrarArray (int ordenados []){
       for (int ordenado : ordenados){
           
          System.out.print(ordenado + " "); 
       }
    }
     
     
     public static void ordenarArray(int ordenados []){
         int aux;
         for(int i = 0; i < ordenados.length ; i++){
             for(int j = 0; j < ordenados.length -1; j++){
                 if(ordenados[j] > ordenados [j + 1]){
                     aux = ordenados[j];
                     ordenados[j] = ordenados [j + 1];
                     ordenados [j + 1] = aux;
                 
                 }
             
             }
         
         }
     
     }
     
    public static void main(String[] args) {
        int ordenados [] = new int [10];
        rellenarArray(ordenados);
        System.out.println("Los numeros sin ordenar son: " );
        mostrarArray(ordenados);
        ordenarArray(ordenados);
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Los numeros ordenados son: " );
        mostrarArray(ordenados);
    }
    
}

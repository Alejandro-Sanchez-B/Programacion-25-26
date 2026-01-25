/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio018;

/**
 *
 * @author Alex
 */
public class Ejercicio018 {
    public static void rellenarArray(int primero [], int segundo []){
         for (int i = 0; i < primero.length; i++){
            
            primero[i] = (int)(Math.random()*10+1);
            segundo[i] = (int)(Math.random()*10+1);
        }
    }
            
                    
        
    
    public static void mostrarArray (int primero [], int segundo []){
        System.out.println("Array primero:");
    for (int i = 0; i < primero.length; i++){
        System.out.print(primero[i] + " ");
    }

    System.out.println("\nArray segundo:");
    for (int i = 0; i < segundo.length; i++){
        System.out.print(segundo[i] + " ");
    }
    }
       
    public static int [] llenaryOrdenarArray  (int primero [], int segundo []){
       int total [] = new int [10];
       int aux;
         for (int i = 0; i < primero.length; i++) {
             total[i] = primero[i];
         }

         for (int i = 0; i < segundo.length; i++) {
             total[i + primero.length] = segundo[i];
         }

       for(int i = 0; i < total.length ; i++){
             for(int j = 0; j < total.length -1; j++){
                 if(total[j] > total [j + 1]){
                     aux = total[j];
                     total[j] = total [j + 1];
                     total [j + 1] = aux;                
                 }
             }
       }
    ;
    return total;
    } 
    
    public static void main(String[] args) {
        int primero [] = new int [5];
        int segundo [] = new int [5];
        
        rellenarArray(primero,segundo);
        mostrarArray(primero, segundo);
        int[] total = llenaryOrdenarArray(primero, segundo);

        System.out.println("\nArray combinado y ordenado:");
        for (int i = 0; i < total.length; i++) {
            System.out.print(total[i] + " ");
}

        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Alex
 */
public class Ejercicio07 {
 public static void rellenarArray (int numerosaleatorios []) {
        
        for (int i = 0; i < numerosaleatorios.length; i++){
            numerosaleatorios[i] = (int)(Math.random() * 50 +1);        
        }
    }
 
 
  public static void ordenarArray (int numerosaleatorios []){
      int aux;
      for (int i = 0; i < numerosaleatorios.length; i++){
          for (int j = 0; j < numerosaleatorios.length -1; j++){
              if(numerosaleatorios[j] < numerosaleatorios[j+ 1] ){
                  aux = numerosaleatorios[j];
                  numerosaleatorios[j] = numerosaleatorios[j+ 1];
                  numerosaleatorios[j+ 1] = aux;              
              }
      }
      }
 
 }
  
   public static void mostrarArray (int numerosaleatorios[]){
        for (int i = 0; i < 10; i++){
            
                System.out.println(numerosaleatorios[i] + " ");                
            }
       
        }
    
    
    
 
 
 
    public static void main(String[] args) {
        int numerosaleatorios [] = new int [15];
        rellenarArray(numerosaleatorios);
        ordenarArray(numerosaleatorios);
        mostrarArray(numerosaleatorios);
    }
    
}

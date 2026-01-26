/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio019;

/**
 *
 * @author alumno
 */
public class Ejercicio019 {

    public static void rellenarArray (int numerosrandom []) {
        
        for (int i = 0; i < numerosrandom.length; i++){
            
            numerosrandom[i] = (int)(Math.random()*80+10);        
        }
    
    }
    
    public static void mostrarArray (int numerosrandom []){
       for (int numero : numerosrandom){
           
          System.out.println(numero); 
          }
      }
    
    public static void numeroMayor(int numerosrandom []){
        int maxima = numerosrandom[0];
        for(int i = 0; i < numerosrandom.length; i++){
            if (numerosrandom[i] > maxima){
                maxima = numerosrandom[i];
            }
        
        }
        System.out.println("El número mayor es: " + maxima);
    
    }
    public static void numeroMenor(int numerosrandom []){
        int minima = numerosrandom[0];
        for(int i = 0; i < numerosrandom.length; i++){
            if (numerosrandom[i] < minima){
                minima = numerosrandom[i];
            }
        
        }
        System.out.println("El número menor es: " + minima);
    
    }
    
    public static void media (int numerosrandom[]){
        int media, total = 0;
         for(int i = 0; i < numerosrandom.length; i++){
             total += numerosrandom[i];               
         }
        media = total/numerosrandom.length;
        
        System.out.println("La media de todos los números es: " + media);
    
    }
    
    public static void main(String[] args) {
       int numerosrandom [] = new int [100];
       int auxiliar [] = new int [71];
       rellenarArray(numerosrandom);
       mostrarArray(numerosrandom);
       numeroMayor(numerosrandom);
       numeroMenor(numerosrandom);
       media(numerosrandom);
    }
    
}

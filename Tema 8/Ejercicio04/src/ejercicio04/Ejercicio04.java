/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;
import java.util.Arrays;
/**
 *
 * @author Alex
 */
public class Ejercicio04 {

     public static void mostrarArray (char arrayChar []){
       for (char array : arrayChar){
           
          System.out.print(array + " "); 
       }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        char [] arrayChar = new char [6];
        Arrays.fill(arrayChar, 0, 3 , 'a');
        Arrays.fill(arrayChar, 3, 6 , 'b');
        mostrarArray(arrayChar);
    }
    
}

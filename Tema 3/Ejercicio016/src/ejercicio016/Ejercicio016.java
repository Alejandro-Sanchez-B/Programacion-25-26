/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio016;

/**
 *
 * @author alumno
 */
public class Ejercicio016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, contador;
        contador = 0;
        
        System.out.println("Los numero impares que hay entre 20 y 160 son: ");
        for (i= 20; i <= 160 ; i++) {
            
             if (i % 2 != 0) {
                 contador++;
                 System.out.println(i);
                 }
        }
      System.out.println("La cantidad de numero impares que hay es: " + contador);           
    }
    
}

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
        int i, contador; //Creamos dos variables, una para el bucle for y otra para contar la cantidad de numeros pares
        contador = 0; //La inicializamos a 0
        
        System.out.println("Los numero impares que hay entre 20 y 160 son: ");
        for (i= 20; i <= 160 ; i++) { //Iniciamos el bucle, empezando por 20, terminando en 160 e incrementando en 1
            
             if (i % 2 != 0) { //Calculamos si el cociente de i entre 2 es distinto a 0 y si lo es
                 contador++; //Aumentamos la variable contador en 1
                 System.out.println(i); //Imprimimos el valor de i
                 }
        }
      System.out.println("La cantidad de numero impares que hay es: " + contador); //Al final del bucle imprimimos el número de impares que han salido           
    }
    
}

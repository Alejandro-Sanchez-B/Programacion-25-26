/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio014;

/**
 *
 * @author alumno
 */
public class Ejercicio014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0, contador=0; //Iniciamos la variable i y contador 
        
       while (contador < 100){ //Mientras contador sea menor a 100
           i++; //Incrementamos el valor de i en 1
           if (i % 2 == 0){ //Mientras el cociente de i entre 2 sea 0
               System.out.println(i); //Imprimimos por pantalla el contenido de la variable i
               contador++; //Aumentamos contador en 1
           
           }
       
       }
       
        System.out.println("El total de numeros pares es " + contador); //Al final imprimimos el total de numeros pares utilizando la variable contador    
    }
    
}

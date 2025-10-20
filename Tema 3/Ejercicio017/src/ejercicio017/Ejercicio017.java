/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio017;
import java.util.Scanner; //Importamos la clase Scanner
/**
 *
 * @author alumno
 */
public class Ejercicio017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float raiz, resultado; //Creamos variables raiz y resultado como float
        Scanner entrada = new Scanner(System.in);  //Creamos la entrada de datos
        do { //Iniciamos un bucle do
            
            
           System.out.println("Introduce el numero para calcular su raiz cuadrada");
           raiz = entrada.nextFloat(); //Solicitamos al usuario que nos de el numero a calcular
           if (raiz < 0){ //Si raiz es distinta a 0
           
           
               System.out.println("Introduce un numero positivo "); //Le pedimos al usuario que nos de un numero positivo
           
           }
        }while(raiz < 0); // Se lo seguimos pidiendo mientras raiz sea menor a 0
         
           resultado = (float)(Math.sqrt(raiz)); //Si es positivo, realizamos la operacion convirtiendo la raiz a float y la mostramos por pantallas
           System.out.println("La raiz cuadrada de " + raiz + " es " + resultado);
           
        
    }
    
}

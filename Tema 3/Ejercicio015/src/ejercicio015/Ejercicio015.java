/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio015;
import java.util.Scanner; //Importamos la clase Scanner
/**
 *
 * @author alumno
 */
public class Ejercicio015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int multiplicar,i, resultado; //Creamos las variables multiplicar, i para el for y resultado
        Scanner entrada = new Scanner(System.in); //Creamos el Scanner para pedir datos al usuario
        
        System.out.println("Introduzca el numero a calcular");
        multiplicar = entrada.nextInt(); //Guardamos en la variable multiplicar el número pedido al usuario 
        
       for(i=0; i<=10; i++){ //Creamos un bucle for, que empiece en 0 hasta 10 y se incremente en 1
       
           resultado = multiplicar * i; //Guardamos en resultado la multiplicacion del numero dado por el usuario por i
            System.out.println(multiplicar + " multiplicado por " + i + " es igual a " 
            + resultado);
       
       }
    }
    
}

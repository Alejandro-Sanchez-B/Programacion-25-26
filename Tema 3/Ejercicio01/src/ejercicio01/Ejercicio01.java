/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner; //Importamos la clase Scanner
/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //Declaramos una variable de entrada
        System.out.println("Introudzca un numero"); //Mostramos por pantalla la solicitud al usuario
        int numero = entrada.nextInt();//Leemos el dato introducido por el usuario

        if (numero < 0 ){ //Conmparamos si el numero es menor a 0
            System.out.println("El numero es negativo"); //Si se cumple mostramos el mensaje
        }else if (numero > 0) {//Si no se cumple la primera sentencia, pasamos a la segunda comparativa
            System.out.println("El numero es positivo"); //Si el numero es positivo, mostramos el mensaje
        }else {// Si no es ni positivo ni negativo, mostramos un mensaje indicando que el numero es 0
            System.out.println("El numero es cero");
        }
    }
    
}

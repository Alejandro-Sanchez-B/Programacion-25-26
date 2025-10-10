/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio026;
import java.util.Scanner; //Importamos la libreria Scanner
/**
 *
 * @author alumno
 */
public class Ejercicio026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Creamos el metodo de entrada de datos
        System.out.println("Introduzca un numero de 4 cifras"); //Solicitamos al usuario un numero de 4 cifras
        int numero = entrada.nextInt(); //Creamos la variable en la que guardaremos el numero introducido por el usuario
        int cifra1,cifra2,cifra3,cifra4; //Creamos las variables en las que guardaremos cada una de las cifras 
        
        cifra1 = numero /1000; //Separamos la primera cifra dividiendo el numero por 1000, ya que es un número de 4 cifras
        cifra2 = (numero % 1000)/100; //Separamos la segunda cifra calculando el resto de la division anterior y dividiendo el resultado entre 100
        cifra3 = (numero % 100)/10;//Separamos la tercera cifra calculando el resto de la division anterior y dividiendo el resultado entre 10
        cifra4 = numero % 10 ;//Separamos la ultima cifra calculando el resto de la division entre 10
        
        System.out.println("La primera cifra es " + cifra1);
        System.out.println("La segunda cifra es " + cifra2);
        System.out.println("La tercera cifra es " + cifra3);
        System.out.println("La cuarta cifra es " + cifra4);
        
        
    }
    
}

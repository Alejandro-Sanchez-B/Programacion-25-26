/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Scanner; //Importamos la clase Scanner

/**
 *
 * @author alumno
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Creamos el metodo de entrada de datos
        System.out.println("Introduzca la cantidad de dinero a calcular"); //Solicitamos al usuario la cantidad de dinero
        int dinero = entrada.nextInt(); //Creamos la variable de almacenamiento del dinero
        int billetes50 = dinero/50; //Dividimos la cantidad introducida por el usuario entre 50
        int billetes20 = (dinero % 50)/20; //Sacamos el resto de la division anterior y lo dividimos por el valor del billete de 20
        int billetes10 = (dinero % 20)/10;//Sacamos el resto de la division anterior y lo dividimos por el valor del billete de 10
        int billetes5 = (dinero % 10)/5;//Sacamos el resto de la division anterior y lo dividimos por el valor del billete de 5
        int monedas2 = (dinero % 5)/2;//Sacamos el resto de la division anterior y lo dividimos por el valor de las monedas de 2
        int monedas1 = (dinero % 2);//Sacamos el resto de la division anterior y lo dividimos por el valor de las monedas de 1
        
        
        System.out.println("El monto de billetes es: ");
                
        if (billetes50 > 0) { //Si el resultado de la operacion de billetes50 es mayor a 0
            System.out.println(billetes50 + " Billetes de 50 "); //Mostramos por pantalla el contenido de la variable
        }
        if (billetes20 > 0) {//Si el resultado de la operacion de billetes20 es mayor a 0
            System.out.println(billetes20 + " Billetes de 20 ");//Mostramos por pantalla el contenido de la variable
        }
        if (billetes10 > 0) {//Si el resultado de la operacion de billetes10 es mayor a 0
            System.out.println(billetes10 + " Billetes de 10 ");//Mostramos por pantalla el contenido de la variable
        }
        if (billetes5 > 0) {//Si el resultado de la operacion de billetes5 es mayor a 0
            System.out.println(billetes5 + " Billetes de 5 ");//Mostramos por pantalla el contenido de la variable
        }
        if (monedas2 > 0) {//Si el resultado de la operacion de monedas2 es mayor a 0
            System.out.println(monedas2 + " Monedas de 2 ");//Mostramos por pantalla el contenido de la variable
        }
        if (monedas1 > 0) {//Si el resultado de la operacion de monedas1 es mayor a 0
            System.out.println(monedas1 + " Monedas de 1 ");//Mostramos por pantalla el contenido de la variable
        }
    }
    
}

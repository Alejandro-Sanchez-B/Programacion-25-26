/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Scanner; //Importamos la clase
/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner entrada = new Scanner (System.in); //Declaramos una variable de entrada
          float num1, num2, suma, multiplicacion; //Declaramos las variables que usaremos
          System.out.println("Introduzca el primer numero");//Solicitamos al usuario el primer numero
          num1 = entrada.nextFloat();//Guardamos el numero en una variable
          System.out.println("Introduzca el segundo numero");//Solicitamos al usuario el segundo numero
          num2 = entrada.nextFloat();//Guardamos el segundo numero en una variable
          
          if (num1 < 10) //Comparamos el primer numero para saber si es menor a 10
          {
              suma = num1 + num2; //Si se cumple la condicion, hacemos la suma de los numeros
              
              System.out.println("La operacion es una suma y el resultado es: " + suma);
          
          }else { 
          
              multiplicacion = num1 * num2;//Si no se cumple, hacemos la multiplicacion de los numeros
              System.out.println("La operacion es una multiplicacion y el resultado es: " + multiplicacion);
          }
          
    }
    
}

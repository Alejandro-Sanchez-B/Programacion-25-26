/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ejercicio07 {

     public static void Ordenar (int num1, int num2, int num3, int num4){
        int reserva, contador; //Declaramos las variables reserva (para almacenar uno de los numeros) y contador
        
        contador = 0; //Iniciamos contador a 0
        
        while (contador < 3){ //Creamos un bucle while que haga tres pasadas comparartivas
            
            if (num1 > num2){ //Si el primer numero es mayor que el segundo
                reserva = num1; //Guardamos el primer número en reserva
                num1 = num2; //Cambiamos el valor del primero por el del segundo
                num2 = reserva; //Guardamos el valor del número en reserva en el segundo
            } 
            
            if (num2 > num3) {//Si el segundo numero es mayor que el tercero, repetimos la operacion anterior
            
                reserva = num2;
                num2 = num3;
                num3 = reserva;
            
            }
            
            if (num3 > num4) {//Si el tercer numero es mayor que el cuarto, repetimos la operacion anterior
            
                reserva = num3;
                num3 = num4;
                num4 = reserva;
            
            }
            
            contador++; //Aumentamos el contador a 1
        
        }
        System.out.println("El orden de los numeros es " + num1 + " - " + num2 + " - " + num3 + " - " + num4); //Imprimimos por pantalla el resultado
    }
    public static void main(String[] args) {
        int num1, num2,num3, num4; //Declaramos las variables a utilizar
        
        Scanner entrada = new Scanner (System.in); //Declaramos un objeto de entrada de datos
        //Solicitamos al usuario los 4 numeros a ordenar
        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero");
        num3 = entrada.nextInt();
        System.out.println("Introduzca el cuarto numero");
        num4 = entrada.nextInt();
        
        Ordenar(num1,num2,num3,num4); //Llamamos al método pasandole los 4 números pedidos al usuario
    }
    
}

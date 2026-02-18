/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07 {

    public static String pedirCadena () {
       Scanner entrada = new Scanner (System.in);
       System.out.println("Introduzca la cadena a devolver");
        
       String cadena = entrada.nextLine();
       return cadena;    
    }
    public static void devolverCadena (){
       String cadenafinal = pedirCadena();
   
       String[] palabras = cadenafinal.split(" ");
   
    for(int i = palabras.length - 1; i >= 0; i--){
       System.out.print(palabras[i] + " ");
   }
    }
    public static void main(String[] args) {
        devolverCadena();
    }
    
}

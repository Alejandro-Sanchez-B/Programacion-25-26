/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03 {
 public static String pedirCadena () {
       Scanner entrada = new Scanner (System.in);
       System.out.println("Introduzca la cadena a devolver");
        
       String cadena = entrada.nextLine();
       return cadena;    
    }
    
    public static void devolverCadena (){
       String cadena1 = pedirCadena();
       char [] cadena2;
       cadena2 = cadena1.toCharArray();
       
       
       for(int i = 0; i < cadena2.length; i++){
           System.out.println(cadena2[i]);       
       }
    
    }
    public static void main(String[] args) {
        
        devolverCadena();
    }
    
}

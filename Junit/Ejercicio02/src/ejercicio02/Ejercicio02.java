/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    public static String pedirCadena () {
       Scanner entrada = new Scanner (System.in);
       System.out.println("Introduzca la cadena a devolver");
        
       String cadena = entrada.nextLine();
       return cadena;    
    }
    
    public static void devolverCadena (){
       String cadenafinal = pedirCadena();
       
       for(int i = 0; i < cadenafinal.length(); i++){
           System.out.println(cadenafinal.charAt(i));       
       }
    
    }
    public static void main(String[] args) {
        devolverCadena();
    }
    
}

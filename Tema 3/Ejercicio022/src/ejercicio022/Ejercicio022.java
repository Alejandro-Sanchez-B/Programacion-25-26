/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio022;
import java.util.Scanner; //Importamos la clase Scanner
import java.util.InputMismatchException; //Importamos la clase InputMismatchException
/**
 *
 * @author alumno
 */
public class Ejercicio022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float num1,num2,resultado;
       
       
       Scanner entrada = new Scanner(System.in);
        
            
            try {
                System.out.println("Ingtroduzca el primer numero");
                num1 = entrada.nextFloat();
                System.out.println("Introduzca el segundo numero");
                num2 = entrada.nextFloat();
                
                resultado = num1+num2;
                
                System.out.println("El resultado de sumar " + num1 + " mas " + num2 + " es igual a " + resultado);
                
            
            }catch (InputMismatchException e){
            
                System.out.println("Introduzca un valor válido");
                
            }
        
        
        
        
    }
    
}

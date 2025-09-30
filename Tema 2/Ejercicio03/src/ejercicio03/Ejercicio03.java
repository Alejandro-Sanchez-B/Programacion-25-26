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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
       
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca su nombre ");
        String nombre=entrada.nextLine();
        System.out.println("Introduzca su edad: ");
        byte edad=entrada.nextByte();
        System.out.println("Introduzca su altura ");
        float altura=entrada.nextFloat();
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su altura es: " + altura);
        
        
        
    }
    
}

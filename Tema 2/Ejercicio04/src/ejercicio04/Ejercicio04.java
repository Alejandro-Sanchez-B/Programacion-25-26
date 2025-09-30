/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca la asignatura a calcular ");
        String asignatura=entrada.nextLine();
        
        System.out.println("Introduzca la nota del primer examen ");
        float nota1=entrada.nextFloat();
        System.out.println("Introduzca la nota del segundo examen ");
        float nota2=entrada.nextFloat();
        
        float resultado=(nota1+nota2)/2;
        System.out.println("La nota media de la asignatura de " + asignatura + " es: " + resultado);
        

            }
    
}

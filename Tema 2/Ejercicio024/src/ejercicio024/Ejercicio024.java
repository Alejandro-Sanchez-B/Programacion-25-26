/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio024;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la nota de Programacion");
        float programacion = entrada.nextFloat();
        System.out.println("Introduzca la nota de Lenguaje de Marcas");
        float lenguajemarcas = entrada.nextFloat();
        System.out.println("Introduzca la nota de Base de Datos");
        float basedatos = entrada.nextFloat();
        System.out.println("Introduzca la nota de Entornos de Desarrollo");
        float entornos = entrada.nextFloat();
        System.out.println("Introduzca la nota de Sistemas Informaticos");
        float sistemas = entrada.nextFloat();
        System.out.println("Introduzca la nota de FOL");
        float fol = entrada.nextFloat();
        
        float notamedia = (programacion + lenguajemarcas + basedatos + entornos + sistemas + fol)/6;
        
        System.out.println("Su nota media es: " + notamedia);
    }
    
}

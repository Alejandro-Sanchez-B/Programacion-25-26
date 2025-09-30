/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04b;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio04b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float nota1;
        float nota2;
        System.out.println("Introduzca la asignatura a calcular ");
        String asignatura=entrada.nextLine();
        
        System.out.println("Introduzca la nota del primer examen ");
            nota1=entrada.nextFloat();
            if (nota1 < 0 || nota1 > 10){
                System.out.println("Introduzca un valor valido");
            }else{
             System.out.println("Introduzca la nota del segundo examen ");
             nota2=entrada.nextFloat();
                if (nota2 < 0 ||nota2 > 10){
                 System.out.println("Introduzca un valor valido");
                }else{
                 float resultado=(nota1+nota2)/2;
                    System.out.println("La nota media de la asignatura de " + asignatura + " es: " + resultado);
                
            }
        }
        
        
        
        
        
     }
    
    }

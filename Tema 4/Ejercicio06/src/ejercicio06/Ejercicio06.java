/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {
    public static void Calificaciones (int nota){
         // Creamos una variable para guardar la nota del usuario
        boolean suspenso,suficiente,notable,sobresaliente;
        suspenso = false; // Inicialmente se establece suspenso como falso
        suficiente = false; // Inicialmente se establece suficiente como falso
        notable = false; // Inicialmente se establece notable como falso
        sobresaliente = false; // Inicialmente se establece sobresaliente como falso
        
        
         switch (nota){ //// Se evalúa la nota usando una estructura switch
            case 0:
            case 1: 
            case 2:
            case 3:
            case 4: // Si la nota está entre 0 y 4
                suspenso = true; //Ponemos el valor de suspenso en true
                System.out.println("Estas suspenso"); //Mostramos por pantalla el mensaje con el resultado
                break; //Finalizamos el switch
            case 5:
            case 6:// Si la nota es 5 o 6
                suficiente = true;//Ponemos el valor de suficiente en true
                System.out.println("Tienes un suficiente");//Mostramos por pantalla el mensaje con el resultado
                break;//Finalizamos el switch
            case 7:
            case 8: //Si la nota es 7 u 8
                notable = true;//Ponemos el valor de notable en true
                System.out.println("Tienes un notable");//Mostramos por pantalla el mensaje con el resultado
                break;//Finalizamos el switch
            case 9:
            case 10: //Si la nota es 9 o 10
                sobresaliente = true;//Ponemos el valor de sobresaliente en true
                System.out.println("Tienes un sobresaliente");//Mostramos por pantalla el mensaje con el resultado
                break;//Finalizamos el switch
            default: //En caso de que el numero no entre dentro de los valores establecidos
                System.out.println("Introduce un valor valido"); //Mostramos un mensaje de error
                        
        
        }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Introduzca un numero");
        nota = entrada.nextInt();
        
        Ejercicio06.Calificaciones(nota);
    }
    
}

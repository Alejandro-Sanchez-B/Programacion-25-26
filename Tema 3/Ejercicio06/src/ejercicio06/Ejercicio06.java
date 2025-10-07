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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        boolean suspenso,suficiente,notable,sobresaliente;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce tu nota");
        nota = entrada.nextInt();
        suspenso = false;
        suficiente = false;
        notable = false;
        sobresaliente = false;
        
        switch (nota){
            case 0:
            case 1: 
            case 2:
            case 3:
            case 4:
                suspenso = true;
                System.out.println("Estas suspenso");
                break;
            case 5:
            case 6:
                suficiente = true;
                System.out.println("Tienes un suficiente");
                break;
            case 7:
            case 8:
                notable = true;
                System.out.println("Tienes un notable");
                break;
            case 9:
            case 10:
                sobresaliente = true;
                System.out.println("Tienes un sobresaliente");
                break;
            default:
                System.out.println("Introduce un valor valido");
                        
        
        }
            
                    
        
    }
    
}

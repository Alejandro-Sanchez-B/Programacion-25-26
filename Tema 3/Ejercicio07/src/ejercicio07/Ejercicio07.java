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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diasemana;
        boolean laborable;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce el dia de la semana (formato numerico)");
        diasemana = entrada.nextInt();
        
        
        
        switch (diasemana){
            case 0:
            case 1: 
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                System.out.println("Es dia laborable");
                break;
            case 6:               
            case 7:
                laborable = false;
                System.out.println("Es dia de fiesta");
                break;
            default:
                System.out.println("Introduce un valor valido");
                        
        
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el numero de segundos a calcular");
        int tiempo = entrada.nextInt();
        int segundos = tiempo % 60;
        int minutos = (tiempo % 3600) / 60;
        int horas = (tiempo % 86400) / 3600;
        int dias = tiempo / 86400;
        
        
        System.out.println(tiempo + " segundos equivalen a " + dias + " dias " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
    
}

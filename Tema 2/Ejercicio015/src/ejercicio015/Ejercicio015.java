/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio015;

/**
 *
 * @author Alex
 */
public class Ejercicio015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tiempo = 10000;
        
        int segundos = tiempo % 60;
        int minutos = (tiempo % 3600) / 60;
        int horas = tiempo / 3600;
        //minutos = minutos % 60;
        
        
        System.out.println(tiempo + " segundos equivalen a " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
        
        
    }
    
}

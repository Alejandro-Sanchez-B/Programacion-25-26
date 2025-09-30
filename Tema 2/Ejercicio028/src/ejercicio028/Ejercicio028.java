/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio028;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       float archivo, adsl, descarga;
       int horas, minutos, segundos;
       
        System.out.println("Introduce el tamaño del archivo");
        archivo = entrada.nextFloat();
        System.out.println("Introduce la velocidad de internet");
        adsl = entrada.nextFloat();
        
        descarga = archivo/adsl;
        
        segundos = (int)descarga % 60;
        minutos = ((int)descarga % 3600) / 60;
        horas = (int)descarga / 3600;
       
       System.out.println("El tiempo de descarga del archivo es de : "  + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
       
    }
    
}

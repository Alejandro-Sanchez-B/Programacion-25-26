/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09 {
    public static int pedirNumero (){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un número de 5 cifras");
        int numerousuario = entrada.nextInt();
        return numerousuario;
    }
    
    public static int calcularTamaño (int numerousuario) {
        String cadena = String.valueOf(numerousuario); //Convertimos el numero entero en String
        int tamañocadena = cadena.length();
        return tamañocadena;
    
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

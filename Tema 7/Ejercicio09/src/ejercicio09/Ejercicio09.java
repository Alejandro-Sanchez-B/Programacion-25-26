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
        System.out.println("Introduzca un número");
        int numerousuario = entrada.nextInt();
        return numerousuario;
    }
    
    public static int calcularTamaño (int numerousuario) {
        String cadena = String.valueOf(numerousuario); //Convertimos el numero entero en String
        int tamañocadena = cadena.length();
        return tamañocadena;
    
    }
    
    public static void dividirNumero (int numerousuario,int numeroreves[] ){
    int i = 0 , numeroarray, aux;
    do{
        aux = numerousuario / 10;
        numeroarray = numerousuario % 10;                               
        numeroreves[i] = numeroarray;
        numerousuario = aux;
        i++;
    
    }while(numerousuario > 0);
    
    }
    
    public static void mostrarArray (int numeroreves []){
       for (int numero : numeroreves){
           
         System.out.print(numero);           
           
       }
        System.out.println(" ");
    }
    
    
    public static void main(String[] args) {
        int numerousuario = pedirNumero();
        int tamañocadena = calcularTamaño(numerousuario);
        int numeroreves [] = new int [tamañocadena];        
        dividirNumero (numerousuario,numeroreves);
        System.out.println(" ");
        mostrarArray (numeroreves);
        

    }
    
}

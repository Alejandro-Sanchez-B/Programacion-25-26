/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio08 {

    public static int pedirNumero (){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un número de 5 cifras");
        int numerousuario = entrada.nextInt();
        return numerousuario;
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
    }
    public static void main(String[] args) {
        int numeroreves [] = new int [5];
        int numerousuario=pedirNumero();
        dividirNumero (numerousuario,numeroreves);
        mostrarArray (numeroreves);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioref1;
import Utilidades.PedirDatos;
//import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EjercicioRef1 {
    
//    public static void saludo () {
//    
//        System.out.println("Hola mundo");
//    }
//    
//    public static void saludoConParametro(int num){
//    
//        System.out.println("Hola Mundo " + num);
//    }
////    
////    public static void suma (int num1, int num2){
////        System.out.println("La suma de " + num1 + " mas "+ num2 + " es igual a " + (num1 +num2));
////    
////    }
//    
//    public static int sumadevuelta(int num1, int num2){
//        return num1 +num2;
//    
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int num1;
        int num2;
        double resultado;
        
//        suma(num1,num2);
//        saludo();
//        saludoConParametro(5);
//        System.out.println("La suma de los dos numero es " + sumadevuelta(num1, num2));
        
        
       num1 = PedirDatos.pedirNumero();
       num2 = PedirDatos.pedirNumero();
       try{
        resultado = Calculadora.suma(num1,num2);
        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a: " + resultado);
        resultado = Calculadora.resta(num1,num2);
        System.out.println("La resta de " + num1 + " - " + num2 + " es igual a: " + resultado);
        resultado = Calculadora.multiplicacion(num1,num2);
        System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es igual a: " + resultado);
        resultado = Calculadora.division(num1,num2);
        System.out.println("La division de " + num1 + " / " + num2 + " es igual a: " + resultado);
        resultado = Calculadora.RaizCuadrada(num1);
        System.out.println("La raiz cuadrada de " + num1 + "es igual a " + resultado);
       }catch (ArithmeticException e){
           System.out.println("Ha ocurrido un error");
       }
    }
    
    
    
}

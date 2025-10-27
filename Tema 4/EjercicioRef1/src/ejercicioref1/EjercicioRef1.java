/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioref1;
import Utilidades.PedirDatos;

/**
 *
 * @author alumno
 */
public class EjercicioRef1 {
    public static void saludo () {
    
        System.out.println("Hola mundo");
    }
    
    public static void saludoConParametro(int num){
    
        System.out.println("Hola Mundo " + num);
    }
//    
//    public static void suma (int num1, int num2){
//        System.out.println("La suma de " + num1 + " mas "+ num2 + " es igual a " + (num1 +num2));
//    
//    }
    
    public static int sumadevuelta(int num1, int num2){
        return num1 +num2;
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PedirDatos.main();
        
        Calculadora.suma();
        
        
//        suma(num1,num2);
//        saludo();
//        saludoConParametro(5);
        System.out.println("La suma de los dos numero es " + sumadevuelta(num1, num2));
        
        
    }
    
    
    
}

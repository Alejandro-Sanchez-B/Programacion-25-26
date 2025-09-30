/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio013;

/**
 *
 * @author Alex
 */
public class Ejercicio013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("El valor de la variable num1 es " + num1 + " y el valor de la variable 2 es " + num2);
        
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("El valor de la variable num1 es " + num1 + " y el valor de la variable 2 es " + num2);
         
    }
    
}

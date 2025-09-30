/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caritmetica;

/**
 *

 */
public class CAritmetica {

    /**
     * @author Alex
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1; //Se declara la variable numero1
        int numero2, resultado; //Se decñlara la variable numero2
        
        numero1 = 40;
        numero2 = 60;
        //Suma
        resultado = numero1 + numero2;
        System.out.println(numero1 + " + " +  numero2 + " = " + resultado);
        //Resta
        resultado = numero1 - numero2;
        System.out.println(numero1 + " - " +  numero2 + " = " + resultado);
        //Producto
        resultado = numero1 * numero2;
        System.out.println(numero1 + " * " +  numero2 + " = " + resultado);
        //Cociente
        resultado = numero1 / numero2;
        System.out.println(numero1 + " / " +  numero2 + " = " + resultado);
    }
    
}

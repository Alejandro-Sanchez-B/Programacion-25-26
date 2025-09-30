/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caritmetica2;

/**
 *
 * @author alumno
 */
public class CAritmetica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero1,numero2,numero3; //Se declara la variable numero1
        double resultado;
        numero1 = 40.6f;
        numero2 = 60.9f;
        numero3 = 20.1f;
        //Suma
        resultado = numero1 + numero2 + numero3;
        System.out.println(numero1 + " + " +  numero2 +  " + " +  numero3 +" = " + resultado);
        //Resta
        resultado = numero1 - numero2 - numero3;
        System.out.println(numero1 + " - " +  numero2 +  " - " +  numero3 +" = " + resultado);
        //Producto
        resultado = (numero1 * numero2) * numero3;
        System.out.println(numero1 + " * " +  numero2 + " * " +  numero3 + " = " + resultado);
        //Cociente
        resultado = (numero1 / numero2) / numero3;
        System.out.println(numero1 + " / " +  numero2 + " / " +  numero3 + " = " + resultado);
    }
    
}

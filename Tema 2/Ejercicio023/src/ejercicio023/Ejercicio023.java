/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio023;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto elegido");
        float producto = entrada.nextFloat();
        System.out.println("Introduzca las unidades deseadas");
        int unidades = entrada.nextInt();
        
        float totalpagar = producto * unidades;
        
        System.out.println("El precio total de su compra es: " + totalpagar + " euros");
    }
    
}

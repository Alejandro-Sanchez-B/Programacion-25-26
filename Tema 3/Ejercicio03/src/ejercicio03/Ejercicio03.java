/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Scanner; //Importamos la clase
/**
 *
 * @author alumno
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1, num2,num3;
        
        Scanner entrada = new Scanner (System.in); //Declaramos un objeto de entrada de datos
        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextFloat();
        System.out.println("Introduzca el segundo numero");
        num2 = entrada.nextFloat();
        System.out.println("Introduzca el tercer numero");
        num3 = entrada.nextFloat();
        
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(" El " + num1 + " es el mayor");
        
        }
        
    }
    
}

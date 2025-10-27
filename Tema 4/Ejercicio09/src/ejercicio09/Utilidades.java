/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Utilidades {
    public static int Pedirdatos(){
        int num;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un numero");
        num = entrada.nextInt();
        return num;
    
    
    }
    public static void Menor (int num1, int num2, int num3){
        
        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("El numero " + num1 + " es el menor");
        }else if ((num2 < num1) && (num2 < num3)){
           System.out.println("El numero " + num2 + " es el menor");
        }else 
          System.out.println("El numero " + num3 + " es el menor");
    
    } 
    
}

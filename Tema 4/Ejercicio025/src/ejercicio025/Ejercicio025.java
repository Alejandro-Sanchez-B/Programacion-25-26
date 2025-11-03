/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio025;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio025 {

   public static double calcularPotencia (){
       
     double num1, num2;
     boolean comprobar;
     Scanner entrada = new Scanner (System.in);
     
     System.out.print("Introduce el numero a elevar ");
     num1 = entrada.nextDouble();
     do{
        try{
        System.out.print("Introduce el exponente ");
        num2 = entrada.nextDouble();

        return Math.pow(num1, num2);
     
        }catch(ArithmeticException e){
       
            System.out.println("No puedes elevar a 0");
            comprobar = false;
        }
     }while (comprobar = false);
     
     
    public static void main(String[] args) {
        System.out.println(calcularPotencia());
    }
    
}

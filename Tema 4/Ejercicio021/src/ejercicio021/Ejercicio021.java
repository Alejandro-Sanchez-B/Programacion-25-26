/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio021;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio021 {

    
    public static int pedirNum1(){
        int num1;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduce el primer numero ");
        num1 = entrada.nextInt();
        return num1;
    }
    
   public static int pedirNum2(){
     int num2;
     boolean comprobador;
       Scanner entrada = new Scanner (System.in);
       System.out.print("Introduce el segundo numero ");
       do {
          
          num2 = entrada.nextInt();
           
           if (num2 > pedirNum1()) {
            comprobador = true;
            entrada.next();
                    
           
           }else {
              comprobador = false;
               System.out.println("Numero equivocado");
              entrada.next();
          }
        
         }while (comprobador = false);
        
        return num2;
   }
    public static void main(String[] args) {
        System.out.println(pedirNum1());
        System.out.println(pedirNum2());
    
    }
    
}

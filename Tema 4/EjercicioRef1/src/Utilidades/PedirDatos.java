/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PedirDatos {

    
    
     
  

    public static void main() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = entrada.nextInt();
    
            
            
    }
    



  public static int pedirNumero() {
    int num = 0;
    boolean prueba;
    do{
        try{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = entrada.nextInt();
        prueba = true;
        } catch(InputMismatchException e){
            System.out.println("Introduce un valor valido");
            prueba = false;
        }
    }while (prueba == false);
    return num;
    
  }

}

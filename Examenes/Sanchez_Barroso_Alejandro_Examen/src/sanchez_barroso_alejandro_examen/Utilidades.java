/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez_barroso_alejandro_examen;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Utilidades {
    
    /**
     * Método que pide al usuario un número
     * @return El número dado por el usuario
     */
  public static int pedirNum (){
     int valor;
     boolean error;
     valor = 0;     
     Scanner entrada = new Scanner (System.in);
      do{ //Creamos un bucle para que el usuario siga dando datos hasta que introduzca un número
        try { //Hacemos un try para controlar que el usuario no introduzca carácteres de otro tipo que no sean númericos
            System.out.println("Introduzca un valor");
            valor = entrada.nextInt();
            error = false; //Creamos una variable para poder cerrar el bucle
         
        }catch (InputMismatchException e){
            System.out.println("Introduzca un valor válido");
            error = true;
            entrada.next();
        }
        
      }while(error == true);
      
     return valor;
    }
  
  /**
   * Método que muestra por pantalla un menú
   */
  public static void menu (){
      System.out.println("     ");
      System.out.println("     ");
      System.out.println("     ");
      System.out.println("Elija una opción");
      System.out.println("1: Analisis de señal");
      System.out.println("2: Ajustar potencia de motores");
      System.out.println("3: Calculo de volumen planetario");
      System.out.println("4: Salir");
      System.out.println("     ");
      System.out.println("     ");
      System.out.println("     ");
  }
}  
    



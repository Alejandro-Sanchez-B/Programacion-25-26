/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coladecorreos;
import static coladecorreos.ColadeCorreos.FINRANGO;
import static coladecorreos.ColadeCorreos.INICIORANGO;
import static coladecorreos.ColadeCorreos.numEnvio;
import static coladecorreos.ColadeCorreos.numRecogida;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Utilidades {
    /**
     * Método que pide al usuario un número y lo almacena en una variable para usarse
     * @return el número solicitado al usuario
     */
    public static int pedirNumero() {
    int num;
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = entrada.nextInt();
       
     
        return num;
    
  }
     /**
      * Método que muestra un menú de opciones por pantalla
      */
     public static void mostrarMenu(){
         
         System.out.println("Seleccione una opcion");
         System.out.println("1: Enviar");
         System.out.println("2: Recoger");
         System.out.println("3: Salir");
      
     }
     /**
      * Método que nos genera una letra aleatoria entre A y F
      * @return una letra aleatoria
      */
     public static char generarLetraAleatoria(){
       char letraleatoria;
       int iniciorango, finalrango,calculoletraleatoria;
       iniciorango = (int) INICIORANGO; //Transformamos las variable char en un entero para poder genera un rango
       finalrango = (int) FINRANGO;
       
       calculoletraleatoria = iniciorango + (int)(Math.random()*(finalrango - iniciorango + 1)); //Generamos un número aleatorio dentro de ese rango
       letraleatoria = (char) calculoletraleatoria; //Y lo convertimos a char
       return letraleatoria ;
    
    }
     /**
    * Método que nos incrementa el número de envío en 1 cada vez que se ejecuta
    */
    public static void incrementarNumeroEnvio () {
        numEnvio++;
    /**
    * Método que nos incrementa el número de recogida en 1 cada vez que se ejecuta
    */
    }
     public static void incrementarNumeroRecogida() {
        numRecogida++;
    
    }
}



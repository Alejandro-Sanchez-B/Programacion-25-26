/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladecorreos;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class ColadeCorreos {
    public final static char INICIORANGO = 'A';
    public final static char FINRANGO = 'F';
    public static int numEnvio = 1;
    public static int numRecogida = 1;
    
   
   
    /**
     * Método que nos genera un número de envío y llama al método de incremetar el numero de envio
     */
     
     public static void generarNumeroEsperaEnvio () {
        
         System.out.println("E-" + numEnvio);
         Utilidades.incrementarNumeroEnvio();
        }
     /**
      * Método que nos genera un número de recogida y llama al método de incremetar el numero de recogida
      */
     public static void generarNumeroEsperaRecogida () {
        
         System.out.println("R-" + numRecogida);
         Utilidades.incrementarNumeroRecogida();
        }
     
     
    public static void main(String[] args) {
        char letraleatoria;
        int menu;
        
        Utilidades.mostrarMenu(); //Mostramos el menú
        
        do{
            
            menu = Utilidades.pedirNumero(); //Guardamos en una variable el número del menú pedido al usuario
            
            switch(menu) { //Creamios un menu switch
                case 1: { 
                    generarNumeroEsperaEnvio();//Lamamos a la funcion que nos genera un numero de envio
                    letraleatoria = Utilidades.generarLetraAleatoria(); //Generamos una letra aleatoria y la mostramos al usuario
                    System.out.println("Mesa " + letraleatoria);
                    break;
                }
                case 2: {
                    generarNumeroEsperaRecogida();//Lamamos a la funcion que nos genera un numero de recogida
                    letraleatoria = Utilidades.generarLetraAleatoria();//Generamos una letra aleatoria y la mostramos al usuario
                    System.out.println("Mesa " + letraleatoria);
                    break;
                }   
                case 3: {
                    System.out.println("Fin del programa"); //Finalizamos el programa
                    break;
                }
                
                default: { //En caso de no pulsar una opcion válida, se le indicará
                    System.out.println("  ");
                    System.out.println("  ");
                    System.out.println("Por favor, introduzca una opcion válida");
                    System.out.println("  ");
                    System.out.println("  ");
                
                
                }
            
            }
           
            
        
        
        
        }while(menu != 3); //Se seguirá el programa hasta que el usuario pulse salir
        
    }
    
}

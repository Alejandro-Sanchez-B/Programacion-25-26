/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Metodos {
    
    public static String pedirString (){
        Scanner entrada = new Scanner (System.in);
        return entrada.nextLine();
    }
    
    public static int pedirInt (){
        Scanner entrada = new Scanner (System.in);
        return entrada.nextInt();
    }
    public static void aparcarBus (Autobus autobuses []){
        boolean comprobar = false;
         do{
            try{
                System.out.println("Por favor, señale la dársena (1-6)"); //Solicitamos al usuario que nos indique la posición
                int posicion = pedirInt() - 1;
                    if( posicion < 0 || posicion > autobuses.length ){ //Si la posición está fuera del rango se lo indicamos
                        System.out.println("Esa dársena no existe");

                    }else if (autobuses[posicion] != null){  //Si la posicion ya está ocupada se lo indicamos 
                        System.out.println("Esa dársena está ocupada");

                    }else{ //Si no está ocupada y entra dentro del rango ponemos comprobar a true y creamos un nuevo objeto
                        System.out.println("Por favor, indique su nombre");
                        String titular = pedirString();
                        System.out.println("Por favor, indique la matricula de su coche");
                        String matricula = pedirString();
                        coches[posicion] = new Coche (titular, matricula);
                        comprobar = true;                

                   }

           }catch (InputMismatchException e){ //Nos aseguramos de que nos introducen un entero
                System.out.println("introduzca un tipo de dato válido");       
                        }
        }while (!comprobar); //Seguimos el bucle mientras comprobar sea false
        }
         
    
    }
}

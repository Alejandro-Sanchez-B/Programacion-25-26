/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio018;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio018 {
static final int CONTRASENA_CORRECTA = 12345; //Creamos la constante contraseña correcta 
static final int INTENTOS = 3; //Creamos la constante intentos
    public static void main(String[] args) {
        
        int contador, contraseña; //Inicializamos las variables de contador y contraseña
        Scanner entrada = new Scanner(System.in); //Creamos la entrada de datos
        
        contador = 0; //Inicializamos la variable contador a 0
        do { //Iniciamos el bucle do while
            
        System.out.println("Introduce la contraseña");
        contraseña = entrada.nextInt(); // Pedimos la contraseña al usuario
            if (contraseña == CONTRASENA_CORRECTA){ //Si la contraseña coincide con la que existe en la constante
                
                System.out.println("Enhorabuena, la contraseña es correcta"); //Imprimimos el mensaje de contraseña correcta
                
            
            }else{ //Si es distinta
                contador++;   //Aumentamos el valor de contador 
                System.out.println("Introduce la contraseña correcta"); //Le mostramos un mensaje de error
                
            }
        }while(contraseña != CONTRASENA_CORRECTA && contador < INTENTOS); //Seguimos pidiendo la contraseña hasta que acierte o hasta que contador llegue a INTENTOS
        
        if (contador == INTENTOS){ //Si contador iguala a los intentos
                    System.out.println("Demasiados intentos. Acceso bloqueado"); //Mostramos el mensaje de acceso denegado
                    }
            
    }
    
}

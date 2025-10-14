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
static final int contraseñacorrecta = 12345;
    public static void main(String[] args) {
        
        int contador, contraseña;
        Scanner entrada = new Scanner(System.in);
        
        contador = 0;
        do {
            
        System.out.println("Introduce la contraseña");
        contraseña = entrada.nextInt();
            if (contraseña == contraseñacorrecta){
                
                System.out.println("Enhorabuena, la contraseña es correcta");
                
            
            }else{
                contador++;   
                System.out.println("Introduce la contraseña correcta");
                
            }
        }while(contraseña != contraseñacorrecta && contador < 3);
        
        if (contador == 3){
                    System.out.println("Demasiados intentos. Acceso bloqueado");
                    }
            
    }
    
}

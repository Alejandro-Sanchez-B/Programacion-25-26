/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio024;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numusuario, i, contador;
        
        Scanner entrada = new Scanner(System.in);
        contador = 0;
        do {
            System.out.println("Introduce un numero para buscarlo");
            numusuario = entrada.nextInt();
            if (numusuario >=1) {
                
                
                System.out.println("Los numeros multiplos de 3 comprendidos entre 1 y " + numusuario + " son: ");
                    for (i=1 ; i<=numusuario ; i++){
                        
                        if (i % 3 == 0){
                         System.out.print(i + " ");
                         
                         contador++;
                        }
                       
                
                } 
                 System.out.println(" ");
                 System.out.println("Hay " + contador + " números multiplos de 3");    
            }else{
                        
                     System.out.println("Error. Introduzca un número mayor a 1");   
                        } 
        
        } while (numusuario < 1);
        
    }
    
}

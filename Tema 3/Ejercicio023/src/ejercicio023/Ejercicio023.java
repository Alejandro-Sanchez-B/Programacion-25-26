/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio023;
import java.util.Scanner;


public class Ejercicio023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numusuario, i;
        
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("Introduce un numero para buscarlo");
            
            numusuario = entrada.nextInt();
            if (numusuario >=1) {
            System.out.println("Los numeros comprendidos entre 1 y " + numusuario + " son: ");
                for (i=1 ; i<=numusuario ; i++){
                     System.out.print(i + " ");
                
                
                }           
            }else{
                        
                     System.out.println("Error. Introduzca un número mayor a 1");   
                        } 
        
        } while (numusuario < 1);
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio015;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nummul,i, resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el numero a calcular");
        nummul = entrada.nextInt();
        
       for(i=0; i<=10; i++){
       
           resultado = nummul * i;
            System.out.println(nummul + " multiplicado por " + i + " es igual a " 
            + resultado);
       
       }
    }
    
}

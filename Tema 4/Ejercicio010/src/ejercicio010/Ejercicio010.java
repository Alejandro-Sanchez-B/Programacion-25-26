/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio010;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio010 {
    public static int pedirnum(){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        num = entrada.nextInt();
        return num;
       }
    
    public static void tablamult(){
        int nummult, i, resultado;

        nummult = pedirnum();

        for(i=0; i<=10; i++){
            resultado = i * nummult;

            System.out.println(nummult + " * " + i + " es igual a " + resultado);

        } 
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tablamult();
    }
    
}

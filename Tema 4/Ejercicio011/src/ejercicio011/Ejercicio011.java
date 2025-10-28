/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio011;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio011 {
    public static float pedirnum (){
        float num;
        Scanner entrada = new Scanner (System.in);
        do{
            System.out.println("Introduzca un numero");
            num=entrada.nextFloat();
            if (num < 0){
                System.out.println("El numero es erroneo");
            }
        }while (num < 0);
        return num;
        
    }
    public static float raizcuadrada (float num) {
         
        return (float)(Math.sqrt(num));
    }
    public static void resultado (){
       float numero, raiz;
       numero = pedirnum(); // se pide una sola vez
       raiz = raizcuadrada(numero);
       System.out.println("La raiz cuadrada de " + numero + " es igual a " + raiz);
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(pedirnum());
    //System.out.println(raizcuadrada());

            resultado();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio028;

/**
 *
 * @author alumno
 */
public class Ejercicio028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double aleatorio = Math.floor(Math.random()*100+1);
        
        int randomentero = (int)aleatorio;
        
        System.out.println("El numero al azar es: " + randomentero);
        
        if(randomentero % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        
        }
    }
    
}

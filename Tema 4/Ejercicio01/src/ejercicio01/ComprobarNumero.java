/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Alex
 */
public class ComprobarNumero {
    public static void Comprobacion(int num){
    
        if (num > 0){
            System.out.println("El numero es positivo");
        }else if(num < 0) {
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El numero es 0");
        }
    }
}

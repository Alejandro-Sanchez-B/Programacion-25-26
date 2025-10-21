/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio025;

/**
 *
 * @author alumno
 */
public class Ejercicio025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int suma = 0;

        for (int i = 17; i <= 139; i++) {
            if (i % 2 == 0) { // Verifica si el número es par
                suma += i;
            }
        }

        System.out.println("La suma de los números pares entre 17 y 139 es: " + suma);
    }
}

    
    


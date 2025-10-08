/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Ahora, introduzca un segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        int n3 = sc.nextInt();
        System.out.print("Por último, introduzca un cuarto numero: ");
        int n4 = sc.nextInt();

        int min1, min2, min3, min4;

        // Encontrar el mínimo (min1)
        if (n1 <= n2 && n1 <= n3 && n1 <= n4) {
            min1 = n1;
            // Encontrar el segundo mínimo entre n2, n3, n4
            if (n2 <= n3 && n2 <= n4) {
                min2 = n2;
                if (n3 <= n4) {
                    min3 = n3;
                    min4 = n4;
                } else {
                    min3 = n4;
                    min4 = n3;
                }
            } else if (n3 <= n2 && n3 <= n4) {
                min2 = n3;
                if (n2 <= n4) {
                    min3 = n2;
                    min4 = n4;
                } else {
                    min3 = n4;
                    min4 = n2;
                }
            } else {
                min2 = n4;
                if (n2 <= n3) {
                    min3 = n2;
                    min4 = n3;
                } else {
                    min3 = n3;
                    min4 = n2;
                }
            }
        } 
        else if (n2 <= n1 && n2 <= n3 && n2 <= n4) {
            min1 = n2;
            // Encontrar el segundo mínimo entre n1, n3, n4
            if (n1 <= n3 && n1 <= n4) {
                min2 = n1;
                if (n3 <= n4) {
                    min3 = n3;
                    min4 = n4;
                } else {
                    min3 = n4;
                    min4 = n3;
                }
            } else if (n3 <= n1 && n3 <= n4) {
                min2 = n3;
                if (n1 <= n4) {
                    min3 = n1;
                    min4 = n4;
                } else {
                    min3 = n4;
                    min4 = n1;
                }
            } else {
                min2 = n4;
                if (n1 <= n3) {
                    min3 = n1;
                    min4 = n3;
                } else {
                    min3 = n3;
                    min4 = n1;
                }
            }
        } 
        else if (n3 <= n1 && n3 <= n2 && n3 <= n4) {
            min1 = n3;
            // Encontrar el segundo mínimo entre n1, n2, n4
            if (n1 <= n2 && n1 <= n4) {
                min2 = n1;
                if (n2 <= n4) {
                    min3 = n2;
                    min4 = n4;
                } else {
                    min3 = n4;
                    min4 = n2;
                }
            } else if (n2 <= n1 && n2 <= n4) {
                min2 = n2;
                if (n1 <= n4) {
                    min3 = n1;
                    min4 = n4;
                } else {
                    min3 = n4;
                    min4 = n1;
                }
            } else {
                min2 = n4;
                if (n1 <= n2) {
                    min3 = n1;
                    min4 = n2;
                } else {
                    min3 = n2;
                    min4 = n1;
                }
            }
        } 
        else {
            min1 = n4;
            // Encontrar el segundo mínimo entre n1, n2, n3
            if (n1 <= n2 && n1 <= n3) {
                min2 = n1;
                if (n2 <= n3) {
                    min3 = n2;
                    min4 = n3;
                } else {
                    min3 = n3;
                    min4 = n2;
                }
            } else if (n2 <= n1 && n2 <= n3) {
                min2 = n2;
                if (n1 <= n3) {
                    min3 = n1;
                    min4 = n3;
                } else {
                    min3 = n3;
                    min4 = n1;
                }
            } else {
                min2 = n3;
                if (n1 <= n2) {
                    min3 = n1;
                    min4 = n2;
                } else {
                    min3 = n2;
                    min4 = n1;
                }
            }
        }

        System.out.println("El orden de los números introducidos es el " + min1 + " - " + min2 + " - " + min3 + " - " + min4);
    }
}

    
    


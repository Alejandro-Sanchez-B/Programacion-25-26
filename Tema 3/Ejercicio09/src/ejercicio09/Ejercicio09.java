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
        Scanner entrada = new Scanner(System.in); // Se crea un objeto Scanner para leer datos desde el teclado

        System.out.print("Por favor, introduzca el primer numero: "); // Se pide al usuario que escriba el primer número
        int n1 = entrada.nextInt(); // Se guarda el primer número introducido en la variable n1
        System.out.print("Ahora, introduzca un segundo numero: "); // Se pide el segundo número
        int n2 = entrada.nextInt(); // Se guarda el segundo número en la variable n2
        System.out.print("Introduzca el tercer numero: "); // Se pide el tercer número
        int n3 = entrada.nextInt(); // Se guarda el tercer número en la variable n3
        System.out.print("Por último, introduzca un cuarto numero: "); // Se pide el cuarto número
        int n4 = entrada.nextInt(); // Se guarda el cuarto número en la variable n4

        int min1, min2, min3, min4; // Se declaran cuatro variables para guardar los números en orden ascendente

        // Encontrar el mínimo (min1)
        if (n1 <= n2 && n1 <= n3 && n1 <= n4) { // Si n1 es el número más pequeño
            min1 = n1; // El primer mínimo es n1
            // Encontrar el segundo mínimo entre n2, n3 y n4
            if (n2 <= n3 && n2 <= n4) { // Si n2 es el siguiente más pequeño
                min2 = n2; // El segundo mínimo es n2
                if (n3 <= n4) { // Si n3 es menor o igual que n4
                    min3 = n3; // El tercero es n3
                    min4 = n4; // El cuarto es n4
                } else { // Si n4 es menor que n3
                    min3 = n4; // El tercero es n4
                    min4 = n3; // El cuarto es n3
                }
            } else if (n3 <= n2 && n3 <= n4) { // Si n3 es el siguiente más pequeño
                min2 = n3; // El segundo mínimo es n3
                if (n2 <= n4) { // Si n2 es menor o igual que n4
                    min3 = n2; // El tercero es n2
                    min4 = n4; // El cuarto es n4
                } else { // Si n4 es menor que n2
                    min3 = n4; // El tercero es n4
                    min4 = n2; // El cuarto es n2
                }
            } else { // Si n4 es el siguiente más pequeño
                min2 = n4; // El segundo mínimo es n4
                if (n2 <= n3) { // Si n2 es menor o igual que n3
                    min3 = n2; // El tercero es n2
                    min4 = n3; // El cuarto es n3
                } else { // Si n3 es menor que n2
                    min3 = n3; // El tercero es n3
                    min4 = n2; // El cuarto es n2
                }
            }
        } 
        else if (n2 <= n1 && n2 <= n3 && n2 <= n4) { // Si n2 es el número más pequeño
            min1 = n2; // El primer mínimo es n2
            // Encontrar el segundo mínimo entre n1, n3 y n4
            if (n1 <= n3 && n1 <= n4) { // Si n1 es el siguiente más pequeño
                min2 = n1; // El segundo mínimo es n1
                if (n3 <= n4) { // Si n3 es menor o igual que n4
                    min3 = n3; // El tercero es n3
                    min4 = n4; // El cuarto es n4
                } else { // Si n4 es menor que n3
                    min3 = n4; // El tercero es n4
                    min4 = n3; // El cuarto es n3
                }
            } else if (n3 <= n1 && n3 <= n4) { // Si n3 es el siguiente más pequeño
                min2 = n3; // El segundo mínimo es n3
                if (n1 <= n4) { // Si n1 es menor o igual que n4
                    min3 = n1; // El tercero es n1
                    min4 = n4; // El cuarto es n4
                } else { // Si n4 es menor que n1
                    min3 = n4; // El tercero es n4
                    min4 = n1; // El cuarto es n1
                }
            } else { // Si n4 es el siguiente más pequeño
                min2 = n4; // El segundo mínimo es n4
                if (n1 <= n3) { // Si n1 es menor o igual que n3
                    min3 = n1; // El tercero es n1
                    min4 = n3; // El cuarto es n3
                } else { // Si n3 es menor que n1
                    min3 = n3; // El tercero es n3
                    min4 = n1; // El cuarto es n1
                }
            }
        } 
        else if (n3 <= n1 && n3 <= n2 && n3 <= n4) { // Si n3 es el número más pequeño
            min1 = n3; // El primer mínimo es n3
            // Encontrar el segundo mínimo entre n1, n2 y n4
            if (n1 <= n2 && n1 <= n4) { // Si n1 es el siguiente más pequeño
                min2 = n1; // El segundo mínimo es n1
                if (n2 <= n4) { // Si n2 es menor o igual que n4
                    min3 = n2; // El tercero es n2
                    min4 = n4; // El cuarto es n4
                } else { // Si n4 es menor que n2
                    min3 = n4; // El tercero es n4
                    min4 = n2; // El cuarto es n2
                }
            } else if (n2 <= n1 && n2 <= n4) { // Si n2 es el siguiente más pequeño
                min2 = n2; // El segundo mínimo es n2
                if (n1 <= n4) { // Si n1 es menor o igual que n4
                    min3 = n1; // El tercero es n1
                    min4 = n4; // El cuarto es n4
                } else { // Si n4 es menor que n1
                    min3 = n4; // El tercero es n4
                    min4 = n1; // El cuarto es n1
                }
            } else { // Si n4 es el siguiente más pequeño
                min2 = n4; // El segundo mínimo es n4
                if (n1 <= n2) { // Si n1 es menor o igual que n2
                    min3 = n1; // El tercero es n1
                    min4 = n2; // El cuarto es n2
                } else { // Si n2 es menor que n1
                    min3 = n2; // El tercero es n2
                    min4 = n1; // El cuarto es n1
                }
            }
        } 
        else { // Si n4 es el número más pequeño
            min1 = n4; // El primer mínimo es n4
            // Encontrar el segundo mínimo entre n1, n2 y n3
            if (n1 <= n2 && n1 <= n3) { // Si n1 es el siguiente más pequeño
                min2 = n1; // El segundo mínimo es n1
                if (n2 <= n3) { // Si n2 es menor o igual que n3
                    min3 = n2; // El tercero es n2
                    min4 = n3; // El cuarto es n3
                } else { // Si n3 es menor que n2
                    min3 = n3; // El tercero es n3
                    min4 = n2; // El cuarto es n2
                }
            } else if (n2 <= n1 && n2 <= n3) { // Si n2 es el siguiente más pequeño
                min2 = n2; // El segundo mínimo es n2
                if (n1 <= n3) { // Si n1 es menor o igual que n3
                    min3 = n1; // El tercero es n1
                    min4 = n3; // El cuarto es n3
                } else { // Si n3 es menor que n1
                    min3 = n3; // El tercero es n3
                    min4 = n1; // El cuarto es n1
                }
            } else { // Si n3 es el siguiente más pequeño
                min2 = n3; // El segundo mínimo es n3
                if (n1 <= n2) { // Si n1 es menor o igual que n2
                    min3 = n1; // El tercero es n1
                    min4 = n2; // El cuarto es n2
                } else { // Si n2 es menor que n1
                    min3 = n2; // El tercero es n2
                    min4 = n1; // El cuarto es n1
                }
            }
        }

        System.out.println("El orden de los números introducidos es el " + min1 + " - " + min2 + " - " + min3 + " - " + min4); // Se muestran los números ordenados de menor a mayor

    }
}

    
    


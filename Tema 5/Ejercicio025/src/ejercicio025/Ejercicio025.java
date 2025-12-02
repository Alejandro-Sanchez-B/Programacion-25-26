/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio025;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio025 {

    public static int pedirRam() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la capacidad de la RAM: ");
        return entrada.nextInt();
    }
    
    public static int pedirDiscoduro() {
        Scanner entrada = new Scanner(System.in);
        int discoduro = 0;
                
        System.out.print("Introduce la capacidad del disco duro: ");
        discoduro = entrada.nextInt();            
        
        if(discoduro % 5 != 0) {
            discoduro = discoduro - discoduro % 5;
            System.out.println("La capacidad del disco duro debe ser múltiplo de 5.");
            System.out.println("Se ha modificado para cumplir con los requisitos: " + discoduro + "GB");
        }
        
        return discoduro;
    }
    
    public static float pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        float precio = 0f;
        
        do {
            System.out.print("Introduce el precio: ");
            precio = entrada.nextFloat();
            
            if(precio <= 0) {
                System.out.println("ERROR: El precio debe ser superior a 0€");
            }
            
        } while(precio <= 0); 
        
        return precio;
    }
    
    public static String pedirGrafica() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el modelo de la tarjeta gráfica: ");
        return entrada.nextLine();
    }
    
    public static String pedirModeloProcesador() {
        int opcion;
        String modelo = "";
        Scanner entrada = new Scanner(System.in);
        
        try {            
            System.out.println("- PROCESADORES -");
            System.out.println("1. Intel Core i3");
            System.out.println("2. Intel Core i5");
            System.out.println("3. Intel Core i9");
            System.out.println("4. AMD Ryzen 5");
            System.out.println("5. AMD Ryzen 7");
            System.out.println("6. AMD Ryzen 9");
            System.out.println("Elige un modelo de procesador:");

            opcion = entrada.nextInt();

            switch(opcion) {
                case 1:
                    modelo = "Intel Core i3";
                    break;
                case 2: 
                    modelo = "Intel Core i5";
                    break;
                case 3:
                    modelo = "Intel Core i9";
                    break;
                case 4: 
                    modelo = "Intel Core i3";
                    break;
                case 5:
                    modelo = "Intel Core i5";
                    break;
                case 6: 
                    modelo = "Intel Core i9";
                    break;
                default:
                    System.out.println("Elige una opción válida entre el 1 y el 6");
            }
        } catch(InputMismatchException e) {
            System.out.println("Opción no válida. Elige un número");
        }
        
        return modelo;
    }
    
    public static int pedirMonitor() {
        Scanner entrada = new Scanner(System.in);
        int tamanio = 0;
        
        do {
            System.out.print("Introduce el tamaño del monitor: ");
            tamanio = entrada.nextInt();
            
            if(tamanio < 14) {
                System.out.println("ERROR: El tamaño debe ser superior a 14");
            }
            
        } while(tamanio < 14); 
        
        return tamanio;
    }
    
    public static String pedirTeclado() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el modelo de teclador: ");
        return entrada.nextLine();
    }
    
    public static String pedirRaton() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el modelo de ratón: ");
        return entrada.nextLine();
    }
    
    public static String pedirMarca() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la marca del portátil: ");
        return entrada.nextLine();
    }
    
    public static int pedirPantalla() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la pantalla: ");
        return entrada.nextInt();
    }
    
    public static float pedirPeso() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el peso del portátil: ");
        return entrada.nextFloat();
    }
    
    public static void main(String[] args) {
        System.out.println("Iniciando montaje de servidor");
        Servidor servidor1 = new Servidor (pedirMonitor(),  pedirTeclado(), pedirRaton(), pedirRam(), pedirDiscoduro(), pedirModeloProcesador(), pedirGrafica(), pedirPrecio());
        System.out.println(servidor1.toString());
    }
    
}

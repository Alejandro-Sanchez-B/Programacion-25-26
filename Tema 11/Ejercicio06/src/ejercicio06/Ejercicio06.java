/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ejercicio06 {
    public static int pedirOpcionMenu(){
        Scanner teclado = new Scanner(System.in);
        int opc;
        System.out.print("   Opcion: ");
        try{
            opc = teclado.nextInt();
        }
        catch(InputMismatchException e){
            opc = 0;
            teclado.next();  
        }
        return opc;
    }

    public static String pedirNombre(String mensaje){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.print(mensaje);
        nombre = teclado.nextLine();
        return nombre;
    }

    public static int pedirImporte(){
        Scanner teclado = new Scanner(System.in);
        int importe;
        System.out.print("Importe: ");
        try{
            importe = teclado.nextInt();
        }
        catch(InputMismatchException e){
            importe = 0;
            teclado.next();  
        }
        return importe;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Campania C = new Campania("Campaña Prueba");
        String nombre;
        int opc, importe;
        Donacion aux;
        do{
            System.out.println("1. Añadir donación ");
            System.out.println("2. Mostrar donaciones ");
            System.out.println("3. Mostrar donaciones por nombre");
            System.out.println("4. Mostrar número de donaciones");
            System.out.println("5. Mostrar total dinero recaudado");
            System.out.println("6. Ordenar donaciones");
            System.out.println("7. Salir");
            opc = pedirOpcionMenu();
            switch(opc){
                case 1:
                    nombre = pedirNombre("Nombre Donante: ");
                    importe = pedirImporte();
                    aux = new Donacion(nombre, importe);
                    C.insDonacion(aux);
                    break;
                case 2:
                    C.mostrarDonaciones();
                    break;
                case 3:
                    nombre = pedirNombre("Nombre Donante: ");
                    C.mostrarDonacionesPorNombre(nombre);
                    break;
                case 4:
                    System.out.println("Hay "+C.getNumeroDonaciones()+" donaciones");
                    break;
                case 5:
                    System.out.println("Total recaudado: "+C.getTotalRecaudado());
                    break;
                case 6:
                    C.ordenarDonaciones();
                    break;
                case 7:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opc != 7);
    }
    
}

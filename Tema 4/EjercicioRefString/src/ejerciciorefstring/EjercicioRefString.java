/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorefstring;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EjercicioRefString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar una variable String 
            String nombre;
            String nombre1;
        // Inicializar variable
            nombre = "Manolo";
            nombre1 = "manolo";
        //Declarar e inicializar a la vez
            String apellido = "Perez";
        //Pedir strig al usuario
            Scanner entrada = new Scanner(System.in);
            System.out.print("Dime tu nombre y apellidos:  ");
            String nombreyapellido = entrada.nextLine();
            System.out.println(nombreyapellido);
        // Comoparar cadenas de caracteres
            if (nombre.equals(apellido)){
                System.out.println("Son iguales");
            }else {
            System.out.println("Son distintos");
            }
            if (nombre.equalsIgnoreCase(nombre1)){
                System.out.println("Son iguales");
            }else {
            System.out.println("Son distintos");
            }
    }
    
}

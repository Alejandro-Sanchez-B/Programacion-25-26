/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Metodos {
    public static String pedirNombre (String texto) throws InputMismatchException {
        System.out.println(texto);
        Scanner entrada = new Scanner (System.in);
        return entrada.nextLine();
    }
    
    public static int pedirNumero (String texto) throws InputMismatchException {
        System.out.println(texto);
        Scanner entrada = new Scanner (System.in);
        return entrada.nextInt();
    }
    
    public static void introducirContacto (ArrayList <Contacto> contactos) throws NullPointerException {
        
        contactos.add(new Contacto(pedirNombre("Introduzca el nombre"), pedirNumero("Introduzca su edad"), pedirNumero("Introduzca su telefono")));
    
    }
    
    public static void mostrarContacto (ArrayList <Contacto> contactos) throws ArrayIndexOutOfBoundsException{
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println("Contacto numero " + (i+1));
            System.out.println("Nombre" + contactos.get(i).getNombre());
            System.out.println("Edad" + contactos.get(i).getEdad());
            System.out.println("Telefono" + contactos.get(i).getTelefono());
        }
    }
    
    public static void eliminarContacto (ArrayList <Contacto> contactos) throws ArrayIndexOutOfBoundsException{
        
        int numerobusq = pedirNumero("Introduzca el numero a buscar");
        for (int i = 0; i < contactos.size(); i++){
            if (numerobusq == contactos.get(i).getTelefono()){
                
            
            }
        
        }
        
    
    
    }
}

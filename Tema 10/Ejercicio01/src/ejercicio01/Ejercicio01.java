/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio01 {
    
    public static void insertarArrayList (ArrayList <String> nombres){
        boolean comprobar = false;
        String opcion;
        String nombre;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("¿Desea introducir un nombre? Y/N");
            opcion = entrada.nextLine();
            if(opcion.equalsIgnoreCase("y")){
                comprobar = true;
                System.out.println("Introduzca el nombre");
                nombre = entrada.nextLine();
                nombres.add(nombre);
            
            }else {
                comprobar = false;
            
            }
        
        
        }while (comprobar == true);
    
    }
    
    
    public static void mostrarArrayList (ArrayList <String> nombres){
        for(String nombre: nombres){
            System.out.println(nombre);        
        }
    
    }
    
    public static void main(String[] args) {
       ArrayList <String> nombres = new ArrayList <>();
       insertarArrayList(nombres);
       System.out.println("");
       mostrarArrayList(nombres);
    }
    
}

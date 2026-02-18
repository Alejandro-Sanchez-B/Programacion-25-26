/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    public static String pedirDia () {
       Scanner entrada = new Scanner (System.in);
       System.out.println("Introduzca el día de la semana");
        
       String cadena = entrada.nextLine();
       return cadena;    
    }
    
    public static void compararDias (String [] dias, String [] posiciones){
        String diausuario = pedirDia();
        int i = 0;
        boolean encontrado = false;
        
        while(i < dias.length && !encontrado){
            if(diausuario.equalsIgnoreCase(dias[i])){
                System.out.println("Es el " + posiciones[i] + " día de la semana"); 
                encontrado = true;
            }else {
                i++;           
            }
        }
        if (!encontrado){
            System.out.println("Ese dia no existe");
        
        }
    
    }
    public static void main(String[] args) {
        String [] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String [] posiciones = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "séptimo"};
        compararDias(dias, posiciones);
    }
    
}

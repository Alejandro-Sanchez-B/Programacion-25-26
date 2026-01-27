/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ejercicio01 {
    public static float pedirNota(){
        Scanner entrada = new Scanner (System.in);
        
        return entrada.nextFloat();    
    }
    
    public static void rellenarArray (Asignatura[] asignaturas, String [] nombreasignatura){
        for(int i =0; i<asignaturas.length; i++){
            System.out.print("Por favor introudzca la nota de " + nombreasignatura[i] + ": ");
            asignaturas[i] = new Asignatura(nombreasignatura[i],pedirNota());
        }                         
    }
    public static void mostrarArray (Asignatura[] asignaturas, String [] nombreasignatura){
        for(Asignatura asignatura : asignaturas){
            System.out.println(asignatura);
        }        
       }
    
    public static float mediaNotas(Asignatura[] asignaturas){
    float total = 0;
    float media;
    
    for(int i =0; i<asignaturas.length; i++){
        total += asignaturas[i].getNota();    
    }
    
    media = total/asignaturas.length;
    
    return media;    
    }
    
    
    public static void main(String[] args) {
        Asignatura[] asignaturas = new Asignatura [7];
        String [] nombreasignatura = {"Programación","Lenguajes de Marcas", "Bases de Datos", "Entornos de Desarrollo", "Sistemas Informáticos" , "Itinerario personal para la empleabilidad", "Inglés profesional"};
        rellenarArray(asignaturas,nombreasignatura);
        mostrarArray(asignaturas,nombreasignatura);
        System.out.printf("La media de las asignaturas es %.2f%n", mediaNotas(asignaturas));
    }
    
}

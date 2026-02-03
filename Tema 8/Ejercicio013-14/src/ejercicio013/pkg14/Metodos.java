/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio013.pkg14;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Metodos {
     static Scanner entrada = new Scanner (System.in);
    
    public static String pedirDato(){
        
        
        return entrada.nextLine();
    }
    
    
    public static void rellenarPosicion (Alumno alumnos []){
        int posicion, edadalumno;
        String nombrealumno;
        float notamedia;
        boolean comprobacion = false;
        do{
            
            System.out.println("Indique la posicion en la que desea inscribir al alumno");
            posicion = Integer.parseInt(pedirDato()) - 1; 
             if (posicion < 0 || posicion >= alumnos.length) {
                System.out.println("Posición fuera de rango.");
                
            } else if (alumnos[posicion] != null) {
                System.out.println("La posición ya está ocupada.");
                
            } else {
                    comprobacion = true;               
                    System.out.println("Por favor, indique el nombre del alumno");
                    nombrealumno = pedirDato();
                    System.out.println("Indique su edad");
                    edadalumno = Integer.parseInt(pedirDato());
                    System.out.println("Indique su nota media");
                    String notamediaStr = pedirDato().replace(",", ".");
                    notamedia = Float.parseFloat(notamediaStr);
                    alumnos[posicion] = new Alumno(nombrealumno,edadalumno,notamedia);
            }
        } while(comprobacion = false);
    }
    
    
    
    public static void mostrarArray (Alumno alumnos []){
        for(int i = 0; i < alumnos.length; i++){
                if(alumnos[i] != null){
                    System.out.println(alumnos[i]);                    
                }else {
                    System.out.println("Posicion vacia"); 
                    
                }
        
            }
        
        }
    
    public static void mostrarNotasAltas(Alumno alumnos []){
        float notadada;
        boolean notaalta = false;
        System.out.println("Introduzca la nota a comparar");
        String notadadaStr = pedirDato().replace(",", ".");
        notadada = Float.parseFloat(notadadaStr);
        for(int i = 0; i< alumnos.length; i++){
            if (alumnos [i] != null && alumnos[i].getNotamedia() > notadada){
                System.out.println(alumnos[i]);
                notaalta = true;
            }
        
        }
        if (!notaalta){
            System.out.println("No hay alumnos que superen esa nota");        
        }
    }
    
    public static void mostrarAlumnosSuspensos (Alumno alumnos []){
        boolean aprobado = false;
        for(int i = 0; i< alumnos.length; i++){
            if (alumnos [i] != null && alumnos[i].getNotamedia() < 5){
                System.out.println(alumnos[i]);
                aprobado = true;
            }
        }
        
        if (!aprobado){
            System.out.println("No hay alumnos suspensos");        
        }
    }
    
    
    public static boolean buscarAlumnos (Alumno alumnos []){
        int i = 0;
        boolean encontrado = false;         
        System.out.println("Introduzca el nombre a buscar");
        String nombredado = pedirDato();
        
        while(i < alumnos.length && !encontrado ){
            
            if(alumnos[i] !=null && nombredado.equalsIgnoreCase(alumnos[i].getNombre())){
                System.out.println("El alumno " + alumnos[i].getNombre() + " está matriculado");
                encontrado= true;
            }else {
                i++;
            }
        
        }
        
        if (!encontrado) {
        System.out.println("El alumno " + nombredado + " NO está matriculado");
    }
        return encontrado;
    }
     public static void mostrarMenu(){
         
         System.out.println("Seleccione una opcion");
         System.out.println("1: Introducir alumnos");
         System.out.println("2: Mostrar alumnos");
         System.out.println("3: Comparar notas");
         System.out.println("4: Buscar alumnos suspensos");
         System.out.println("5: Buscar alumnos matriculados");
         System.out.println("6: Salir");
      
     }
    
    
}

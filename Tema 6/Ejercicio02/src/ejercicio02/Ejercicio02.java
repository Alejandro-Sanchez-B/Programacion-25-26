/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona;
        Profesor Lucas = new Profesor ("Lucas", "Matematicas");
        
        System.out.println(Lucas.saludar());
        
        Alumno Juan = new Alumno ("Juan" , "1º A");
        
        System.out.println(Juan.saludar());
        
        Persona Antonio = new Profesor ("Antonio" , "Ingles");
        
        System.out.println(Antonio.saludar());
        
        persona = new Alumno ("Pepe" , "2B");
        
        System.out.println(persona.saludar());
    }
    
}

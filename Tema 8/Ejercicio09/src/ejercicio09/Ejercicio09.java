/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Alex
 */
public class Ejercicio09 {

    
    
    
    public static void main(String[] args) {
       Alumno[] alumnos = new Alumno[3];
       int menu;
        
        do{
            Metodos.mostrarMenu();
            menu = Metodos.pedirDato();
            
            switch(menu) {
                case 1: { 
                    Metodos.rellenarAlumnos(alumnos);
                    break;
                }
                case 2: {
                   Metodos.mostrarAlumnos(alumnos);
                    break;
                }   
                case 3: {
                   Metodos.mejorAlumno(alumnos);
                            break;
                }
                case 4: {
                    System.out.println("El alumno con mas suspensos es: " + Metodos.alumnoConMasSuspensos(alumnos));
                    break;
                }
                case 5: {
                    Metodos.asignaturaMasDificl(alumnos);
                    break;                
                }
                
                case 6:{
                    System.out.println("Fin del programa");                          
                    break;            
                  }
                               
                default: { 
                    System.out.println("  ");
                    System.out.println("  ");
                    System.out.println("Por favor, introduzca una opcion válida");
                    System.out.println("  ");
                    System.out.println("  ");
                
                
                }
            
            }
           
            
        
        
        
        }while(menu != 6); 
       
       
    }
    
}

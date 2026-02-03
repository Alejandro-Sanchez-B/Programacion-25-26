/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio013.pkg14;

/**
 *
 * @author Alex
 */
public class Ejercicio01314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alumno alumnos [] = new Alumno [5];
       int menu;
        
        do{
            Metodos.mostrarMenu();
            menu = Integer.parseInt(Metodos.pedirDato()); 
            
            switch(menu) {
                case 1: { 
                    Metodos.rellenarPosicion(alumnos);
                    break;
                }
                case 2: {
                   Metodos.mostrarArray(alumnos);
                    break;
                }   
                case 3: {
                   Metodos.mostrarNotasAltas(alumnos);
                            break;
                }
                case 4: {
                    Metodos.mostrarAlumnosSuspensos(alumnos);
                    break;
                }
                case 5: {
                    Metodos.buscarAlumnos(alumnos);
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoarrays;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class ProyectoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura vitrina [] [] = new Figura [3][3];
        int menu = -1;
        
        do{
           try{
            Metodos.mostrarMenu();
            menu = Metodos.pedirOpcion(); 
            
            switch(menu) {
                case 1: { 
                    Metodos.rellenarVitrina(vitrina);
                    break;
                }
                case 2: {
                    Metodos.mostrarColeccion(vitrina);
                    break;
                }   
                case 3: {
                    Metodos.mostrarFiguraMasValiosa(vitrina);
                    break;
                }
                case 4:{
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
            
            
            }catch (InputMismatchException e){
                    System.out.println("Introduzca un numero dentro del rango");
                    
            }catch(NullPointerException e) {
                System.out.println("No hay figuras en la vitrina");
            
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No existe esa posicion dentro dek array");
            }
           
            
        
        
        
        }while(menu != 4); 
        
        
        
    }
    
}

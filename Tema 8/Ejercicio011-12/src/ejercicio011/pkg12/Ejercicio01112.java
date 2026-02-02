/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio011.pkg12;

/**
 *
 * @author alumno
 */
public class Ejercicio01112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mueble muebles [] = new Mueble [4];
        int menu;
        
        do{
            Metodos.mostrarMenu();
            menu = Integer.parseInt(Metodos.pedirDato()); 
            
            switch(menu) {
                case 1: { 
                    Metodos.rellenarArray(muebles);
                    break;
                }
                case 2: {
                    Metodos.mostrarArray(muebles);
                    break;
                }   
                case 3: {
                    Metodos.mostrarPreciosMenor(muebles);
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
           
            
        
        
        
        }while(menu != 4); 
        
    }
        
        
        
    }
    


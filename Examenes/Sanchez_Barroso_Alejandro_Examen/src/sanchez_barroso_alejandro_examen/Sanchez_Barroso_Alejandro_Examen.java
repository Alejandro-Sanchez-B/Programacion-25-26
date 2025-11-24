/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanchez_barroso_alejandro_examen;

/**
 *
 * @author alumno
 */
public class Sanchez_Barroso_Alejandro_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        float volumen;
        do { //Hacemos un bucle para que el usuario siga eligiendo opciones hasta que pulse la opción de salir
            Utilidades.menu(); //Mostramos el menú
            opcion = Utilidades.pedirNum(); //Pedimos la opción
            switch(opcion) {
                case 1: {
                    Calculos.analisisSenal();
                    break;
                }
                case 2: {
                    Calculos.ajustarPotencia();
                    break;
                }
                case 3: {
                    volumen = Calculos.volumenPlaneta();
                    System.out.println("El volumen del planeta es " + volumen); //Mostramos en el main el resultado que nos devuelve el método
                    break;               
                }
                case 4: {
                    System.out.println("Finalización de ajustes...");
                    System.out.println("Que tenga un buen despegue");
                    break;
                }
                default: {
                    System.out.println("Opcion no válida");
                    System.out.println("Riesgo inminente de fallos en el despegue");
                    break;
                
                }
                
                }
                
                
                }while (opcion != 4);
            
            
            }
        
        
        }
    
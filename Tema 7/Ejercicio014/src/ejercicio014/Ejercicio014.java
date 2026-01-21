/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio014;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Ejercicio014 {
   
    
    public static void rellenarMatriz (float temperaturas [][], Scanner entrada){
       float temperatura;
        
        for(int i = 0 ; i < temperaturas.length; i++){
            for(int j = 0; j < temperaturas [0].length; j++){
                System.out.println("Por favor, introduzca la temperatura del día " + (j+1) + " de la semana " + (i+1));
                temperatura = entrada.nextFloat(); 
                temperaturas[i][j] = temperatura;                                
            }       
        }
    }
    
    public static void mostrarMatriz (float temperaturas [][]){
        for(int i = 0 ; i < temperaturas.length; i++){
            for(int j = 0; j < temperaturas [0].length; j++){
                System.out.print(temperaturas[i][j] + " ");           
            }
            System.out.println(" ");
        }
    
    }
        public static float temperaturaMedia (float temperaturas [][]){
            float total = 0,media; 
            
            for(int i = 0 ; i < temperaturas.length; i++){
            for(int j = 0; j < temperaturas [0].length; j++){
               total += temperaturas[i][j] ;           
                    }
                }
            media = total/(temperaturas.length*temperaturas [0].length);
        
            return media;
        
        }
        
    public static void temperaturaMaxima (float temperaturas [][], String dias []){
        float maxima = temperaturas [0] [0];
        for(int i = 0 ; i < temperaturas.length; i++){
            for(int j = 0; j < temperaturas [0].length; j++){
               if (temperaturas[i][j] > maxima) {
                    maxima = temperaturas[i][j];
                        }           
                     }
                }
        System.out.println("El día o días más calurosos fueron: ");
        for(int i = 0 ; i < temperaturas.length; i++){
            for(int j = 0; j < temperaturas [0].length; j++){
               if (temperaturas[i][j] == maxima) {
                    System.out.println("El " + dias[j] +
                                        " de la Semana " + (i + 1) +
                                        " con " + maxima + " grados.");      
                     }
                }
        }
    }
    
    public static void menu(){
         
         System.out.println("Seleccione una opcion");
         System.out.println("1: Introducir temperaturas");
         System.out.println("2: Mostrar temperaturas");
         System.out.println("3: Mostrar temperatura media del mes");
         System.out.println("4: Mostrar dia/dias mas calurosos del mes");
         System.out.println("5: Salir del programa");

                   
     
     }
    
    
    public static void main(String[] args) {
        float temperaturas [] [] = new float [4] [7];
        String dias [] = {"Lunes" , "Martes" , "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int menu;
        
        Scanner entrada = new Scanner(System.in);
        do { 
                    menu();

                    menu = entrada.nextInt(); 

                    switch(menu){ 

                        case 1: { 
                            rellenarMatriz(temperaturas, entrada);
                            break;

                        }
                        case 2: { 
                            mostrarMatriz(temperaturas);
                            break;
                        }
                        case 3:{ 
                            float media = temperaturaMedia(temperaturas);
                            float redondeo = Math.round((media*10.0f))/10.0f;
                            System.out.println("La temeperatura media del mes es: " + redondeo);
                            break;
                        }

                        case 4: {
                            temperaturaMaxima(temperaturas,dias);                            
                              break;
                           }

                        case 5:{ 
                            System.out.println("Fin del programa");
                            break;
                        }

                        default:{ //Si el numero no entra en las opciones, mandamos un mensaje de error
                            System.out.println("     ");
                            System.out.println("     ");
                            System.out.println("Por favor seleccione una opcion valida");
                            System.out.println("     ");
                            System.out.println("     ");

                        }

                    }




                }while(menu != 5 );
         
    }
    
}

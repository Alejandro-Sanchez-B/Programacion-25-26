/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Alex
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> meses = new ArrayList<>(Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", 
                "Junio", "Julio", "Agosto", "Septiembre" , "Octubre", "Noviembre", "Diciembre"));
        
        ArrayList <Integer> numeros = new ArrayList <> ();
        int opcion;
      do {
          Metodos.mostrarMenu();
          opcion = Metodos.pedirNumero();
          
          switch(opcion){
              
              case 1:{
                  Metodos.insertarVentas(numeros, meses);
                  break;            
                }
              case 2:{
                  Metodos.mostrarVentas(numeros, meses);
                  break;
                }
              case 3: {
                  Metodos.mostrarVentasInversas(numeros, meses);
                  break;
              }
              case 4: {
                  Metodos.sumaVentas(numeros);
                  break;
              }
              case 5:{
                  Metodos.filtrarVentasPorLetra(numeros, meses);
                  break;
              }
              case 6:{
                  Metodos.mostrarMayorVenta(numeros, meses);
                  break;
              }
              case 7:{
                  System.out.println("Finalizando programa...");
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
      
      
      }while(opcion != 7);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio011.pkg12;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Metodos {
    static Scanner entrada = new Scanner (System.in);
    
    public static String pedirDato(){
        
        
        return entrada.nextLine();
    }
    
    public static void rellenarArray (Mueble muebles []){
                
        for (int i = 0; i < muebles.length; i++){
            System.out.println("Por favor, introduzca el nombre y tipo de mobiliario: ");
            String descripcion = pedirDato();
           
            System.out.println("Por favor, introduzca su precio: ");
            String precioStr = pedirDato().replace(",", ".");
            float precio = Float.parseFloat(precioStr);
            muebles[i] = new Mueble (descripcion, precio);
            System.out.println("Mueble" + (i+1) + " introducido con exito");
            }
   
    
}
    public static void mostrarArray (Mueble muebles []){
         for(Mueble muebleactual : muebles){
               System.out.println(muebleactual);    
           }        
       }
    
    
    public static void mostrarPreciosMenor(Mueble muebles []){
            System.out.println("Por favor, introduzca el precio a buscar: ");
            String precioStr = pedirDato().replace(",", ".");
            float precio = Float.parseFloat(precioStr);
            for(int i = 0; i < muebles.length; i++){
                if (precio >= muebles[i].getPrecio()){
                    System.out.println(muebles[i]); }
            
            }   
    }
    
     public static void mostrarMenu(){
         
         System.out.println("Seleccione una opcion");
         System.out.println("1: Introducir datos de muebles");
         System.out.println("2: Mostrar muebles");
         System.out.println("3: Mostrar muebles iguales o menores en precio");
         System.out.println("4: Salir");
      
     }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Metodos {
    
    
    public static int pedirNumero (){
        Scanner entrada = new Scanner (System.in);
        return entrada.nextInt();
    } 
    
    public static void insertarVentas (ArrayList <Integer> numeros, ArrayList<String> meses){
        int numero;
        System.out.println("Introduzca las ventas de este año");
        for(int i = 0; i < meses.size(); i++) {
             System.out.println(meses.get(i));
              numero = pedirNumero();
              numeros.add(numero);
        }
    }
    
    public static void mostrarVentas (ArrayList <Integer> numeros, ArrayList<String> meses){
        System.out.println("");
        System.out.println("Las ventas de este año son: ");
        for(int i = 0; i < meses.size(); i++){
            System.out.print(meses.get(i) + " ");
            System.out.println(numeros.get(i));         
        }
    }
    
    
    public static void mostrarVentasInversas (ArrayList <Integer> numeros, ArrayList<String> meses){
        System.out.println("");
        System.out.println("Las ventas de este año en orden inverso son: ");
        for(int i = meses.size() -1 ; i >= 0; i--){
            System.out.print(meses.get(i) + " ");
            System.out.println(numeros.get(i));        
        }
    }
    
     public static void sumaVentas (ArrayList <Integer> numeros) {
        int suma = 0;
               
        for (Integer numero : numeros){
            suma+= numero;
        }
        System.out.println("La suma de todas las ventas es: " + suma);
    }
    
     public static void filtrarVentasPorLetra (ArrayList <Integer> numeros, ArrayList<String> meses){
        System.out.println("Ventas de meses que contienen la letra 'a':");

        for (int i = 0; i < meses.size(); i++) {
            if (meses.get(i).toLowerCase().contains("a")) {
                System.out.println(meses.get(i) + ": " + numeros.get(i));
            }
        }
    }
    
     
     public static void mostrarMayorVenta (ArrayList <Integer> numeros, ArrayList<String> meses){
        int mayor = numeros.get(0);
        int indice = 0;
        for(int i = 0; i < meses.size(); i++){
            if (mayor < numeros.get(i)){
                mayor = numeros.get(i); 
                indice = i;
            }
        
        }
        System.out.println("El mes con más ventas es " + meses.get(indice) + " con " + mayor + " ventas totales");
     }
     
     public static void mostrarMenu(){
         
         System.out.println("Seleccione una opcion");
         System.out.println("1: Introducir ventas de coches por mes");
         System.out.println("2: Mostrar ventas");
         System.out.println("3: Mostrar ventas en orden inverso");
         System.out.println("4: Mostrar total de ventas");
         System.out.println("5: Mostrar ventas de meses que contengan a");
         System.out.println("6: Mostrar mes/es con mas ventas");
         System.out.println("7: Salir");
      
     }
}

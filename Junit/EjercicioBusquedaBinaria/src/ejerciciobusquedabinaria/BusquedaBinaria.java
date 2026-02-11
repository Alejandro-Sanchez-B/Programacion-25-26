/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobusquedabinaria;


public class BusquedaBinaria {
    private int array[]; 
    public BusquedaBinaria (){  
        array = new int [] {1,2,3,4,5,6,7,8,9,10};
    }
   public int busquedaBinaria(int numero){
       int umbral_inferior= 0;// Instruccion 1   NODO 1
       int umbral_superior  = array.length -1; //Instruccion 2 NODO 1
       int respuesta = -1; //Instrucción 3 NODO 1
       int index; //Instruccion 4 NODO 1
       
       while (umbral_inferior <= umbral_superior){  // Instrucción 5 NODO 2
           index = (umbral_inferior + umbral_superior) / 2; //Instrucción 6 NODO 3
           
           if (array[index] == numero){ //Instrucción 7 NODO 4
               respuesta = index; //Instrucción 8 NODO 5
               umbral_inferior = umbral_superior +1; //Instrucción 9 NODO 5            
           } // Instrucción 10 NODO 6
           else if (array[index] < numero){ //Instrucción 11 NODO 7
               umbral_inferior = index +1;   //Instrucción 12 NODO 8        
           } //Instrucción 13 NODO 9
           else { //Instrucción 14 NODO 10
               umbral_superior = index -1; //Instrucción 14 NODO 11           
           } //Instrucción 15 NODO 12
       
       } //Instrucción 16 NODO 13
   return respuesta; //Instrucción 17 NODO 14
   
   } //Instrucción 18 NODO 15
}//Instrucción 19 NODO 16

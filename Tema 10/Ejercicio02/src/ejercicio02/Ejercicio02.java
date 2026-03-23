/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.ArrayList;


/**
 *
 * @author Alex
 */
public class Ejercicio02 {
    
    
    
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList <> ();
        Metodos.insertarNumeros(numeros);
        Metodos.mostrarArrayList(numeros);
        System.out.println("");
        Metodos.sumar(numeros);
        Metodos.mayor(numeros);
        Metodos.menor(numeros);
        
    }
    
}

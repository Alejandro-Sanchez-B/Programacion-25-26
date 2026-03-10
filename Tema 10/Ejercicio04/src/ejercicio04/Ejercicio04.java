/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <Integer> numeros = new ArrayList <> ();
       Metodos.insertarNumeros(numeros);
       Metodos.mostrarArrayList(numeros);
       Metodos.cambiarPorCeros(numeros);
       Metodos.mostrarArrayList(numeros);
    }
    
}

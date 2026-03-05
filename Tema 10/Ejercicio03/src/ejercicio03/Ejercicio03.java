/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList <> ();
        Metodos.insertar(numeros);
        Metodos.mostrarArrayList(numeros);
        Metodos.intercambiarPosiciones(numeros);
        Metodos.mostrarArrayList(numeros);
    }
    
}

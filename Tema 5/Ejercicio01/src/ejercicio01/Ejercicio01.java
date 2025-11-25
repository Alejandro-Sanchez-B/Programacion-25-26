/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche miCoche = new Coche ("Volvo", "Tx" , "Morado" , 0, false);
        Coche cochePadre = new Coche ("Toyota", "XS67" , "Verde" , 0, false);
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.frenarCoche();
        miCoche.frenarCoche();
        cochePadre.acelerarCoche();
        cochePadre.acelerarCoche();
        cochePadre.acelerarCoche();
        cochePadre.apagarCoche();
        miCoche.obtenerEstado();
        System.out.println("    ");
        cochePadre.obtenerEstado();
    }
    
}

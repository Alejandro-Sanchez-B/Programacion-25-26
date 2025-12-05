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
        Calculadora calculadora;
        Suma suma = new Suma (9.9f,9);
        suma.realizarOperacion();
        Multiplicacion multiplicacion = new Multiplicacion (9.9f,9);
        multiplicacion.realizarOperacion();
        Potencia potencia = new Potencia (9.9f,9);
        potencia.realizarOperacion();
        calculadora = new Suma(8.1f,7);
        calculadora.realizarOperacion();
        calculadora = new Multiplicacion(8.1f,7);
        calculadora.realizarOperacion();
        calculadora = new Potencia(8.1f,7);
        calculadora.realizarOperacion();
    }
    
}

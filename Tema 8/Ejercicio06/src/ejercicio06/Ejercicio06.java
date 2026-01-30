/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Alex
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int tamaño = Metodos.elegirTamañoArray();
       Empleado[] empleados = new Empleado[tamaño];       
       Metodos.rellenarArray(empleados);
       Metodos.calcularSueldos(empleados);
       Metodos.mostrarArray(empleados);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio019;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio019 {
 public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del trabajador/a: ");
        return entrada.nextLine();
    }
    
    public static int pedirHoras() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Horas cursadas: ");
        return entrada.nextInt();
    }
    
    public static double pedirTarifa() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tarifa: ");
        return entrada.nextDouble();
    }
    
    public static void mostrarSueldo(Empleado empleado) {
        int horas = empleado.getHoras();
        double tarifa = empleado.getTarifa();
        double salario = 0;
        
        if(horas <= 40) {
            salario = horas * tarifa;
        } else {
            salario = horas * tarifa;
            salario += (horas - 40) * tarifa * 1.5;
        }
        
        
        System.out.println("El salario de " + empleado.getNombre() + " es " + salario + "€");
    
    }
        
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado ("Luis", 34, 26);
        System.out.println(empleado1.toString());
        mostrarSueldo(empleado1);
        Empleado empleado2 = new Empleado ("Carolina" , 48, 23.9);
        System.out.println(empleado2.toString());
        mostrarSueldo(empleado2);
    }
    
}

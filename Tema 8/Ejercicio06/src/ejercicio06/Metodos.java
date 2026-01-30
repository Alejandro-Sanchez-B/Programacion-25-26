/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Metodos {
   static Scanner entrada = new Scanner (System.in);
    
    public static String pedirDato(){
        
        
        return entrada.nextLine();
    }
    
    public static int elegirTamañoArray(){
        int tamañoarray;
        System.out.println("Por favor, indique cuantos empleados va a introducir: ");
        tamañoarray = Integer.parseInt(pedirDato());    
        return tamañoarray;
    }
    
    
    public static void rellenarArray (Empleado empleados []){
                
        for (int i = 0; i < empleados.length; i++){
            System.out.println("Por favor, introduzca el nombre del empleado: ");
            String nombre = pedirDato();
            System.out.println("Por favor, introduzca las horas realizadas: ");            
            int horas = Integer.parseInt(pedirDato());
            System.out.println("Por favor, introduzca la tarifa cobrada: ");
            String tarifaStr = pedirDato().replace(",", ".");
            float tarifa = Float.parseFloat(tarifaStr);
            empleados[i] = new Empleado (nombre, horas, tarifa);
            System.out.println("Empleado " + (i+1) + " introducido con exito");
            }
    
        
    }
    
    public static void calcularSueldos(Empleado[] empleados) {
    for (int i = 0; i < empleados.length; i++) {
        Empleado empleado = empleados[i];

        int horas = empleado.getHoras();
        float tarifa = empleado.getTarifa();
        float sueldo = 0;

        if (horas <= 40) {
            sueldo = horas * tarifa;
        } else {
            sueldo = 40 * tarifa;
            sueldo += (horas - 40) * tarifa * 1.5f;
        }

        empleado.setSueldo(sueldo);
    }
}

    
    public static void mostrarArray (Empleado empleados []){
        for(Empleado empleadoactual : empleados){
            System.out.println(empleadoactual.getNombre() + " hizo " + 
                    empleadoactual.getHoras() + " a " +
                    empleadoactual.getTarifa() + "€ la hora. Su sueldo actual es: "+
                    empleadoactual.getSueldo());    
        }
    
    }
    
}

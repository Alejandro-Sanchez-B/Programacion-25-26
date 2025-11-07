/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorefobjetos;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class EjercicioRefObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Coche miCoche = new Coche();
        System.out.println(miCoche.toString());
        
        miCoche.setEspejos(5);
        System.out.println(miCoche.toString());
        
        Coche tuCoche = new Coche(" Michelin", "Baja", 3);
        System.out.println(tuCoche.toString());
        System.out.println(tuCoche);
        
        System.out.println(tuCoche.getRuedas());


    }
    
}

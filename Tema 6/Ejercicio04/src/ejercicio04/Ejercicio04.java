/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perros perro = new Perros ("Toby", 13.2f, 9);
        Gatos gato = new Gatos ("Bigotes", 6.2f, 12);
        Lobos lobo = new Lobos ("Bobby", 32.9f, 21);
        Leones leon = new Leones ("Austin",45.4f, 16);
        System.out.println(perro);
        perro.sonido();
        perro.alimentacion();
        perro.habitat();
        perro.nombreCientifico();
        System.out.println("     ");
        System.out.println(gato);
        gato.sonido();
        gato.alimentacion();
        gato.habitat();
        gato.nombreCientifico();
        System.out.println("     ");
        System.out.println(lobo);
        lobo.sonido();
        lobo.alimentacion();
        lobo.habitat();
        lobo.nombreCientifico();
        System.out.println("     ");
        System.out.println(leon);
        leon.sonido();
        leon.alimentacion();
        leon.habitat();
        leon.nombreCientifico();
        System.out.println("     ");
        Animal animal;
        animal = new Perros ("Justin", 5.9f, 3);
        System.out.println(animal.toString());
        animal.sonido();
        animal.alimentacion();
        animal.habitat();
        animal.nombreCientifico();
        System.out.println("     ");
        animal = new Gatos ("Whiskas", 3.4f, 7);
        System.out.println(animal.toString());
        animal.sonido();
        animal.alimentacion();
        animal.habitat();
        animal.nombreCientifico();
        
        
    }
    
}

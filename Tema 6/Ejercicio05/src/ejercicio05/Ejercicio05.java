/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       
      Murcielago bobby = new Murcielago ("Bobby", "Macho" , "Verde", 4, 5.6f);
       
      System.out.println(bobby.toString());
      bobby.obtenerMensajeVolador();
      bobby.aumentarAlturaVuelo();
      bobby.mostrarAlturaVuelo();
      bobby.bajarAlturaVuelo();
      bobby.mostrarAlturaVuelo();
      
      Ornitorrinco susan = new Ornitorrinco ("Susan", "Hembra", "Rojo", 14, 7);
      
      susan.obtenerMensajeOviparo();
      susan.ponerHuevo();
      susan.ponerHuevo();
      susan.mostrarNumHuevos();
      susan.incubarHuevo();
      susan.mostrarNumHuevos();
      
      Mamifero mamifero;
      mamifero = new Murcielago ("Loreen", "Hembra", "Negro", 17, 21.3f);
        System.out.println(mamifero.toString());
        
      mamifero = new Ornitorrinco ("Lucas",  "Macho", "Purpura", 9, 3);
        System.out.println(mamifero.toString());
    }
    
}

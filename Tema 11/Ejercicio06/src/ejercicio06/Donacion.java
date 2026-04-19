/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Alex
 */
public class Donacion {
     /*** Atributos ***/
    private String donante;
    private int importe;

    /*** Métodos ***/

    /* Constructor por defecto */
    public Donacion() {
        this.donante = "";
        this.importe = 0;
    }
    
    /* Constructor parametrizado */
    public Donacion(String donante, int importe) {
        this.donante = donante;
        this.importe = importe;
    }

    /* Retorna el nombre del donante */
    public String getDonante() {
        return donante;
    }

    /* Actualiza el nombre del donante */
    public void setDonante(String donante) {
        this.donante = donante;
    }

    /* Retorna el importe de la donación */
    public int getImporte() {
        return importe;
    }

    /* Actualiza el importe de la donación */
    public void setImporte(int importe) {
        this.importe = importe;
    }
        
    /* Muestra la información de la donación */
    public void mostrarDonacion(){
        System.out.println("    Nombre de Donante: "+this.donante);
        System.out.println("    Aportacion: "+this.importe);
    }
}

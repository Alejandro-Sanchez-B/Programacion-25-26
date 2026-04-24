/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Alex
 */
public class Donacion {
    private String donante;
    private int importeDonacion;


    public Donacion() {
        this.donante = "";
        this.importeDonacion = 0;
    }
    
    public Donacion(String donante, int importeDonacion) {
        this.donante = donante;
        this.importeDonacion = importeDonacion;
    }

    public String getDonante() {
        return donante;
    }

    public void setDonante(String donante) {
        this.donante = donante;
    }

    public int getImporteDonacion() {
        return importeDonacion;
    }

    public void setImporteDonacion(int importeDonacion) {
        this.importeDonacion = importeDonacion;
    }
        
    public void mostrarDonacion(){
        System.out.println("    Donante: "+this.donante);
        System.out.println("    Importe: "+this.importeDonacion);
    }
}

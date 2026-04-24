/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Alex
 */
public class Sede {
    private String nomSede;
    private int ingresosAnuales;

    public Sede(){
        this.nomSede = "";
        this.ingresosAnuales = 0;
    }
    
    public Sede(String nomSede, int ingresosAnuales) {
        this.nomSede = nomSede;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNomSede() {
        return nomSede;
    }

    public void setNomSede(String nomSede) {
        this.nomSede = nomSede;
    }

    public int getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(int ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public String toString() {
        return "    Sede{" + "nomSede=" + nomSede + ", ingresosAnuales=" + ingresosAnuales + '}';
    }
}

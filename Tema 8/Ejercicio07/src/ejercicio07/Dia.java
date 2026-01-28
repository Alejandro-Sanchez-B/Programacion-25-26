/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Alex
 */
public class Dia {
    //Atributos
    private String dia;
    private float temperatura;
    
    //Constructores
    public Dia() {
        this.dia = "";
        this.temperatura = 0.0f;
    }

    public Dia(String dia, float temperatura) {
        this.dia = dia;
        this.temperatura = temperatura;
    }
    
    //Getters y Setters

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
    //toString

    
    @Override
    public String toString() {
        return dia + ": " + String.format("%.1f", temperatura) + " grados";
}

    
    
}

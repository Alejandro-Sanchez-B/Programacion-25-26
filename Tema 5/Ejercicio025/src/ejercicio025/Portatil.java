/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio025;

/**
 *
 * @author alumno
 */
public class Portatil extends Ordenador{
    private String marca;
    private int pantalla;
    private float peso;


    public Portatil() {
        super();
        this.marca = "";
        this.pantalla = 0;
        this.peso = 0f;
    }
    public Portatil(String marca, int pantalla, float peso, int ram,int discoduro,String procesador,String grafica,float precio) {
        super(ram,discoduro, procesador, grafica, precio);
        this.marca = marca;
        this.pantalla = pantalla;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Portatil compuesto por: " + "Marca: " + marca + ", Pantalla: " + pantalla +" pixeles " +", Peso: " + peso;
    }        
    
}

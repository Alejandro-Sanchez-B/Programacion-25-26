/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio025;

/**
 *
 * @author alumno
 */
public class Ordenador {
    
    private int ram;
    private int discoduro;
    private String procesador;
    private String grafica;
    private float precio;
    
    public Ordenador(){
        this.ram = 0;
        this.discoduro =0;
        this.procesador = "";
        this.grafica = "";
        this.precio = 0f;
     }
    
    public Ordenador(int ram,int discoduro,String procesador,String grafica,float precio){
        this.ram = ram;
        this.discoduro = discoduro;
        this.procesador = procesador;
        this.grafica = grafica;
        this.precio = precio;
     }
    
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public int getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(int discoduro) {
        this.discoduro = discoduro;
    }
    
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Ordenador compuesto por:" + " Ram :" + ram + ", Disco duro: " + discoduro + ", Procesador: " + procesador + ", Tarjeta Grafica: " + grafica + ", Precio: " + precio + '}';
    }
}

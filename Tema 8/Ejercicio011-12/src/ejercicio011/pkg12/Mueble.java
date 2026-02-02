/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio011.pkg12;

/**
 *
 * @author alumno
 */
public class Mueble {
    private String descripcion;
    private float precio;
    
    public Mueble() {
        this.descripcion = "";
        this.precio = 0.0f;
    }

    public Mueble(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return descripcion + " cuyo precio es " + precio ;
    }
    
    
}

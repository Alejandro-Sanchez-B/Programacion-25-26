/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoarrays;

/**
 *
 * @author alumno
 */
public class Figura {
    //Atributos
    private String nombre;
    private float precio;
    private String coleccion;
    //Constructores
    public Figura() {
        this.nombre = "";
        this.precio = 0.0f;
        this.coleccion = "";
    }

    public Figura(String nombre, float precio, String coleccion) {
        this.nombre = nombre;
        this.precio = precio;
        this.coleccion = coleccion;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
//toString
    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + ", precio=" + precio + ", coleccion=" + coleccion + '}';
    }
        
    
}

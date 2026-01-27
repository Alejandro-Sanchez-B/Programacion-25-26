/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Alex
 */
public class Asignatura {
     //Atributos
    private String nombre;
    private float nota;
    
    //Constructores
    public Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    //toString

    @Override
    public String toString() {
        return "Asignaturas{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
}

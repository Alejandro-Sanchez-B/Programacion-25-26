/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio013.pkg14;

/**
 *
 * @author Alex
 */
public class Alumno {
    private String nombre;
    private int edad;
    private float notamedia;
    
    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notamedia = 0.0f;
    }

    public Alumno(String nombre, int edad, float notamedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notamedia = notamedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(float notamedia) {
        this.notamedia = notamedia;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", notamedia=" + notamedia + '}';
    }
    
    
    
}

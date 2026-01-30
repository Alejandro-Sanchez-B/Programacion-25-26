/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Alex
 */
public class Empleado {
    private String nombre;
    private int horas;
    private float tarifa;
    private float sueldo;
    
    public Empleado() {
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0.0f;
        
    }

    public Empleado(String nombre, int horas, float tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
        
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horas=" + horas + ", tarifa=" + tarifa + ", sueldo=" + sueldo + '}';
    }

   
    
    
    
    
}

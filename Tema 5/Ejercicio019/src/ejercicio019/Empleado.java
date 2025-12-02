/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio019;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private int horas;
    private double tarifa;
    
    public Empleado() {
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0.0;
    }
    
    public Empleado(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
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

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " Horas: "+ horas + " Tarifa: " + tarifa;
    
    }
}

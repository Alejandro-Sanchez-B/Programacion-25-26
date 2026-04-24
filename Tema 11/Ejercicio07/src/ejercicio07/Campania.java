/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Alex
 */
public class Campania {
   
    private String nombre;
    private Set<Donacion> cDonaciones;


    public Campania() {
        this.nombre = "";
        this.cDonaciones = new HashSet<>();
    }
    
    public Campania(String nombre) {
        this.nombre = nombre;
        this.cDonaciones = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Set<Donacion> getcDonaciones() {
        return cDonaciones;
    }

    public void setcDonaciones(Set<Donacion> cDonaciones) {
        this.cDonaciones = cDonaciones;
    }
    
    public void insDonacion(Donacion nDonacion){
        this.cDonaciones.add(nDonacion);
    }
    
    public void mostrarCampania(){
        Iterator<Donacion> it = this.cDonaciones.iterator();
        System.out.println("Campaña: "+this.nombre);
        Donacion aux;
        while(it.hasNext()){
            aux = it.next();
            aux.mostrarDonacion();
        }
    }
    
    public void mostrarDonacionesPorNombre(String nombre){
        Iterator<Donacion> it = this.cDonaciones.iterator();
        Donacion aux;
        while(it.hasNext()){
            aux = it.next();
            if  (aux.getDonante().equalsIgnoreCase(nombre)){
                aux.mostrarDonacion();
            }
        }
    }
    
    public int getTotalRecaudadoEnCampania(){
        Iterator<Donacion> it = this.cDonaciones.iterator();
        Donacion aux;
        int total = 0;
        while(it.hasNext()){
            aux = it.next();
            total = total + aux.getImporteDonacion();
        }
        return total;
    }
    
    public Donacion getMayorDonacionEnCampania(){
        Donacion auxDonacion, mayDonacion = null;
        int importeMayorDonacion = 0;
        Iterator<Donacion> it = this.cDonaciones.iterator();
        while(it.hasNext()){
            auxDonacion = it.next();
            if  (auxDonacion.getImporteDonacion() > importeMayorDonacion){
                importeMayorDonacion = auxDonacion.getImporteDonacion();
                mayDonacion = auxDonacion;
            }
        }
        return mayDonacion;
    }
}

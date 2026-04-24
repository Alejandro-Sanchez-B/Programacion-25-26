/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Alex
 */
public class Ciudad {
     private String nombre;
    private Set<Sede> cSedes;
    
    public Ciudad(){
        this.nombre = "";
        this.cSedes = new LinkedHashSet<>();
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.cSedes = new LinkedHashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public Set<Sede> getcSedes() {
        return cSedes;
    }

    public void setcSedes(Set<Sede> cSedes) {
        this.cSedes = cSedes;
    }
    
    public void rellenarSedes(){
        Scanner tecladoI = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
        String resp, sede;
        int ingresos;
        Sede nSede;
        do{
            System.out.print("Nombre sede: ");
            sede = tecladoS.nextLine();
            System.out.print("Ingresos anuales: ");
            ingresos = tecladoI.nextInt();
            nSede = new Sede(sede, ingresos);
            this.cSedes.add(nSede);
            System.out.println("¿Desea introducir más sedes? (si/no)");
            resp = tecladoS.nextLine();
        }while(resp.equalsIgnoreCase("SI"));
    }
    
    public void insertarUnaSede(Sede nSede){
        this.cSedes.add(nSede);
    }
    
    public void mostrarCiudad(){
        System.out.println("Ciudad: "+this.nombre);
        for(Sede s:this.cSedes){
            System.out.println(s);
        }
    }
    
    
    public int getTotalIngresosDeCiudad(){
        int total = 0;
        for(Sede s:this.cSedes){
            total = total + s.getIngresosAnuales();
        }
        return total;
    }
    
    public int getNumSedes(){
        return this.cSedes.size();
    }
    
    public void mostrarSedeSiMayorMedia(int media){
        for(Sede s:this.cSedes){
            if  (s.getIngresosAnuales() > media){
                System.out.println(s);
            }
        }
    }
    
    
    public boolean buscarSedePorNombre(String nombre){
        Iterator<Sede> it = this.cSedes.iterator();
        boolean enc = false;
        Sede sedeAux;
        while((!enc)&&(it.hasNext())){
            sedeAux = it.next();
            if  (sedeAux.getNomSede().equalsIgnoreCase(nombre)){
                enc = true;
            }
        }
        return enc;
    }
}

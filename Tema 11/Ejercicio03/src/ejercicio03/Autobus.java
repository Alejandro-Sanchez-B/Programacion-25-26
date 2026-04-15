/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Autobus {
    private String matricula;
    private Map <String, Conductor> conductorAsig;
    
    public Autobus() {
        this.matricula = "";
        this.conductorAsig = new HashMap<>();
    }

    public Autobus(String matricula, Map<String, Conductor> conductorAsig) {
        this.matricula = matricula;
        this.conductorAsig = conductorAsig;
    }

    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductorAsig = new HashMap<>();
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<String, Conductor> getConductorAsig() {
        return conductorAsig;
    }

    public void setConductorAsig(Map<String, Conductor> conductorAsig) {
        this.conductorAsig = conductorAsig;
    }

    public void insertarConductores(){
        Scanner entrada = new Scanner(System.in);
        String dni, nombre, resp;
        Conductor conductor;        
        do{
            System.out.print("Introduzca el DNI ");
            dni = entrada.nextLine();
            System.out.print("Introduzca el nombre ");
            nombre = entrada.nextLine();
            conductor = new Conductor(dni, nombre);
            this.conductorAsig.put(dni, conductor);
            System.out.println("¿Desea introducir más conductores?");
            resp = entrada.nextLine();
        }while(resp.equalsIgnoreCase("SI"));
    }
    public void mostrarAutobus(){
        Conductor conductor;
        System.out.println("Matrícula: "+this.matricula);
        for(String clave:conductorAsig.keySet()){
            conductor = conductorAsig.get(clave);
            System.out.println(conductor);
        }
    }
    public boolean buscarConductor(String dni){
        if  (this.conductorAsig.containsKey(dni)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getNumConductores(){
        return this.conductorAsig.size();
    }
    
    
    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", conductorAsig=" + conductorAsig + '}';
    }

   
    
}

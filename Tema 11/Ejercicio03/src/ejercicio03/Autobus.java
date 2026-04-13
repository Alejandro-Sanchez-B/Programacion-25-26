/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class Autobus {
    private String matricula;
    private Map <String, String> conductores = new HashMap<>(); 

    public Autobus(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(Map<String, String> conductores) {
        this.conductores = conductores;
    }

    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", conductores=" + conductores + '}';
    }
    
    
}

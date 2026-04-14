/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alex
 */
public class Autobus {
    private String matricula;
    private Map <String, String> conductorAsig;
    
    public Autobus() {
        this.matricula = "";
        this.conductorAsig = new HashMap<>();
    }

    public Autobus(String matricula, Map<String, String> conductorAsig) {
        this.matricula = matricula;
        this.conductorAsig = conductorAsig;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<String, String> getConductorAsig() {
        return conductorAsig;
    }

    public void setConductorAsig(Map<String, String> conductorAsig) {
        this.conductorAsig = conductorAsig;
    }

    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", conductorAsig=" + conductorAsig + '}';
    }

   
    
}

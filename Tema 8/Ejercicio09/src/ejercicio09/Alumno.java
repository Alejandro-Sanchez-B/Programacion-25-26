/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Alex
 */
public class Alumno {
    private String nombre;
    private Asignatura[] notas;
    private final String[] NOMBRES_ASIGNATURAS = {"Lengua", "Matematicas", "Historia", "Física"};
    
    public Alumno() {
     this.nombre = "";
     this.notas = new Asignatura[4];
        
     for(int i = 0; i < notas.length; i++) {
      notas [i] = new Asignatura (NOMBRES_ASIGNATURAS[i]);
        }                
    }
    
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new Asignatura[4];
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }
    
    public Alumno(String nombre, Asignatura[] notas) {
        this.nombre = nombre;
        this.notas = notas;
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }
 public float pedirNota() {
        Scanner entrada = new Scanner(System.in);       
        return entrada.nextFloat();
    }
    
    public void rellenarArray() {
        for(int i = 0; i < notas.length; i++) {
            System.out.println("Por favor introduzca la nota de " + NOMBRES_ASIGNATURAS[i] + " para el alumno " + nombre);
            notas[i].setNota(pedirNota());
        }
    }
    
    public void mostrarArray() {
        for(Asignatura a : notas) {
            System.out.println(a);
        }
    }
    
    public float calcularMedia() {
        float media = 0;
        
        for(Asignatura asignatura : notas) {
            media += asignatura.getNota();
        }
        
        return media / notas.length;
    }


    
    @Override
    public String toString() {
        return nombre + ":" + "\n · " + Arrays.toString(notas);
    }
}

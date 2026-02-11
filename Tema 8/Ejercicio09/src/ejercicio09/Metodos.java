/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Metodos {
    
    
    public static int pedirDato() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
     public static void rellenarAlumnos(Alumno[] alumnos) {
        String[] nombreAlumnos = {"Pepe", "Juan", "Marta"};
        
        for(int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(nombreAlumnos[i]);
            alumnos[i].rellenarArray();
        }
    }
     
     public static void mostrarAlumnos(Alumno[] alumnos) {
        for(Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
     public static void mejorAlumno(Alumno[] alumnos) {
        Alumno mejorAlumno = new Alumno();
        float mejorMedia = 0;
        
        for(int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].calcularMedia() > mejorMedia) {
                mejorMedia = alumnos[i].calcularMedia();
                mejorAlumno = alumnos[i];
            }
        }
        
        System.out.println("El mejor alumno es " + mejorAlumno + " con una media de " + mejorMedia);
        
    }
     
    public static Alumno alumnoConMasSuspensos(Alumno[] alumnos) {
    Alumno alumnoMasSuspensos = null;
    int maxSuspensos = -1;

    for (Alumno alumno : alumnos) {
        int suspensos = 0;

        for (Asignatura asignatura : alumno.getNotas()) {
            if (asignatura.getNota() < 5) {
                suspensos++;
            }
        }

        if (suspensos > maxSuspensos) {
            maxSuspensos = suspensos;
            alumnoMasSuspensos = alumno;
        }
    }

    return alumnoMasSuspensos;
}

     
      public static void asignaturaMasDificl(Alumno[] alumnos) {
        float mediaMasBaja = 11;
        Asignatura asignaturaMasDificil = null;
        
        
        for(int j = 0; j < alumnos[0].getNotas().length; j++) {
            float aux = 0;                       
            for(int i = 0; i < alumnos.length; i++) {
              
              aux += alumnos[i].getNotas()[j].getNota();
            }
            
           float media = aux / alumnos.length;
            
           if (media < mediaMasBaja) {
            mediaMasBaja = media;
            asignaturaMasDificil = alumnos[0].getNotas()[j];
        }
            
        }
        
       
        System.out.println("Asignatura más difícil: " +
            asignaturaMasDificil.getNombre() +
            " con media " + mediaMasBaja);
    }
       public static void mostrarMenu(){
         
         System.out.println("Seleccione una opcion");
         System.out.println("1: Introducir notas");
         System.out.println("2: Mostrar notas");
         System.out.println("3: Mostrar mejor alumno del aula");
         System.out.println("4: Mostrar alumno con más suspensos");
         System.out.println("5: Mostrar asignatura más dificil");
         System.out.println("6: Salir");
      
     }
}

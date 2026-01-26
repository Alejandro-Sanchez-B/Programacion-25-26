/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio016;
import java.util.Scanner;


   
/**
 *
 * @author alumno
 */
public class Ejercicio016 {

    public static void rellenarMatriz (int notas [][], Scanner entrada, String alumnos [], String asignaturas[]){
        int nota;
        for(int i = 0 ; i < notas.length; i++){
            for(int j = 0; j < notas [0].length; j++){
                System.out.println("Por favor, introduzca la nota del alumno " + alumnos[i] + " de la asignatura " + asignaturas[j]);
                nota = entrada.nextInt(); 
                notas[i][j] = nota;                                
            }     
    }
}
        public static void mostrarMatriz (int notas [][]){
        for(int i = 0 ; i < notas.length; i++){
            for(int j = 0; j < notas [0].length; j++){
                System.out.print(notas[i][j] + " ");           
            }
            System.out.println(" ");
        }    
    }
    
    
    }
    public static void main(String[] args) {
        int notas [][] = new int[6][4];
        String alumnos [] = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        String asignaturas [] = {"Lengua", "Mates", "Historia" ,"Física"};
        Scanner entrada = new Scanner (System.in);
        rellenarMatriz(notas, entrada, alumnos, asignaturas);
        mostrarMatriz(notas);
        }
    



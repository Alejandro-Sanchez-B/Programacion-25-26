/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Metodos {
    
  
    public static int pedirPosicion(Autobus [] autobuses){
        Scanner entrada = new Scanner(System.in);
        int posicion = -1;
        boolean error;
        do{
            error = false;
            try{
                System.out.println("Posición: ");
                posicion = entrada.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Debe introducir un número.");
                entrada.next();  //Limpiar buffer
                error = true;
            }
            //Si nos salimos del rango del vector
            if  ((posicion < 0)||(posicion >= autobuses.length)){
                error = true;
            }
        }while(error == true);
        return posicion;
    } 
    
    public static Autobus pedirAutobus(){
        Scanner entrada = new Scanner(System.in);
        String matricula;
        Autobus autobus;
        System.out.print("Matrícula: ");
        matricula = entrada.nextLine();
        autobus = new Autobus(matricula);
        autobus.insertarConductores();
        return autobus;
    }
    public static void aparcar(Autobus [] autobuses){
        int posicion;
        Autobus autobus;
        do{
            posicion = pedirPosicion(autobuses);
            if  (autobuses[posicion] != null){
                System.out.println("Posición "+posicion+" ocupada");
            }
        }while(autobuses[posicion] != null);
        autobus = pedirAutobus();
        autobuses[posicion] = autobus;
    }
    public static void mostrarLibres(Autobus [] autobuses){
        System.out.println("Dársenas libres: ");
        for(int i = 0; i < autobuses.length;i++){
            if  (autobuses[i] == null){
                System.out.print("["+i+"]");
            }
        }
        System.out.print("\n");  //Salto de línea
    }
    
    public static void buscarAutobus(String matricula, Autobus[] autobuses){
        int i = 0;
        boolean encontrado = false;
        while((!encontrado)&&(i < autobuses.length)){
            if (autobuses[i] != null){  //Si está ocupada la celda
                if  (matricula.equalsIgnoreCase(autobuses[i].getMatricula())){
                    encontrado = true;
                }
            }
            i++;
        }
        if  (encontrado){
            autobuses[i-1].mostrarAutobus();
        }
        else{
            System.out.println("No existe autobús con la matrícula "+matricula);
        }
    }
    
    public static void mostrarMatricula(Autobus[] autobuses, String dni){
        int i = 0;
        boolean encontrado = false;
        while((!encontrado)&&(i < autobuses.length)){
            try{
                encontrado = autobuses[i].buscarConductor(dni);
                if  (encontrado){
                    System.out.println("El conductor con dni "+dni+" tiene asignado el autobús "+autobuses[i].getMatricula());
                }
            }
            catch(NullPointerException e){
                System.out.println("No hay ningún autobús aparcado en la celda " + i);
            }
            finally{
                i++;
            }
        }
       if  (!encontrado){
            System.out.println("No existe el conductor con DNI: "+dni);
        }
    }
    
    
    public static int PosicionBusMasConductores(Autobus[] autobuses){
        int mayor, posicion = 0;
        try{
            mayor = autobuses[0].getNumConductores();
        }
        catch(NullPointerException e){
            mayor = 0;  
            //Lo correcto sería BUSCAR la primera posición ocupada para llamar al getNumConductores() para esa posición
        }
        for(int i = 1;i < autobuses.length;i++){
            if  (autobuses[i] != null){
                if  (autobuses[i].getNumConductores() > mayor){
                    mayor = autobuses[i].getNumConductores();
                    posicion = i;
                }
            }
        }
        return posicion;
    }
    
    

}
        
    
    


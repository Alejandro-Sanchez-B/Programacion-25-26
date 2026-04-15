/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Autobus [] autobuses = new Autobus [6]; 
       Scanner entrada = new Scanner (System.in);
       Scanner entrada2 = new Scanner (System.in);
       int opc;
        String matricula, dni;
        do{
            System.out.println("1. Aparcar.");
            System.out.println("2. Mostrar dársenas libres.");
            System.out.println("3. Buscar autobús.");
            System.out.println("4. Buscar conductor.");
            System.out.println("5. Mas conductores.");
            System.out.println("6. Salir");
            System.out.print("   Opción: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    Metodos.aparcar(autobuses);
                    break;
                case 2:
                    Metodos.mostrarLibres(autobuses);
                    break;
                case 3:
                    System.out.print("Matrícula: ");
                    matricula = entrada2.nextLine();
                    Metodos.buscarAutobus(matricula, autobuses);
                    break;
                case 4:
                    System.out.print("DNI: ");
                    dni = entrada2.nextLine();
                    Metodos.mostrarMatricula(autobuses, dni);
                    break;
                case 5:
                    System.out.println("Posición del autobús con más conductores: "+Metodos.PosicionBusMasConductores(autobuses));
                    break;
            }
        }while(opc != 6);
    }
       
    }
    


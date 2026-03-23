/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanchezbarroso_alejandro_examenra6;

/**
 *
 * @author alumno
 */
public class SanchezBarroso_Alejandro_ExamenRA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coches [] = new Coche [9];
        int opcion;
       do{
        Metodos.menu();

        opcion = Metodos.pedirInt();

        switch (opcion){
            case 1:{  
                Metodos.aparcarCoche(coches);
                break;
            }
            
            case 2:{
                Metodos.mostrarPlazasLibres(coches);
                break;            
            }
            
            case 3:{
                Metodos.mostrarCochesAparcados(coches);
                break;                      
            
            }
            
            case 4:{
                break;            
            
            }
            
            case 5:{
                System.out.println(Metodos.buscarGaraje(coches));
                break;
            
            }
            
            case 6:{
                char plazas [][] = new char [3][3];
                Metodos.mostrarEstadoGaraje(coches, plazas);
            
            }
            
            case 7:{
                System.out.println("Cerrando programa...");
                break;
            
            
            }
            default:{
                System.out.println("Elija una opcion valida");
            }


        }


       
       }while(opcion != 7);
       
       
       
       }
    }
    


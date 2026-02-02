/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ejercicio07 {
    
     public static int pedirNumero() {
    int num;
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = entrada.nextInt();
       
     
        return num;
    
  }

    public static void rellenarArray (Dia temperaturasmes [], String dias []){
        
        int indiceDia = (int) (Math.random() * 7);

    for (int i = 0; i < temperaturasmes.length; i++) {

        String diaSemana = dias[indiceDia];
        float temperatura = (float) (Math.random() * 77 - 30);

        temperaturasmes[i] = new Dia(diaSemana, temperatura);

       
        indiceDia = (indiceDia + 1) % 7;
    }
    }
    public static void mostrarArray (Dia temperaturasmes [], String dias []){
        for(Dia temperaturasdias : temperaturasmes){
            System.out.println(temperaturasdias);
        }        
       }
    
    
    
    public static float mediaTemperaturas(Dia temperaturasmes []){
    float total = 0;
    float media;
    
    for(int i =0; i<temperaturasmes.length; i++){
        total += temperaturasmes[i].getTemperatura();    
    }
    
    media = total/temperaturasmes.length;
    
    return media;    
    }
    
    public static void temperaturaMaxima (Dia temperaturasmes [], String dias []){
        Dia maxima = temperaturasmes [0];
        for (int i = 1; i < temperaturasmes.length; i++) {
        if (temperaturasmes[i].getTemperatura() > maxima.getTemperatura()) {
            maxima = temperaturasmes[i];
        }
    }
        System.out.println("El día o días más calurosos fueron: ");
        for (int i = 0; i < temperaturasmes.length; i++) {
        if (temperaturasmes[i].getTemperatura() == maxima.getTemperatura()) {
            System.out.println(
                temperaturasmes[i].getDia() +
                " día " + (i + 1) +
                " con " + String.format("%.1f", temperaturasmes[i].getTemperatura()) + " grados."
            );
        }
    }
            }
    public static void mostrarMenu(){
         
         System.out.println("Seleccione una opcion");
         System.out.println("1: Rellenar temperaturas");
         System.out.println("2: Mostrar Temperaturas");
         System.out.println("3: Calcular temperatura media");
         System.out.println("4: Mostrar temperatura más alta");
         System.out.println("5: Salir");
      
     }
    
    public static void main(String[] args) {
        Dia temperaturasmes [] = new Dia [30];
        String dias [] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int menu;
        
        
        do{
            mostrarMenu();
            menu = pedirNumero(); 
            
            switch(menu) {
                case 1: { 
                    rellenarArray(temperaturasmes, dias);
                    break;
                }
                case 2: {
                    mostrarArray(temperaturasmes, dias);
                    break;
                }   
                case 3: {
                    float media = mediaTemperaturas(temperaturasmes);
                            float redondeo = Math.round((media*10.0f))/10.0f;
                            System.out.println("La temeperatura media del mes es: " + redondeo);
                            break;
                }
                case 4:{
                    temperaturaMaxima(temperaturasmes,dias);                            
                    break;
                
                }
                
                case 5:{
                System.out.println("Fin del programa"); 
                    break;
                
                }
                
                default: { 
                    System.out.println("  ");
                    System.out.println("  ");
                    System.out.println("Por favor, introduzca una opcion válida");
                    System.out.println("  ");
                    System.out.println("  ");
                
                
                }
            
            }
           
            
        
        
        
        }while(menu != 5); 
        
    }
    
        
        
    }



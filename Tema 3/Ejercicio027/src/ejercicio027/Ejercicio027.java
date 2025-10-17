/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio027;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Alex
 */
public class Ejercicio027 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int num1,num2,resultado,menu;
            
            
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Introduzca el primer numero");
            num1 = entrada.nextInt();
            
            System.out.println("Introduzca el segundo numero");
            num2 = entrada.nextInt();
            
            do {
                System.out.println("Seleccione una opcion");
                System.out.println("1: Suma");
                System.out.println("2: Resta");
                System.out.println("3: Multiplicacion");
                System.out.println("4: Division");
                System.out.println("5: Salir del programa");
                
                menu = entrada.nextInt();
                
                switch(menu){
                
                    case 1: {
                        resultado = num1 + num2;
                        System.out.println("La suma de " + num1 + " mas " + num2 + " es: " + resultado);
                        System.out.println("     ");
                        System.out.println("     ");
                        break;
                    
                    }
                    case 2: {
                        resultado = num1 - num2;
                        System.out.println("La resta de " + num1 + " menos " + num2 + " es: " + resultado);
                        System.out.println("     ");
                        System.out.println("     ");
                        break;
                    }
                    case 3:{
                        resultado = num1 * num2;
                        System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es: " + resultado);
                        System.out.println("     ");
                        System.out.println("     ");
                        break;
                    }
                    
                    case 4: {
                            resultado = num1 / num2;
                            System.out.println("La division de " + num1 + " entre " + num2 + " es: " + resultado);
                            System.out.println("     ");
                            System.out.println("     ");
                            break;
                       
                       }
                    
                    case 5:{
                        System.out.println("Fin del programa");
                        break;
                    }
                    
                    default:{
                    
                        System.out.println("Por favor seleccione una opcion valida");
                        System.out.println("     ");
                        System.out.println("     ");
                    
                    }
                   
                }
                
                
            
            
            }while(menu != 5);
        
        
        
        }catch(InputMismatchException e){
            System.out.println("Introduce un valor válido");
        
        }catch (ArithmeticException e){
                        System.out.println("No se puede dividir por 0");}
        }     
        
    }
    


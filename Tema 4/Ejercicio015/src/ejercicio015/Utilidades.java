/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio015;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Utilidades {
    public static int pedirNumero() {
    int num;
    
    
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = entrada.nextInt();
       
     
        return num;
    
  }
     
     public static void menu(){
         
         System.out.println("Seleccione una opcion");
         System.out.println("1: Suma");
         System.out.println("2: Resta");
         System.out.println("3: Multiplicacion");
         System.out.println("4: Division");
         System.out.println("5: Salir del programa");

                   
     
     }
     
     public static void calculadora (){
         
                int menu,num1,num2, resultado;
         
                

                
                num1 = pedirNumero() ;//Pedimos el primer numero

                
                num2 = pedirNumero();//Pedimos el segundo numero
                
                do { //Creamos un bucle do while para repetir el menu hasta que el usuario pulse 5
                    menu();

                    menu = pedirNumero(); //Pedimos al usuario el numero del menu 

                    switch(menu){ //Creamos un menu

                        case 1: { //En la primera opcion, hacemos una suma
                            resultado = Calculadora.suma(num1, num2);
                            System.out.println("     ");
                            System.out.println("     ");
                            System.out.println("La suma de " + num1 + " mas " + num2 + " es: " + resultado);
                            System.out.println("     ");
                            System.out.println("     ");
                            break;

                        }
                        case 2: { //En la segunda opcion hacemos una resta
                            resultado = Calculadora.resta(num1, num2);
                            System.out.println("     ");
                            System.out.println("     ");
                            System.out.println("La resta de " + num1 + " menos " + num2 + " es: " + resultado);
                            System.out.println("     ");
                            System.out.println("     ");
                            break;
                        }
                        case 3:{ //En la tercera opcion hacemos una multiplicacion
                            resultado = Calculadora.multiplicacion(num1, num2);
                            System.out.println("     ");
                            System.out.println("     ");
                            System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es: " + resultado);
                            System.out.println("     ");
                            System.out.println("     ");
                            break;
                        }

                        case 4: { //En la cuarta opcion hacemos una division
                            try{ //Iniciamos un try    
                            
                            resultado = Calculadora.division(num1, num2);
                                System.out.println("     ");
                                System.out.println("     ");
                                System.out.println("La division de " + num1 + " entre " + num2 + " es: " + resultado);
                                System.out.println("     ");
                                System.out.println("     ");
                                break;
                            }catch(ArithmeticException e){
                                
                                System.out.println("No se puede dividir por cero");
                            }
                           }

                        case 5:{ //La opcion 5 saca al usuario del programa
                            System.out.println("Fin del programa");
                            break;
                        }

                        default:{ //Si el numero no entra en las opciones, mandamos un mensaje de error
                            System.out.println("     ");
                            System.out.println("     ");
                            System.out.println("Por favor seleccione una opcion valida");
                            System.out.println("     ");
                            System.out.println("     ");

                        }

                    }




                }while(menu != 5 ); //Seguimos repitiendo el menu hasta que el usuario pulse 5
         
     
     
     }
}



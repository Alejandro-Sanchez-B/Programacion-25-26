/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio027;
import java.util.Scanner; //Importamos la clase Scanner
import java.util.InputMismatchException; //Importamos la clase InputMismatchException
/**
 *
 * @author Alex
 */
public class Ejercicio027 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,resultado,menu; //Creamos las variables de los numeros a calcular, el resultado y el numero del menu
       
        Scanner entrada = new Scanner(System.in); //Creamos la entrada de datos
        
      
            try{ //Iniciamos un try
                

                System.out.println("Introduzca el primer numero");
                num1 = entrada.nextInt();//Pedimos el primer numero

                System.out.println("Introduzca el segundo numero");
                num2 = entrada.nextInt();//Pedimos el segundo numero
                
                do { //Creamos un bucle do while para repetir el menu hasta que el usuario pulse 5
                    System.out.println("Seleccione una opcion");
                    System.out.println("1: Suma");
                    System.out.println("2: Resta");
                    System.out.println("3: Multiplicacion");
                    System.out.println("4: Division");
                    System.out.println("5: Salir del programa");

                    menu = entrada.nextInt(); //Pedimos al usuario el numero del menu 

                    switch(menu){ //Creamos un menu

                        case 1: { //En la primera opcion, hacemos una suma
                            resultado = num1 + num2;
                            System.out.println("     ");
                            System.out.println("     ");
                            System.out.println("La suma de " + num1 + " mas " + num2 + " es: " + resultado);
                            System.out.println("     ");
                            System.out.println("     ");
                            break;

                        }
                        case 2: { //En la segunda opcion hacemos una resta
                            resultado = num1 - num2;
                            System.out.println("     ");
                            System.out.println("     ");
                            System.out.println("La resta de " + num1 + " menos " + num2 + " es: " + resultado);
                            System.out.println("     ");
                            System.out.println("     ");
                            break;
                        }
                        case 3:{ //En la tercera opcion hacemos una multiplicacion
                            resultado = num1 * num2;
                            System.out.println("     ");
                            System.out.println("     ");
                            System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es: " + resultado);
                            System.out.println("     ");
                            System.out.println("     ");
                            break;
                        }

                        case 4: { //En la cuarta opcion hacemos una division
                                resultado = num1 / num2;
                                System.out.println("     ");
                                System.out.println("     ");
                                System.out.println("La division de " + num1 + " entre " + num2 + " es: " + resultado);
                                System.out.println("     ");
                                System.out.println("     ");
                                break;

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



            }catch(InputMismatchException e){ //Capturamos la excepcion de introducir un valor no correcto
                System.out.println("Introduce un valor válido");
                
            
                 
            } 
        
        }  

    
    


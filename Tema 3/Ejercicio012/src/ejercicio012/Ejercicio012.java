/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio012;

/**
 *
 * @author alumno
 */
public class Ejercicio012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numpar = 11; //Declaramos la variable que almacene los numeros pares y la inicializamos a 11
        do{ // Iniciamos el bucle do while 
        
            if (numpar % 2 == 0){ //Si el cociente del numero entre 2 es 0
                System.out.println(numpar); //Mostramos el numero
                numpar++;//Incrementamos el valor de numpar en 1
            
            }else {//En caso de que no se cumpla
                numpar++;//Solo incremetamos el valor de numpar en 1
            }
        
        }while(numpar <=133); //Mientras numpar sea menor o igual a 133
    
    
    }
    
}

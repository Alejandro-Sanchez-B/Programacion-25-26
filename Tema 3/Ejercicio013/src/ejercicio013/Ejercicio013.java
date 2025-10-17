/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio013;

/**
 *
 * @author alumno
 */
public class Ejercicio013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numpar = 11; //Inicializamos la variable numpar en 11
        
        while (numpar<=133){ //Creamos el bucle while, diciendo que mientras numpar sea menor o igual a 133 haga
        
         if (numpar % 2 == 0){ //Si el cociente de numpar entre 2 es 0
                System.out.println(numpar); //Mostramos numpar
                numpar++; //Aumentamos en 1 el valor numpar
            
            }else {
                numpar++; //En caso de que sea distinto a 0, solo aumentamos el valor
            }
        
        }
    }
    
}

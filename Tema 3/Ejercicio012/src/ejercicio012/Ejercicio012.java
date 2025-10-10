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
        
        int numpar = 11;
        do{
        
            if (numpar % 2 == 0){
                System.out.println(numpar);
                numpar++;
            
            }else {
                numpar++;
            }
        
        }while(numpar <=133);
    
    
    }
    
}

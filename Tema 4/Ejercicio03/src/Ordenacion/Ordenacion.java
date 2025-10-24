/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenacion;

/**
 *
 * @author Alex
 */
public class Ordenacion {
    public static float Ordenar(float num1, float num2,float num3){
    
          if ((num1 > num2) && (num1 > num3)) {
            return num1;
        }else if ((num2 > num1) && (num2 > num3)){
           return num2;
        }else 
           return num3;
        
    }
    }


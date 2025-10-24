/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioref1;

/**
 *
 * @author alumno
 */
public class Calculadora {
    
    /**
     * Metodo que devuelve la suma de dos numeros
     * @param num1
     * @param num2
     * @return la suma de los dos numeros
     * 
     */
    
    public static int suma(int num1, int num2) {
        return num1 + num2;
        }
    /**
     * Metodo que devuelve la resta de dos numeros
     * @param num1
     * @param num2
     * @return la resta de los dos numeros
     * 
     */
        public static int resta(int num1, int num2) {
        return num1 - num2;
        
        }
          /**
      * Metodo que multiplica dos numeros pasados por parametros
      * @param num1
      * @param num2
      * @return la multiplicacion de ambos numeros
      */
     public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }
     
     /**
      * Metodo que divide dos numeros pasados por parametros
      * @param num1
      * @param num2
      * @return la division de ambos numeros
      */
     public static int division(int num1, int num2) {
        return num1 / num2;
    }
     /**
      * Metodo que calcula la raiz cuadradad de un numero pasado por parametro
      * @param num1
      * @return la raiz cuadrada
      */
     public static double RaizCuadrada(int num1){
     return Math.sqrt(num1);
     }
     

}

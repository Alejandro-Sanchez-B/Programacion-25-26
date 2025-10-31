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
     public static double raizCuadrada(int num1){
        return Math.sqrt(num1);
     }
     /**
      * Método para calcular un numero pasado por parámetro a otro que nos pase el usuario tambien por parametro
      * @param num1
      * @param num2
      * @return El exponente del segundo numero elevado al primero
      */
    public static double potencia (int num1, float num2) {
        return Math.pow(num1, num2);
    }
    /**
     * Metodo para redondear un numero pasado por parámetro
     * @param num1
     * @return Un número entero redondeado
     */
    public static int redondeo (float num1){
        return Math.round(num1);
    
    }
    /**
     * Método que devuelve el máyor entre dos numero decimales
     * @param num1
     * @param num2
     * @return El mayor de los dos numeros
     */
    public static float mayor (float num1, float num2){
        return Math.max(num1, num2);
    
    }
    /**
     * Método que devuelve el emnor de dos numeros decimales
     * @param num1
     * @param num2
     * @return El menor de los dos números
     */
    public static float menor (float num1, float num2){
        return Math.min(num1, num2);
    }
    
}

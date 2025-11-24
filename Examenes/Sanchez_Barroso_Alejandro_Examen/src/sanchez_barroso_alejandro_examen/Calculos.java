/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez_barroso_alejandro_examen;
    
/**
 *
 * @author alumno
 */
public class Calculos {
    public final static float NUMPI = (float)Math.PI; //Creamos una constante donde almacenaremos el número PI
    
    /**
     * Método que analiza la señal en función del número que nos dé el usuario mediante una búsqueda
     */
    
    public static void analisisSenal (){ 
        int num, frecuencia;
        boolean correcto;
        frecuencia = 2;
        correcto = false;
        System.out.println("Bienvenido al módulo de analisis de señal");
        num = Utilidades.pedirNum();
        while (correcto == false) {//Para ello hacemos un bucle...
            if (num % frecuencia == 0){ //y una comparativa del resto de la division del numero del usuario y una variable de búsqueda
                System.out.println("La frecuencia de la señal es " + frecuencia);
                correcto = true; //Si es correcta, ponemos la variable de freno en true y salimos del bucle
            }else{
                frecuencia++; //Si no, incrementamos la variable de búsqueda


            }
    
        }
    
    }
    /**
     * Método que nos ordena de menor a mayor las potencias dadas por el usuario para un despegue equilibrado
     */
    public static void ajustarPotencia () {
        int num1,num2,num3,aux;
        int i;
        System.out.println("Bienvenido al módulo de ajuste de potencia");
        num1 = Utilidades.pedirNum();
        num2 = Utilidades.pedirNum();
        num3 = Utilidades.pedirNum();
        for(i=0; i<2; i++) {
            if (num1 > num2){ //Conmparamos la variable 1 con la 2, de modo que si la 1 es mayor que la 2
                aux = num1; //Guardamos la variable 1 en una variable auxiliar
                num1 = num2; //Cambiamos el valor de la variable 1 a la 2
                num2 = aux;  // Guardamos el valor contenido en la variable auxiliar en la variable 2         
            }
            if (num2 > num3){ //Hacemos otra comparativa entre la variable 2 y la 3
                aux = num2;
                num2 = num3;
                num3 = aux;
            }
        
        }
        System.out.println("El orden correcto de encendido es " + num1 + " - " + num2 + " - " + num3);
    
    }
    /**
     * Método que calcula el volumen de un planeta a traves del radio dado por el usuario
     * @return el resultado de dividir 4/3 por la constante PI y por el radio al cubo
     */
    public static float volumenPlaneta () {
        int radio;
        float volumen;
        System.out.println("Bienvenido al módulo de calculo de volumen planetario");
        radio = Utilidades.pedirNum();
        volumen = (4/3)* NUMPI *((int)Math.pow(radio, 3));
        return volumen;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio020;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio020 {
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colón";
    
    public final static String PREGUNTA1 = "¿Cuál es la capital de España?";
    public final static String PREGUNTA2 = "¿Quién descubrió América?";
    
    public final static int PUNTUACION = 5;
    
    /**
     * Método que pide al usuario la respuesta a la pregunta
     * @return la respuesta del usuario
     */
    
    public static String pedirRespuesta () {
    
        Scanner entrada = new Scanner(System.in);
        String respuestausuario = entrada.nextLine();
        return respuestausuario;
       }
    /**
     * Método que compara la respuesta del usuario con la correcta
     * @return true si la respuesta del usuario es correcta o false si no lo es
     */
    public static boolean comprobarRespuesta (String respuestausuario, String respuestacorrecta){
        boolean correcto;
        if (respuestausuario.equalsIgnoreCase(respuestacorrecta)){
            correcto = true;
        
        }else {
            correcto = false;
        
        }
        return correcto;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntuacionfinal = 0;
        String respuesta;
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        //Primera pregunta
        System.out.println(PREGUNTA1);
        
        respuesta = pedirRespuesta();
        
        if(comprobarRespuesta(respuesta, RESPUESTA1)){
            System.out.println("Muy bien, respuesta correcta");
            puntuacionfinal += PUNTUACION;
            
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA1);
        }
        //Segunda pregunta    
        System.out.println(PREGUNTA2);
        
        
        respuesta = pedirRespuesta();
        
        
        if(comprobarRespuesta(respuesta, RESPUESTA2)){
            System.out.println("Muy bien, respuesta correcta");
            puntuacionfinal += PUNTUACION;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA2);
        
        }
        System.out.println("NOTA DEL EXAMEN: " + puntuacionfinal);
    }
    
}

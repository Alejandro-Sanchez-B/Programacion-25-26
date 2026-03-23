/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoarrays;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Metodos {
   /**
    * Metodo para pedir el nombre de la figura
    * @return nombre
    */
    public static String pedirNombre (){  
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor introduce el nombre del personaje");
        return entrada.nextLine();
    }
    /**
     * Metodo para pedir el valor de la figura
     * @return valor
     */
    public static float pedirValor (){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor introduce el valor de la figura");
        return entrada.nextFloat();
    }
    /**
     * Metodo para pedir la coleccion en la que se encuentra la figura
     * @return coleccion
     */
    public static String pedirColeccion (){  
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor introduce el nombre de la coleccion a la que pertenece");
        return entrada.nextLine();
    }
    /**
     * Metodo para pedir la opción del menú
     * @return 
     */
    
    public static int pedirOpcion (){  
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor introduce una opcion");
        return entrada.nextInt();
    }
    
    /**
     * Metodo pare rellenar la vitrina con los datos de cada figura
     * @param vitrina 
     */
    
    public static void rellenarVitrina (Figura vitrina [] []){
        for (int i = 0; i < vitrina.length; i++){ //Recorremos las filas
            for(int j = 0 ; j < vitrina[0].length; j++){ //Recorremos las columnas
              
                vitrina [i][j] = new Figura (pedirNombre(), pedirValor(), pedirColeccion());  //Rellenamos con los datos pedidos          
            
            }
        
        }
    
    }
    
    /**
     * Metodo que pide al usuario una colección y le muestra todas las figuras de esa colección
     * @param vitrina 
     */
    public static void mostrarColeccion (Figura vitrina [] []){
       String coleccion = pedirColeccion();
       boolean hayFigura = false;
         for (int i = 0; i < vitrina.length; i++){
            for(int j = 0 ; j < vitrina[0].length; j++){
               if (vitrina [i][j].getColeccion().equalsIgnoreCase(coleccion)){ //Comparamos la colección de la figura actual con el pasado por el usuario
                System.out.println(vitrina [i][j]);   //Si coincide mostramos los datos     
                hayFigura = true;
               }  
                                          
            }
        
        }
         if (!hayFigura){
             System.out.println("No hay figuras que correspondan con esa colección");
         
         }
    }
   /**
    * Metodo que nos muestra la figura más valiosa
    * @param vitrina 
    */ 
    public static void mostrarFiguraMasValiosa(Figura vitrina [] []){
        float masvalor = vitrina [0][0].getPrecio();
        int indiceFila = -1;
        int indiceColumna = -1;
        for (int i = 0; i < vitrina.length; i++){
            for(int j = 0 ; j < vitrina[0].length; j++){
                if (vitrina [i] [j].getPrecio() > masvalor){
                    masvalor = vitrina [i][j].getPrecio(); 
                    indiceFila = i;
                    indiceColumna = j;
                }          
                
                    
                
                }
            }
        System.out.println("La figura mas valiosa es " + masvalor + " que se encuentra en la fila " + indiceFila + " y en la columna " + indiceColumna);
        }
        
    
    
    
    public static void mostrarMenu(){
         
         System.out.println("Seleccione una opcion");
         System.out.println("1: Introducir datos de figuras");
         System.out.println("2: Mostrar figuras por colección");
         System.out.println("3: Mostrar figura más cara");
         System.out.println("4: Salir");
      
     }
    
    
}

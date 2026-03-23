/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchezbarroso_alejandro_examenra6;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Metodos {
    /**
     * Metodo para solicitarle un dato de tipo String al usuario
     * @return entrada.nextLine
     */
    public static String pedirString (){
        Scanner entrada = new Scanner (System.in);
        return entrada.nextLine();
    }
    /**
     * Metodo para solicitarle un dato de tipo Int al usuario 
     * @return entrada.nextInt()
     */
    public static int pedirInt (){
        Scanner entrada = new Scanner (System.in);
        return entrada.nextInt();
    }
    
    /**
     * Método que le pide al usuario una posicion y si esta está libre, se creará un objeto Coche con los 
     * datos proporcionados por el usuario
     * @param coches 
     */
    public static void aparcarCoche (Coche coches []){
        
        boolean comprobar = false; //Creamos una variable booleana para comprobar si la plaza está ocupada o no
        
        
        do{
            try{
                System.out.println("Por favor, señale su plaza de garaje (1-9)"); //Solicitamos al usuario que nos indique la posición
                int posicion = pedirInt() - 1;
                    if( posicion < 0 || posicion > coches.length ){ //Si la posición está fuera del rango se lo indicamos
                        System.out.println("Esa plaza de garaje no existe");

                    }else if (coches[posicion] != null){  //Si la posicion ya está ocupada se lo indicamos 
                        System.out.println("Esa plaza de garaje está ocupada");

                    }else{ //Si no está ocupada y entra dentro del rango ponemos comprobar a true y creamos un nuevo objeto
                        System.out.println("Por favor, indique su nombre");
                        String titular = pedirString();
                        System.out.println("Por favor, indique la matricula de su coche");
                        String matricula = pedirString();
                        coches[posicion] = new Coche (titular, matricula);
                        comprobar = true;                

                   }

           }catch (InputMismatchException e){ //Nos aseguramos de que nos introducen un entero
                System.out.println("introduzca un tipo de dato válido");       
                        }
        }while (!comprobar); //Seguimos el bucle mientras comprobar sea false
        }
    
    /**
     * Metodo para mostrar las plazas libres del garaje
     * @param coches 
     */
    public static void mostrarPlazasLibres (Coche coches []){
        for (int i = 0; i < coches.length; i++){
            if(coches[i] == null){ //Si la posicion i de coches está vacía imprimimos esa posición
                System.out.println("[" + i + "]");
            
            }
        
        }   
    
    }
    
    /**
     * Metodo para mostrar los datos de los coches aparcados en el garaje
     * @param coches 
     */
    public static void mostrarCochesAparcados (Coche coches []){
        for (Coche coche : coches) {
            if (coche != null) { //Si la posición no está vacía, mostramos los datos del coche
                System.out.println(coche);
            }
        }
    }
    
    /**
     * Método para mostrar la posición de un coche que coincida con una matrícula dada por el usuario
     * @param coches
     * @return 
     */
    public static int buscarGaraje (Coche coches []){
        System.out.println("Introduzca la matricula a buscar"); 
        String matricula = pedirString();
        boolean encontrado = false; //Creamos una variable booleana para comprobar si se ha encontrado
        int posicion = 0;
        int i = 0;
        while (i< coches.length){ //Creamos un bucle while que busque el numero de matrícula
            
            if(matricula.equalsIgnoreCase(coches[i].getMatricula())){ //Si se encuentra, se guarda en posición la posición del coche
                posicion = i -1;
                encontrado = true; // Y se pone encontrado a true
            
                     
            }else { //Si no, se incrementa el contador
                i++;
            
            }
        
        
        }
        
        if(!encontrado){
            System.out.println("No existe esa matrícula");
        
        }
        return posicion;
    }
    
    public static void menu(){
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("1. Aparcar coche");
        System.out.println("2. Ver plazas libres");
        System.out.println("3. Ver datos de plazas ocupadas");
        System.out.println("4. Mostrar titulares de los coches");
        System.out.println("5. Buscar por matrícula");
        System.out.println("6. Mostrar estado del garaje");
        System.out.println("7. Salir");
    }
    
    public static void mostrarEstadoGaraje(Coche coches [], char plazas [][]){
        
        
            for (int j = 0; j < plazas.length; j++){
                for (int f = 0; f< plazas[0].length;f++){
                    for(int i = 0; i < coches.length; i++){
                    if(coches[i] == null){                        
                        plazas [j][f] = 'L';
                
                    }
                    if (coches[i] != null){
                         plazas [j][f] = 'X';
                    
                    }
                    
                   
            
            }
               
              System.out.print(plazas[f]);     
               
                
            }
                System.out.println(plazas [j]);
                
        }
    
    
    
    }
    
    
}

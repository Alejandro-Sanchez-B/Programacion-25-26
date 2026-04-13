/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    public static void rellenarTreeMap (String [] meses, Map treemeses){
        for (int i = meses.length -1 ; i >= 0 ; i--) {
            treemeses.put(i+1, meses[i]);
        }
    }
    
    public static void mostrarTreeMap (Map treemeses){
        Iterator <Integer> iterador = treemeses.keySet().iterator();
        while (iterador.hasNext()){
            Integer clave = iterador.next();
            System.out.println(clave + " " + treemeses.get(clave) );
        
        }
    
    }
    
    public static void rellenarLinkedMap (String [] meses, Map linkedmeses){
        for (int i = meses.length -1 ; i >= 0 ; i--) {
            linkedmeses.put(i+1, meses[i]);
        }
    }
    
    public static void mostrarLinkedMap (Map linkedmeses){
        Iterator <Integer> iterador = linkedmeses.keySet().iterator();
        while (iterador.hasNext()){
            Integer clave = iterador.next();
            System.out.println(clave + " " + linkedmeses.get(clave) );
        
        }
    
    }
    public static void main(String[] args) {
       String [] meses  = {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
       Map <Integer, String> treemeses = new TreeMap <>();
       Map <Integer, String> linkedmeses = new LinkedHashMap <>();
       
       rellenarTreeMap(meses, treemeses); 
       mostrarTreeMap(treemeses);
       
        rellenarLinkedMap(meses, linkedmeses);
        mostrarLinkedMap(linkedmeses);
        
    }
    
}

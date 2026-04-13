/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ejercicio04 {
    public static void rellenarPrimerConjunto (Set <String> mesesConjunto,String [] meses){
        for(int i = 0; i < meses.length; i++){
            
            mesesConjunto.add(meses[i]);
        
        }
}
    
    public static void mostrarPrimerConjunto (Set <String> mesesConjunto){
        for(String meses : mesesConjunto){
            System.out.println(meses);
        
        }
    }
    public static void rellenarSegundoConjunto (Set <String> mesesOrdenados,String [] meses){
        for(int i = 0; i < meses.length; i++){
            
            mesesOrdenados.add(meses[i]);
        
        }
    }
    
      public static void mostrarSegundoConjunto (Set <String> mesesOrdenados){
        for(String meses : mesesOrdenados){
            System.out.println(meses);
        
        }
    }
    
    public static void main(String[] args) {
       String [] meses  = {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
       Set <String> mesesConjunto = new HashSet <>();
       Set <String> mesesOrdenados = new LinkedHashSet <>();
                   
        rellenarPrimerConjunto(mesesConjunto, meses);
        mostrarPrimerConjunto(mesesConjunto);
        
        System.out.println("   "); 
        System.out.println("   ");
        System.out.println("   ");
        
        rellenarSegundoConjunto(mesesOrdenados, meses);
        mostrarSegundoConjunto(mesesOrdenados);
    }
    
}

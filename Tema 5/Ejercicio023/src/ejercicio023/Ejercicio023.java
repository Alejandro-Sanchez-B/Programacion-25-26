/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio023;

/**
 *
 * @author alumno
 */
public class Ejercicio023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Taxi taxiParametrizado = new Taxi ("12358Asd", "Golf" , 899, 588812);
        
        System.out.println(taxiParametrizado);
        Taxi taxiPordefecto = new Taxi();
        System.out.println(taxiPordefecto);
        taxiPordefecto.setMatricula("9885TY");
        taxiPordefecto.setModelo("Polo");
        taxiPordefecto.setPotenciaCV(5993);
        taxiPordefecto.setNumeroLicencia(8552147);
        System.out.println(taxiPordefecto);
        
        Autobus autobusParametrizado = new Autobus ("788526LPO" , "Urban Fashion" , 89668, 98);
        System.out.println(autobusParametrizado);
        
    }
    
}

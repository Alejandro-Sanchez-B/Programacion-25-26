/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorefobjetos;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class EjercicioRefObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);
//        Coche miCoche = new Coche();
//        System.out.println(miCoche.toString());
//        
//        miCoche.setEspejos(5);
//        System.out.println(miCoche.toString());
//        
//        Coche tuCoche = new Coche(" Michelin", "Baja", 3);
//        System.out.println(tuCoche.toString());
//        System.out.println(tuCoche);
//        
//        System.out.println(tuCoche.getRuedas());
            

            //Modificadores de acceso
            Bicicleta bicicleta = new Bicicleta();
            System.out.println(bicicleta.getEstaPedaleando());
            System.out.println("¿Cuantas bicicletas hay?");
            System.out.println(bicicleta.getNumbicicletas());
            
            Bicicleta bicicleta2 = new Bicicleta();
            System.out.println("¿Cuantas bicicletas hay?");
            System.out.println(bicicleta.getNumbicicletas());
            
            //Paso de parametro por valor y por referencia
            int num1 = 4;
            System.out.println(suma(num1));
            
            Bicicleta bici = new Bicicleta();
            empezarApedalear(bici);
            System.out.println(bici);
    }
    public static int suma (int num1) {
        int num2 = 3;
        return num1 + num2;
    }
    public static void empezarApedalear(Bicicleta bici){
        bici.setEstaPedaleando(true);
    }
}

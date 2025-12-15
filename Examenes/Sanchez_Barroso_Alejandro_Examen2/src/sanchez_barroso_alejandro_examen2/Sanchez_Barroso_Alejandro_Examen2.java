/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanchez_barroso_alejandro_examen2;

/**
 *
 * @author alumno
 */
public class Sanchez_Barroso_Alejandro_Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sin polimorfismo
        CiclistaEscalador lucia = new CiclistaEscalador ("Lucía" , 62, false, 42.9f, 3, 62.7f, 40, 52.3f, 36.4f);
        Ciclista.aumentarNumCiclistas();
                
        CiclistaSprinter alberto = new CiclistaSprinter ("Alberto",31, false, 14.9f, 0, 42.4f, 20, 43.4f);
        Ciclista.aumentarNumCiclistas();//Aumentamos el número de ciclistas por cada ciclista creado en 1
        //Mostramos los ciclistas creados hasta ahora
        Ciclista.mostrarNumCiclistas();
        
        
        //Con polimorfismo desde la clase principal
        
        //Primero el escalador
        Ciclista lucia2 = new CiclistaEscalador ("Lucía" , 62, false, 42.9f, 3, 62.7f, 40, 52.3f, 36.4f);
        System.out.println(lucia2.toString());
        lucia2.comer();
        lucia2.beber();
        System.out.println(lucia2.toString());
        
        //Segundo el sprinter
        Ciclista alberto2 = new CiclistaSprinter ("Alberto",31, false, 14.9f, 0, 42.4f, 20, 43.4f);
        System.out.println(alberto2.toString());
        alberto2.comer();
        alberto2.beber();
        System.out.println(alberto2.toString());
        
        //Con polimorfismo desde la interfaz
        
        //Escalador
        Pedaleable lucia3 = new CiclistaEscalador ("Lucía" , 62, false, 42.9f, 3, 62.7f, 40, 52.3f, 36.4f);
        System.out.println(lucia3.toString());
        lucia3.atacar();
        lucia3.sprintar();
        lucia3.recuperar(15f);
        System.out.println(lucia3.toString());
        
        //Sprinter
        
        Pedaleable alberto3 = new CiclistaSprinter ("Alberto",31, false, 14.9f, 0, 42.4f, 20, 43.4f);
        System.out.println(alberto3.toString());
        alberto3.atacar();
        alberto3.sprintar();
        alberto3.recuperar(15f);
        System.out.println(alberto3.toString());
        
    }
    
}

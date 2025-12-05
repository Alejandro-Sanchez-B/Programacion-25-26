/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Alex
 */
public class TrianguloRectangulo extends Triangulo {
    
    //Contructores
    public TrianguloRectangulo (){
        super();        
    }
    
    public TrianguloRectangulo (String color,float base, float altura){
        super(color,base,altura);        
    }
    
    
    public double calcularHipotenusa() {
        return Math.sqrt((Math.pow(getBase(), 2) + (Math.pow(getAltura(), 2))));
    }
    @Override
    public void calcularPerimetro() {
        double perimetro;
        perimetro = getBase() + getAltura() + calcularHipotenusa();
        System.out.println("El perimetro del triangulo es " + perimetro);
    }
             
    
    
}

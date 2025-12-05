/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Alex
 */
public class Circulo extends FiguraGeometrica{
    //Atributos
    private float radio;
    //Constructores
    
    public Circulo (){
        super();
        this.radio = 0f;    
    }
    
    public Circulo (String color,float radio){
        super(color);
        this.radio = radio;    
    }
    
    //Getters y Setters
    
    public float getRadio(){
        return this.radio;    
    }
    
    public void setRadio(float radio) {
        this.radio = radio;      
    }
    
    //Métodos

        @Override
        public void calcularArea() {
            double area;
            area = Math.PI *(Math.pow(radio, 2));
            System.out.println(area);
        }

        @Override
        public void calcularPerimetro() {
            double perimetro;
            perimetro = 2* Math.PI * radio;
            System.out.println(perimetro);        
        }
        
    //toString
        @Override
        public String toString () {

            return super.getColor() + radio;
        }
    
    
    
}

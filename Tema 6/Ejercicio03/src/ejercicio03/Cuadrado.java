/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Alex
 */
public class Cuadrado extends FiguraGeometrica {
    //Atributos
    private float lado;
    //Constructores
    
    public Cuadrado (){
        super();
        this.lado = 0f;    
    }
    
    public Cuadrado (String color,float lado){
        super(color);
        this.lado = lado;    
    }
    
    //Getters y Setters
    
    public float getLado(){
        return this.lado;    
    }
    
    public void setLado(float lado) {
        this.lado = lado;     
    }
    //Métodos
    @Override
    public void calcularArea(){
        double area;
        area = Math.pow(lado, 2);
        System.out.println(area);
    }
    
    @Override
    public void calcularPerimetro(){
        double perimetro;
        perimetro = lado*4;
        System.out.println(perimetro);
    }
    //toString
    @Override
    public String toString () {
    
        return super.getColor() + lado;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Alex
 */
public abstract class Triangulo  extends FiguraGeometrica{
    
     //Atributos
    private float base;
    private float altura;
    //Constructores
    
    public Triangulo (){
        super();
        this.base = 0f;
        this.altura = 0f;
    }
    
    public Triangulo (String color,float base, float altura){
        super(color);
        this.base = base; 
        this.altura = altura;
    }
    
    //Getters y Setters
    
    public float getBase(){
        return this.base;    
    }
    
    public void setBase(float base) {
        this.base = base;      
    }
    public float getAltura(){
        return this.altura;    
    }
    
    public void setAltura(float altura) {
        this.altura = altura;      
    }
    //Métodos

        @Override
        public void calcularArea() {
            double area;
            area = (base * altura) / 2;
            System.out.println(area);
        }

       
    //toString
        @Override
        public String toString () {
            return super.getColor() + base + altura;
        }
    
    
    
    
}

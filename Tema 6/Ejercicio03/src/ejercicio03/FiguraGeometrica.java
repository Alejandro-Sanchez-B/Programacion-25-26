/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author alumno
 */
public abstract class FiguraGeometrica {
    private String color;
    
    public FiguraGeometrica () {
        this.color = "";    
    }
    public FiguraGeometrica (String color) {
        this.color = color;    
    }
    
    public String getColor (){    
        return this.color;
    }
    
    public void setColor (String color) {
        this.color = color;
    }
    
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    
    @Override
    
    public String toString (){
    
     return color;
    } 
    
}

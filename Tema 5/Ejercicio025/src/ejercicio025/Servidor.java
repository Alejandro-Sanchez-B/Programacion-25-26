/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio025;

/**
 *
 * @author alumno
 */
public class Servidor extends Ordenador {
    private int monitor;
    private String teclado;
    private String raton;
    
    public Servidor(){
        super();
        this.monitor = 0;
        this.teclado = "";
        this.raton = "";    
    }
    
    public Servidor(int monitor, String teclado, String raton,int ram,int discoduro,String procesador,String grafica,float precio){
        super(ram,discoduro,procesador,grafica,precio);
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;    
    }
    
    public int getMonitor(){
        return this.monitor;    
    }
    public void setMonitor (int monitor){
        this.monitor = monitor;    
    }
    public String getTeclado(){
        return this.teclado;    
    }
    public void setTeclado (String teclado){
        this.teclado = teclado;    
    }
    public String getRaton(){
        return this.raton;    
    }
    public void setRaton (String raton){
        this.raton = raton;   
    }
    
    @Override
     public String toString() {
        return "Servidor compuesto por:" + " Monitor: " + monitor +" pixeles" +" ,Teclado: " + teclado + ", Raton: " + raton;
    }
}

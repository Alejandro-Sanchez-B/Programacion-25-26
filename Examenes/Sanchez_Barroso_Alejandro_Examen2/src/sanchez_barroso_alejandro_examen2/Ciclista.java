/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez_barroso_alejandro_examen2;

/**
 *
 * @author alumno
 */
public abstract class Ciclista {
    //Atributos
    
    private String nombre;
    private int energia;
    private boolean estaEscapando;
    private float kmAMeta;
    private int numBidones;
    private float velocidad;
    private int nivelHidratacion;
    private static int numCiclistas;
    
    //Construtores
    public Ciclista(){
        this.nombre = "";
        this.energia = 50;
        this.estaEscapando = false;
        this.kmAMeta = 120f;
        this.numBidones = 2;
        this.velocidad = 0;
        this.nivelHidratacion = 50;
        
    }
    public Ciclista(String nombre,int energia,boolean estaEscapando, float kmAMeta, int numBidones,float velocidad,int nivelHidratacion){
        this.nombre = nombre;
        this.energia = energia;
        this.estaEscapando = estaEscapando;
        this.kmAMeta =kmAMeta;
        this.numBidones = numBidones;
        this.velocidad = velocidad;
        this.nivelHidratacion = nivelHidratacion;    
    }
    
    //Getters and Setters
     public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
     public boolean getEstaEscapando() {
        return this.estaEscapando;
    }

    public void setEstaEscapando(boolean estaEscapando) {
        this.estaEscapando = estaEscapando;
    }
    
     public float getKmAMeta() {
        return this.kmAMeta;
    }

    public void setKmAMeta(float kmAMeta) {
        this.kmAMeta = kmAMeta;
    }
    
    public int getNumBidones() {
        return this.numBidones;
    }

    public void setNumBidones(int numBidones) {
        this.numBidones = numBidones;
    }
    
     public float getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
     public float getNivelHidratacion() {
        return this.nivelHidratacion;
    }

    public void setNivelHidratacion(int nivelHidratacion) {
        this.nivelHidratacion = nivelHidratacion;
    }
    
    //Metodos
    
    public final void cogerBidones (){
        if (kmAMeta >= 10) {
            
            numBidones +=2;        
        } else {
            System.out.println("No puedes coger bidones a menos de 10Km de distancia");
        
        }    
    }
    
    public final void tirarBidon (){
        numBidones--;    
    }
    
    public abstract void comer();
    public abstract void beber();
    
    public static void aumentarNumCiclistas (){ //Aumentamos el númerio de ciclistas
        numCiclistas++;    
    }
    
    public static void mostrarNumCiclistas (){ //Mostramos el número de ciclistas
        System.out.println("El numero de ciclistas registrados es " + numCiclistas);    
    }
        
    //toString
    @Override
    public String toString() {
        return "Ciclista llamado " + this.nombre + " cuya energia es " + this.energia + " Km a meta: " + this.kmAMeta + 
                " Numero de bidones: " + this.numBidones + " Velocidad:  " + this.velocidad + " Nivel de hidratacion " + this.nivelHidratacion;
    }        
}

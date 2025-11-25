/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author alumno
 */
public class Jugador extends Personaje  {
    
    //Atributos
    
    public String inventario;
    
    
    //Contructores
    
    public Jugador () {
        super();
        this.inventario = "";
    
    }
    
    public Jugador (int vida, String inventario) {
        super(vida);
        this.inventario = inventario;
    }
    
    //Getters y Setters
    
    public String getInventario() {
        return this.inventario;
    
    }
    
    public void setInventario (String inventario) {
        this.inventario = inventario;
    }
    
    //Métodos
    
    public void recoger (String objeto) {
    
        System.out.println("Recogiendo " + objeto + "...");
    }
    
    @Override
    
    public String toString () {
    
        return super.toString() + " y tiene un " + this.inventario;
    }
}

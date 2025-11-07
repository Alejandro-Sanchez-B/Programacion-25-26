/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorefobjetos;

/**
 *
 * @author Alex
 */
public class Coche {
   //Atributos. Nunca se inicializan aqui
   private String ruedas;
   private String suspension;
   private int espejos;
   
   public Coche (){
       this.ruedas = "";
       this.suspension = "";
       this.espejos = 0;
   }
   
   public Coche(String ruedas, String suspension, int espejos) {
       this.ruedas = ruedas;
       this.suspension = suspension;
       this.espejos= espejos;
   }
   
   public String getRuedas() {
       return this.ruedas;
   }
   
   public void setRuedas(String ruedas){
       this.ruedas = ruedas;
   }
   
   public String getSuspension(){
       return this.suspension;
   
   }
   
   public void setSuspension (String suspension){
       this.suspension = suspension;
   }
   
   public int getEspejos () {
   
   return this.espejos;
   }
   public void setEspejos(int espejos) {
   
       this.espejos = espejos;
   }
   
   //Otros métodos
   public void acelerar (){
   
   
   }
   @Override
  public String toString(){
    
    return "Mi coche tiene ruedas" + this.ruedas + ", suspension " + this.suspension + " y " + this.espejos + " espejos";
  } 
  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez_barroso_alejandro_examen2;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclista implements Pedaleable{
    //Atributos    
    private float aceleracion;
   
    
    //Constructores
    public CiclistaSprinter (){
        super();
        this.aceleracion = 0f;
        
    }
    public CiclistaSprinter (String nombre,int energia,boolean estaEscapando, float kmAMeta, int numBidones,float velocidad,int nivelHidratacion,float aceleracion){
        super(nombre,energia,estaEscapando,kmAMeta,numBidones,velocidad,nivelHidratacion);
        this.aceleracion = aceleracion;
        
    }
    //Getters y Setters
    public float getAceleracion() {
        return this.aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }
   
    
    //Metodos
    //Metodos heredados de la super clase
    @Override
    public void comer(){        //Método que si la meta esta a más de 20KM, aumenta la energía en 25 
        
        if (super.getKmAMeta()>= 10){
            super.setEnergia(super.getEnergia()+25);  
            System.out.println("El sprinter " + super.getNombre() + " acaba de tomar un gel. Su energia ahora es de " + super.getEnergia());
            }
       }  
    
   @Override  //Si el ciclista no tiene bidones, le añade dos y si los tiene aumenta su nivel de hidratacion a 5 y reducer los bidones en 1
   public void beber(){
       if (super.getNumBidones() == 0)   {
           super.setNumBidones(2);
       }
       super.setNivelHidratacion((int)super.getNivelHidratacion() + 5);
       super.setNumBidones(super.getNumBidones()-1);
       System.out.println("El sprinter " + super.getNombre() + " se ha hidratado. Su nivel de hidratación ahora es " + super.getNivelHidratacion());
    }
   
   //Metodos heredados de la interfaz
   @Override
   public void sprintar(){  //Solo puede sprintar si la meta está a menos de 1 kilometro y su energia es de al menos 50
       if (super.getKmAMeta() <= 1 || super.getEnergia() >= 50){
           super.setVelocidad(super.getVelocidad()+aceleracion);//Aumentamos su velocidad por la aceleracion
           super.setEnergia(super.getEnergia()-50); //Reducimos su energia en 50
           System.out.println("El sprinter " + super.getNombre() + " está esprintando a " + super.getVelocidad() + " km/h");
       } else {
           System.out.println("Aun no puede sprintar");    //Si no puede sprintar se le avisa    
       }
   
   }
   
   @Override   
   public void atacar(){ //Si no está escapando, escapa a la meta 
       if (super.getEstaEscapando() == false){
        super.setEstaEscapando(true);
        super.setNivelHidratacion((int)super.getNivelHidratacion()- (int)(super.getNivelHidratacion()*0.1));    //Y su hidratación baja un 10%
        System.out.println("El sprinter " + super.getNombre() + " está atacando");
       }
   
   }
   
   @Override
   public float recuperar (float KmAMeta){  //Pasamos por parametros los kilometros a meta y si está a mas de 5 kilometros de ella
       if (super.getKmAMeta() >= 5){
       
           super.setEnergia(5*(int)KmAMeta);    //EStablecemos la energia en 5 * los kilometros pasados
           System.out.println(super.getNombre() + " está recuperando");
       }
       return super.getEnergia();
   }
   //toString
   @Override
   public String toString (){
       return super.toString() + "Aceleracion: " + this.aceleracion;   
   }
}

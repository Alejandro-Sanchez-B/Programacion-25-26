/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez_barroso_alejandro_examen2;

/**
 *
 * @author alumno
 */
public class CiclistaEscalador extends Ciclista implements Pedaleable{
    //Atributos    
    private float potencia;
    private float fuerza;
    
    //Constructores
    public CiclistaEscalador (){
        super();
        this.potencia = 0f;
        this.fuerza = 0f;
    }
    public CiclistaEscalador (String nombre,int energia,boolean estaEscapando, float kmAMeta, int numBidones,float velocidad,int nivelHidratacion,float potencia,float fuerza){
        super(nombre,energia,estaEscapando,kmAMeta,numBidones,velocidad,nivelHidratacion);
        this.potencia = potencia;
        this.fuerza = fuerza;
    }
    //Getters y Setters
    public float getPotencia() {
        return this.potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    public float getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }
    
    //Metodos
    //Metodos heredados de la super clase
    @Override
    public void comer(){ //Método que si la meta esta a más de 20KM, aumenta la energía en 30       
        
        if (super.getKmAMeta()>= 20){
            super.setEnergia(super.getEnergia()+30);  
            System.out.println("El escalador " + super.getNombre() + " acaba de tomar un gel. Su energia ahora es de " + super.getEnergia());
            }
       }  
    
   @Override
   public void beber(){ //Si el ciclista no tiene bidones, le añade dos y si los tiene aumenta su nivel de hidratacion a 10 y reducer los bidones en 2
       if (super.getNumBidones() == 0)   {
           super.setNumBidones(2);
       }
       super.setNivelHidratacion((int)super.getNivelHidratacion()+10);
       super.setNumBidones(super.getNumBidones()-2);
       System.out.println("El escalador " + super.getNombre() + " se ha hidratado. Su nivel de hidratación ahora es " + super.getNivelHidratacion());
    }
   
   //Metodos heredados de la interfaz
   @Override
   public void sprintar(){ //Solo puede sprintar si la meta está a menos de 0,3 kilometros y su energia es de al menos 20
       if (super.getKmAMeta() <= 0.3f || super.getEnergia() >= 20){
           super.setVelocidad(potencia/fuerza); //Establecemos su velocidad en potencia entre fuerza
           super.setEnergia(super.getEnergia()-20); //Reducimos su energia en 20
           System.out.println("El escalador " + super.getNombre() + " está esprintando a " + super.getVelocidad() + " km/h");
       } else {
           System.out.println("Aun no puede sprintar");   //Si no puede sprintar se le avisa     
       }
   
   }
   
   @Override   
   public void atacar(){ //Si no está escapando, escapa a la meta 
       if (super.getEstaEscapando() == false){
        super.setEstaEscapando(true); 
        super.setNivelHidratacion((int)super.getNivelHidratacion()-(int)(super.getNivelHidratacion()*0.2)); //Y su hidratación baja un 20%
        System.out.println("El escalador " + super.getNombre() + " está atacando");
       }
   
   }
   
   @Override
   public float recuperar (float KmAMeta){ //Pasamos por parametros los kilometros a meta y si está a mas de 15 kilometros de ella
       if (super.getKmAMeta() >= 15){
       
           super.setEnergia(5*(int)KmAMeta); //EStablecemos la energia en 5 * los kilometros pasados
           System.out.println(super.getNombre() + " está recuperando");
       }
       return super.getEnergia();
   }
   
   
   @Override
   public String toString (){
       return super.toString() + "Potencia: " + this.potencia + " Fuerza " + this.fuerza;   
   }
}

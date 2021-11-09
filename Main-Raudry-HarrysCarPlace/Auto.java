/**
 * Clase que modela un auto
 * @author Asahel Main
 * @version version 1.0
 */

public class Auto{

    //El modelo del automovil
    private String modelo;
    
    //El color del automovil
    private String color;
    
    //La fecha de fabricacion
    private String fechaDeFabricacion;

    //Si el automovil es automatico o estandar
    private bool esAutomatico;


    //Constructores

    /**
     * Constructor que recibe cuatro parametros
     * @param modelo El modelo del automovil
     * @param color El color del automovil
     * @param fechaDeFabricacion La fecha de fabricacion del auto
     * @param esAutomatico Si el auto es automatico o estandar
     */
    public Auto(String modelo, String color, String fechaDeFabricacion, bool esAutomatico){
	this.modelo = modelo;
	this.color = color;
	this.fechaDeFabricacion = fechaDeFabricacion;
	this.esAutomatico = esAutomatico;
    }

    /**
     * Constructor sin parametros
     * A modelo se le asigna "Tsuru"
     * A color se le asigna "Arcoiris"
     * A fechaDeFabricacion se le asigna "1988"
     * A esAutomatico se le asigna el valor de false
     */
    public Auto(){
	this("Tsuru", "Arcoiris", "1988", false);
    }


    /**
     * Metodo que regresa el modelo del automovil
     * @return El modelo del automovil
     */
    public String getModelo(){
	return this.modelo;
    }

    /**
     * Metodo que modifica el modelo del automovil
     * @param modelo El nuevo modelo
     */
    public void setModelo(String modelo){
	this.modelo = modelo
    }

    /**
     * Metodo que regresa el color del automovil
     * @return El color del automovil
     */
    public String getColor(){
	return this.color;
    }

    /**
     * Metodo que modifica el color del automovil
     * @param color El nuevo color del automovil
     */
    public void setColor(String color){
	this.color = color
    }

    /**
     * Metodo que regresa la fecha de fabricacion del auto
     * @return La fecha de fabriacion del auto
     */
    public String getFecha(){
	return this.fechaDeFabricacion;
    }

    /**
     * Metodo que modifica la fecha de fabricacion del auto
     * @param fechaDeFabricacion La nueva fecha de fabriacion del auto
     */
    public void setFecha(String fechaDeFabricacion){
	this.fechaDeFabricacion = fechaDeFabricacion;
    }

    
    /**
     * Metodo que regresa si el auto es automatico 
     * @return El valor de verdad de si el auto es automatico
     */
    public bool getEsAutomatico(){
	return this.esAutomatico;
    }


    /**
     * Metodo que modifica si el auto es automatico
     * @param esAutomatico El nuevo valor de verdad de si el auto es automatico 
     */
    public void setEsAutomatico(bool esAutomatico){
	this.esAutomatico = esAutomatico;
    }

    /**
     * Metodo toString que muestra al objeto de la clase Auto en forma de String
     * @return El objeto de la clase Auto en forma de String
     */
    public String toString(){
	return "Este es un objeto de la clase Auto\n Modelo: " + this.modelo + "\n Color: " + this.color + "\n Fecha de fabriacion: " + this.fechaDeFabricacion + "\n Es automatico: " + this.esAutomatico;
    }
}

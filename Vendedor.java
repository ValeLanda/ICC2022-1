/*
 * Clase Vnededor
 * @author Jesus Rivera
 * @author Rodrigo Campos
 * @version 1.0
 * */
public class Vendedor{
    private String nombre;
    private String meses;
    private double interes;
    private double enganche;
    private double añosExperiencia;
    
    /*
     * Metodo constructor que nos indica: nombre, meses, interes, enganche, añosExperiencia
     * @param nombre nombre
     * @param meses meses
     * @param interes interes
     * @param enganche enganche
     * @param añosExperiencia añosExperiencia
     * */
    public Vendedor(String nombre, String meses, double interes, double enganche, double añosExperiencia){
	this.nombre = nombre;
	this.meses = meses;
	this.interes = interes;
	this.enganche = enganche;
	this.añosExperiencia = añosExperiencia;
    }
    /*
     * Metodo que cambia el nombre del vendedor
     * @param nombre Nombre del vendedor
     * */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }
    /*
     * Metodo que regresa el nombre del vendedor
     * @return nombre
     * */
    public String getNombre(){
	return this.nombre;
    }
    /*
     * Metodo que cambia el valor de meses
     * @param meses Valor de meses que propone el vendedor
     * */
    public void setMeses(String meses){
	this.meses = meses;
    }
    /*
     * Metodo que regresa el valor meses
     * @return meses 
     * */
    public String getMeses(){
	return this.meses;
    }
    /*
     * Metodo que cambia el valor interes
     * @param interes Valor de interes que proporciona el vendedor
     * */
    public void setInteres(double interes){
	this.interes = interes;
    }
    /*
     * Metodo que regresa el valor interes 
     * @return interes
     * */
    public dobuble getInteres(){
	return this.interes;
    }
    /*
     * Metodo que cambia el valor de enganche  
     * @param enganche Enganche que proporciona el vendedor
     * */
    public void setEnganche(double enganche){
	this.enganche = enganche;
    }
    /*
     * Metodo que regresa el valor enganche
     * @return enganche
     * */
    public double getEnganche(){
	return enganche;
    }
    /*
     * Metodo que cambia el valor añosExperiencia
     * @param añosExperiencia Tiempo de experiencia del vendedor en su campo
     * */
    public void setAñosExperiencia(double añosExperiencia){
	this.añosExperiencia = añosExperiencia;
    }
    /*
     * Metodo que regresa el valor añosExperiencia
     * @return añosExperiencia
     * */
    public double getAñosExperiencia(){
	return añosExperiencia;
    }
    /*
     * Metodo toString proporciona el valor de los atributos de nuestros objetos
     * @return nombre,añosExperiencia,enganche,meses,interes
     * */
    public String toString(){
	return "Nombre:" + this.nombre + "Experiencia:" + this.añosExperiencia + "Enganche:" + this.enganche + "Meses:" + this.meses + "Interes:" + this.interes;
    }
	
}

/**
*Clase que representa a un auto
*@author Gil Axel Gutierrez Lara
*@version 1.0
**/
public class Auto{
  //Atributos
  private String color;
  private String modelo;
  private String transmision;
  private String equipacion;
  private String nombre;
  private double precio;
  //Constructor con args
  public Auto(String nombre,String color,String modelo, String transmision, String equipacion,double precio){
    this.nombre=nombre;
    this.color=color;
    this.modelo=modelo;
    this.transmision=transmision;
    this.equipacion=equipacion;
    this.precio=precio;
  }
  //Metodos Guetters
  /**
  *Metodo que devuelve el nombre el auto
  *@return El nombre del auto
  **/
  public String getNombre(){
    return this.nombre;
  }
  /**
  *Metodo que devuelve el color del auto
  *@return El color del auto
  **/
  public String getColor(){
    return this.color;
  }
  /**
  *Metodo que devuelve el modelo del auto
  **/
  public String getModelo(){
    return this.modelo;
  }
  /**
  *Metodo que devuelve el tipo de transmision del auto
  *@return El tipo de transmision del auto
  **/
  public String getTransmision(){
    return this.transmicion;
  }
  /**
  *Metodo que devuelve el tipo de transmision del auto
  *@return El tipo de equipamiento del auto
  **/
  public String getEquipacion(){
    return this.equipacion;
  }
  /**
  *Metodo que devuelve el precio del auto
  *@return El precio del auto
  **/
  public double getPrecio(){
    return this.precio;
  }
  
  //Metdodos set
  public void setPrecio(double precio){
    this.precio=precio;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setColor(String color){
    this.color=color;
  }
  public void setModelo(String modelo){
    this.modelo=modelo;
  }
  public void setTransmision(String transmision){
    this.transmision=transmision;
  }
  public void setEquipacion(String equipacion){
    this.equipacion=equipacion;
  }
  
  
  //Metodo toStriing
  
  public String toString(){
    return "El auto "+nombre+", es de color "+color+", modelo "+modelo+", transmision tipo "+transmision+", equipacion "+equipacion+", y tiene un precio de "+precio+" pesos."
}

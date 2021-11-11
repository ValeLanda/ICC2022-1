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
  //Constructor con args
  public Auto(String nombre,String color,String modelo, String transmision, String equipacion){
    this.nombre=nombre;
    this.color=color;
    this.modelo=modelo;
    this.transmision=transmision;
    this.equipacion=equipacion;
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
}

/**
*@author Gil Axel Gutierrez Lara/Javier Alejandro Mancera Quiroz
*@version 1.0
**/
public class Vendedor{

  //Atributos
  private String nombreV;
  private int autosDisponibles;
  private int autosVendidos;
  
  //Constructor con Args
  public Vendedor(String nombreV,int autosDisponibles,int autosVendidos){
    this.nombreV=nombreV;
    this.autosDisponibles=autosDisponibles;
    this.autosVendidos=autosVendidos;
  }  
  /**
  *Metodo que devuelve el nombre del vendedor
  *
  *@return El nombre del vendedor
  **/
  public String getNombreV(){
    return this.nombreV;
  }
  /**
  *Metodo que devuelve el numero de autos disponibles
  *
  *@return El numero de autos disponibles
  **/
  public int getAutosDisponibles(){
    return this.autosDisponibles;
  }
   /**
  *Metodo que devuelve el numero de autos vendidos
  *
  *@return El numero de autos vendidos
  **/
  public int getAutosVendidos(){
    return this.autosVendidos;  
  }
   /**
  *Metodo que cambia el nombre el vendedor
  *
  *@param nombreV El parametro que representa el nombre del vendedor
  **/
  public void setNombreV(String nombreV){
    this.nombreV=nombreV;  
  }
  /**
  *Metodo que cambia el numero de autos disponibles del vendedor
  *
  *@param nombreV El parametro que representa el numero de autos disponibles del vendedor
  **/
  public void setAutosDisponibles(int autosDisponibles){
    this.autosDisponibles=autosDisponibles;
  }
  /**
  *Metodo que cambia el numero de autos vendidos del vendedor
  *
  *@param nombreV El parametro que representa el numero de autos vendidos del vendedor
  **/
  public void setAutosVendidos(int autosVendidos){
    this.autosVendidos=autosVendidos;
  }
}

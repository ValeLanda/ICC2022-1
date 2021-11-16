/**
*@author Juan Luis Rivera Ibarra
*@Version 1.1
*/
/**
*Clase Auto
*@since 1.0
*/
public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    /**Metodo constructor que genera un automovil con los datos proporcionados por el usuario
    *@since 1.0
    *@param modelo            Tipo de datos String que especifica la marca que producel el automovil
    *@param modelo            Tipo de datos String que especifica el Modelo del automovil
    *@param año               Tipo de dato int que especifica el año en que se produjo el automovil
    *@param color             Tipo de datos String que especifica el color del automovil
    */
    public Auto(String marca, String modelo, int año, String color){
      this.marca = marca;
      this.modelo = modelo;
      this.año = año;
      this.color = color;
    }

    /**Metodo que regresa la marca del automovil en un tipo de dato String
    *@since 1.1
    *@return Valor en tipo de dato String referente a la marca del automovil
    */
    public String getMarca(){
      return marca;
    }

    /**Metodo que regresa el modelo del automovil en tipo de dato String
    *@since 1.1
    *@return Valor en tipo de dato String referente al modelo del automovil
    */
    public String getModelo(){
      return modelo;
    }

    /**Metodo que regresa año de inicio de produccion del automovil en un dato tipo int
    *@since Version 1.1
    *@return Valor en tipo de dato int referente al año de inicio de produccion del automovil
    */
    public int getAño(){
      return año;
    }

    /**Metodo que regresa el color del automovil en tipo de dato String
    *@since 1.1
    *@return Valor en tipo de dato String referente al color del automovil
    */
    public String getColor(){
      return color;
    }

    /**Metodo que regresa la infomacion clave del automovil en tipo de dato String
    *@since 1.1
    *@return Tipo de dato String que resume la informacion clave del automovil
    */
    public String toString(){
      return ("Automovil marca: " + getMarca() + "\nmodelo: " + getModelo() + "\nAño: " + getAño()) + "\ncolor: " + getColor() + ".";
    }
}

/**
*@author Juan Luis Rivera Ibarra
*@version 1.0
*/
public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    /**Metodo constructor que genera un rectangulo con valores proporcionados por el usuario
    *@param modelo            Tipo de datos String que especifica la marca que producel el automovil
    *@param modelo            Tipo de datos String que especifica el Modelo del automovil
    *@param año               Tipo de dato int que especifica el año en que se produjo el automovil
    *@param color             Tipo de datos String que especifica el color del automovil
    */
    public Auto (String marca, String modelo, int año, String color){
      this.marca = marca;
      this.modelo = modelo;
      this.año = año;
      this.color = color;
    }
}

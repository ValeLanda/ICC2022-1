/**
* Clase que define los atributos y métodos de un Auto de la Agencia Trash.
* @author : Dhamar Cabrera.
* @author : Elizabeth Hernandez.
* @version : 1.0
*/

public class Auto {
  // Atributos del Auto.
  private String marca; //cuál es su marca
  private String modelo; //qué modelo es
  private String tipo; //sedan, rural, familiar, casa rodante, etc...
  private String modo; //Manual o Automático
  private String color; //cuál es su color
  private int n_llantas; //cuántas llantas tiene
  private int n_puertas; //cuántas puertas tiene
  private String precio; //qué precio tiene
  
    /**
     * Constructor por omisión
     * @return : marca
     * @return : modelo
     * @return : tipo
     * @return : modo
     * @return : color
     * @return : n_llantas
     * @return : n_puertas
     * @return : precio
     */

    public Auto (){
	this.marca = "Nissan";
	this.modelo = "Versa";
	this.tipo = "Sedan";
	this.modo = "Automático";
	this.color = "Rojo";
	this.n_llantas = 4;
	this.n_puertas = 4;
	this.precio = "$276,900.00 pesos";
    }
  
    /**
     * Constructor con parámetros
     * @param : marca
     * @param : modelo
     * @param : tipo
     * @param : modo
     * @param : color
     * @param : n_llantas
     * @param : n_puertas
     * @param : precio
     */
    public Auto ( String marca, String modelo, String tipo, String modo, String color, int n_llantas, int n_puertas, String precio){
	this.marca = marca;
	this.modelo = modelo;
	this.tipo = tipo;
	this.modo = modo;
	this.color = color;
	this.n_llantas = n_llantas;
	this.n_puertas = n_puertas;
	this.precio = precio;
    }

    /**
     * Acceso a características del auto.
     * @return : marca
     * @return : modelo
     * @return : tipo
     * @return : modo
     * @return : color
     * @return : n_llantas
     * @return : n_puertas
     * @return : precio
     */
    public String getMarca ( String marca ){
	return this.marca = marca;
    }

    public String getModelo ( String modelo ){
	return this.modelo = modelo;
    }

    public String getTipo ( String tipo ){
	return this.tipo = tipo;
    }
    public String getModo ( String modo ){
	return this.modo = modo;
    }
    public String getColor ( String color ){
	return this.color = color;
    }
    public int getLlantas ( int n_llantas ){
	return this.n_llantas = n_llantas;
    }
    public int getPuertas ( int n_puertas ){
	return this.n_puertas = n_puertas;
    }
    public String getPrecio ( String precio){
	return this.precio = precio;
    }

    /**
     * Modificación de las características del auto.
     * @param : marca
     * @param : modelo
     * @param : tipo
     * @param : modo
     * @param : color
     * @param : n_llantas
     * @param : n_puertas
     * @param : precio
     */
    public void setMarca ( String marca ){
	this.marca = marca;
    }

    public void setModelo ( String modelo ){
	this.modelo = modelo;
    }

    public void setTipo ( String tipo ){
	this.tipo = tipo;
    }
    public void setModo ( String modo){
	this.modo = modo;
    }
    public void setColor ( String color ){
	this.color = color;
    }
    public void setLlantas ( int n_llantas ){
	this.n_llantas = n_llantas;
    }
    public void setPuertas ( int n_puertas ){
	this.n_puertas = n_puertas;
    }
    public void setPrecio ( String precio){
	this.precio = precio;
    }

    /**
     * Método de comportamiento para imprimir características del auto deseado.
     * @return : marca
     * @return : modelo
     * @return : tipo
     * @return : modo
     * @return : color
     * @return : n_llantas
     * @return : n_puertas
     * @return : precio
     */
    public String toString(){
	return "El auto que la Agencia Trash puede ofrecerle en esta sucursal cuenta con las siguientes características:" + "\n" + "\n" + "Marca: " + this.marca + "\n" + "Modelo: " + this.modelo + "\n" + "Tipo: " + this.tipo + "\n" + "Modo de manejo: " + this.modo + "\n" + "Color: " + this.color + " (Sujeto a cambios)" +  "\n" + "Número de llantas usadas: " + this.n_llantas + "\n" + "Número de puertas: " + this.n_puertas + "\n" + "Precio: " + this.precio; 
    }
}

/**
* Fin del programa.
*/


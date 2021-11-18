public class Auto{

    //Atributos de la clase
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private int potencia;
    private double precio;

    /////////////////////////////////////////

    //Constructores
    public Auto(String marca,String modelo,String color,int anio,int potencia,double precio){
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.anio = anio;
	this.potencia = potencia;
	this.precio = precio;
    }

    /////////////////////////////////////////

    //Getters
    public String getMarca(){
	return this.marca;
    }

    public String getModelo(){
	return this.modelo;
    }

    public String getColor(){
	return this.color;
    }

    public int getAnio(){
	return this.anio;
    }

    public int getPotencia(){
	return this.potencia;
    }

    public double getPrecio(){
	return this.precio;
    }

    /////////////////////////////////////////

    //Setters
    public void setMarca(String marca){
	this.marca = marca;
    }

    public void setModelo(String modelo){
	this.modelo = modelo;
    }

    public void setColor(String color){
	this.color = color;
    }

    public void setAnio (int anio){
	this.anio = anio;
    }

    public void setPotencia (int potencia){
	this.potencia = potencia;
    }

    public void setPrecio (double precio){
	this.precio = precio;
    }

    ////////////////////////////////////////

    //Método toString
    public String toString(){
	String s = "";
	s += "\n Auto y sus caracter\u00edsiticas: \n-Marca: "+this.marca+"\n-Modelo: "+this.modelo+"\n-Color: "+this.color+"\n-A\u00f1o: "
	    +this.anio+"\n-Potencia: "+this.potencia+" caballos de potencia \n-Precio: "+this.precio;
	return s;
    }
	      
    }

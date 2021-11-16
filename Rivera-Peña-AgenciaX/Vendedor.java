/**
 *Clase Vendedor
*@author Mario Rosales
*@version 1.0
    */
public class Vendedor{
    private String nombre;
    private int entrada;
    private int salida;
    private double salario;

    /**
     *Constructor que genera un vendedor con el nombre, horario y salario que le asignemos
     *@param nombre El nombre del vendedor
     *@param entrada La hora de entrada del vendedor
     *@param salida La hora de salida del vendedor
     *@param salario El salario del vendedor
     */
    public Vendedor(String nombre, int entrada, int salida, double salario){
	this.nombre = nombre;
	this.entrada = entrada;
	this.salida = salida;
	this.salario = salario;
    }

    /**
     *Método de acceso del atributo nombre
     *@return El nombre del vendedor
     */
    public String getNombre(){
	return this.nombre;
    }
    /**
     *Método modificador del atributo nombre
     *@param nombre El nombre que le asignaremos al vendedor
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     *Método de acceso del atributo entrada
     *@return El horario de entrada del vendedor
     */
    public int getEntrada(){
	return this.entrada;
    }
    /**
     *Método modificador del atributo entrada
     *@param entrada El horario de entrada que le asignaremos al vendedor
     */
    public void setEntrada(int entrada){
	this.entrada = entrada;
    }

    /**
     *Método de acceso del atributo salida
     *@return El horario de salida del vendedor
     */
    public int getSalida(){
	return this.salida;
    }
    /**
     *Método modificador del atributo salida
     *@param salida El horario de salida que le asignaremos al vendedor
     */
    public void setSalida(int salida){
	this.salida = salida;
    }

    /**
     *Método de acceso del atributo salario
     *@return El salario del vendedor
     */
    public double getSalario(){
	return this.salario;
    }
    /**
     *Método modificador del atributo salario
     *@param salario El salario que le asignaremos al vendedor
     */
    public void setSalario(int salario){
	this.salario = salario;
    }
    
    /**
     *Método para ver los datos del vendedor
     *@return Un String con los datos del vendedor
     */
    public String toString(){
	return "Nombre: " + nombre + "\nHorario: De " + entrada + ":00 a " + salida + ":00\nSalario: $" + salario;
    }
}

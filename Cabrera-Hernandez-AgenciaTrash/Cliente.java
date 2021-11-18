/**
 * Clase que representa un Cliente en la Agencia Trash.
 * @author : DhamarCabrera
 * @author : Elizabeth Hernandez.
 * @version 1.0
 */

public class Cliente {
    //Atributos
    private String nombre; //Nombre del cliente
    private int edad; //Qué edad tiene el cliente.
    private double dineroDisponible; //Dinero disponible del cliente

    /**
     * Constructor con parámetros del cliente.
     * Recibe dos argumentos.
     * @param : Nombre del cliente
     * @param : dinero que dispone el cliente.
     */

    public Cliente(String nombre, int edad, double dineroDisponible){
	this.nombre = nombre;
	this.edad = edad;    
	this.dineroDisponible = dineroDisponible;
    }

    /**
     * Métodos de acceso y modificación de atributos del cliente.
     */

    // @param : nombre del nuevo cliente
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    // @return : último nombre que se agregó del Cliente
    public String getNombre(){
	return this.nombre;
    }

    // @param : dinero disponible con el que cuenta el cliente.
    public void setEdad(int edad){
	this.edad = edad;
    }

    // @return : dinero disponible total del cliente
    public int edad(){
	return this.edad;
    }
	
    // @param : dinero disponible con el que cuenta el cliente.
    public void setNombre(double dineroDisponible){
	this.dineroDisponible = dineroDisponible;
    }

    // @return : dinero disponible total del cliente
    public double dineroDisponible(){
	return this.dineroDisponible;
    }

   /**
   * Método Especial.
   * @return : información completa del cliente
   */
    public String toString(){
	return "Nombre del cliente: " + this.nombre + "\n" + "Edad del cliente: " + this.edad + "\n" + "Saldo con el que cuenta el cliente: " + this.dineroDisponible;
    }
}

/**
* Fin del programa.
*/

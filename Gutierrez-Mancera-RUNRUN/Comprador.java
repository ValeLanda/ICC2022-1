// Importar la biblioteca Scanner para que el usuario pueda introducir los datos solicitados
import java.util.Scanner;
/**
 * Clase Comprador que representa un cliente automotriz
 * @author Javier Alejandro Mancera Quiroz
 * @version 1.0
 * */
public class Comprador{

    // Atributos
    // Representa el nombre del cliente
    private String nombre;
    // Representa la ubicacion del cliente
    private String ubicacion;
    // Representa la compra realizada por el cliente
    private String compra;
    // Representa el tipo de servicio que requiere el cliente
    private String servicio;
    // Representa el tipo de cliente si es activo o nuevo 
    private String cliente;
    // Representa la calificacion dada por el cliente por el servicio realizado
    private int calificacion;

    /**
     * Constructor sin parametros que representa un perfil de un cliente automotriz
     * ya con datos iniciales 
     * */
    public Comprador(){
	nombre = "Rogelio Augusto Solís";
	ubicacion = "Perseo No. 18, Leyes de Reforma, Coyoacan";
	compra = "Cavalier 2019";
	servicio = "Hojalatería y pintura";
	cliente = "Cliente activo";
	calificacion = 10;
    }

    /**
     * Constructor que recibe un perfil de un cliente automotriz
     * con datos dados por el usuario
     * */
    public Comprador(String nombre, String ubicacion, String compra, String servicio, String cliente, int calificacion){
	this.nombre = nombre;
	this.ubicacion = ubicacion;
	this.compra = compra;
	this.servicio = servicio;
	this.cliente = cliente;
	this.calificacion = calificacion;
    }

    /**
     * Metodo que devuelve el nombre del cliente
     * @return El nombre del cliente
     * */
    public String getNombre(){
	return this.nombre;
    }

    /**
     * Metodo que devuelve la ubicacion del cliente
     * @return La ubicacion del cliente
     * */
    public String getUbicacion(){
	return this.ubicacion;
    }

    /**
     * Metodo que devuelve la compra del cliente
     * @return La compra del cliente
     * */
    public String getCompra(){
	return this.compra;
    }

    /**
     * Metodo que devuelve el tipo de servicio solicitado por el cliente
     * @return El servicio solicitado 
     * */
    public String getServicio(){
	return this.servicio;
    }

    /**
     * Metodo que devuelve el tipo de cliente
     * @return El tipo de cliente
     * */
    public String getCliente(){
	return this.cliente;
    }

    /**
     * Metodo que devuelve la calificacion proporcionada por el cliente 
     * @return La calificacion proporcionada
     * */
    public int getCalificacion(){
	return this.calificacion;
    }
    
    /**
     * Metodo que cambia el nombre del cliente
     * @param nombre El nombre del cliente
     * */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     * Metodo que cambia la ubicacion del cliente
     * @param ubicacion La ubicacion del cliente
     * */
    public void setUbicacion(String ubicacion){
	this.ubicacion = ubicacion;
    }

    /**
     * Metodo que cambia la compra del cliente
     * @param compra La compra del cliente
     * */
    public void setCompra(String compra){
	this.compra = compra;
    }

    /**
     * Metodo que cambia el tipo de servicio solicitado
     * @param servicio El servicio solicitado
     * */
    public void setServicio(String servicio){
	this.servicio = servicio;
    }

    /**
     * Metodo que cambia el tipo de cliente
     * @param cliente Tipo de cliente
     * */
    public void setCliente(String cliente){
	this.cliente = cliente;
    }

    /**
     * Metodo que cambia la calificacion proporcionada por el cliente
     * @param calificacion La calificacion proporcionada
     * */
    public void setCalificacion(int calificacion){
	this.calificacion = calificacion;
    }
}



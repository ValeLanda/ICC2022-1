/**
 * Clase que modela a un vendedor de autos
 * @author Asahel Main, Arsenio Raudry
 * @version 1.0
 */
public class Vendedor{

    //El nombre del vendedor
    private String nombre;

    //Los autos que vende el vendedor
    private Auto autos[];


    /**
     * Metodo constructor que recibe dos parametros
     * @param nombre El nombre del vendedor
     * @param autos Los autos que vende el vendedor
     * Llama al metodo asignarCoches para asignar el vendedor a cada auto
     */
    public Vendedor(String nombre, Auto autos[]){
	this.autos = autos;
	this.nombre = nombre;
	this.asignarCoches();
    }
    /**
     * Metodo que asigna un nuevo nombre al vendedor
     * @param nombre El nuevo nombre del vendedor
     * Llama al metodo asignarCoches para reasignar el vendedor a cada auto
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
	this.asignarCoches();
    }

    /**
     * Metodo que devuelve el nombre del vendedor
     * @return El nombre del vendedor
     */
    public String getNombre(){
	return this.nombre;
    }
    /**
     * Metodo que asigna el nombre del vendedor a cada lote de autos
     */
    public void asignarCoches(){
	for(int i = 0; i<this.autos.length; i++){
	    this.autos[i].setVendedor(this.nombre);
	    //System.out.println(this.autos[i].getVendedor());
	}
    }

   
     

}

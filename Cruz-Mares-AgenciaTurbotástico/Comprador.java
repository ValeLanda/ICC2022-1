public class Comprador{

	//Atributos de la clase
	//Nombre del comprador
	private String nombre;
	//Total que pagó
	private double total_pago;

	/*
	 * Método construstor en el que los datos por default serán 
	 * "VACÍO" o "0.00" en caso de no introducir algún dato en 
	 * la clase ejecutable
	 */
	public 	Comprador(){
		this.nombre = "VACÍO";
	        this.total_pago = 0.00;	
	}

	/*
	 * Método para obtner nombre
	 * @return nombre - NOmbre del comprador
	 */
	public String getNombre(){
	 return nombre;
	}
	/*
	 * Método para asignar el nombre;
	 * @param nuevoNombreC - nuevo nombre del comprador
	 */
	public void setNombre(String nombre){
	 this.nombre = nombre;
	}
	 /*
	  * Método para asignar el valor del pago
	  *@param nuevoPago - la cantidad que pagó
	  */
	 public void setTotal_pago(double total_pago){
	  this.total_pago = total_pago; 
	 }
	/*
	 * Método toString de la clase
	 */
	
	public String toString(){
		return "COMPRADOR: \n Nombre:" +nombre+ "\n Total Pago:"+total_pago;
		
	  }	
}

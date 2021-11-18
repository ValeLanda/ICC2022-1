/**
* Clase que define los atributos y métodos de un Vendedor de Autos en la Agencia Trash.
* @author : Dhamar Cabrera.
* @author : Elizabeth Hernandez.
* @version : 1.0
*/

public class Vendedor {
  // Atributos del Vendedor.
    private String recibe; // se presenta con el cliente
    private String venta; // hace una venta
    private String ticket; // entrega un ticket
    private String bye; // acompaña al cliente a la salida y lo despide.
  
    /**
     * Constructor por omisión
     * @return : recibe
     * @return : venta
     * @return : ticket
     * @return : bye
     */

    public Vendedor (){
	this.recibe = "Buenas tardes estimado cliente, sea usted bienvenido a la Agencia Trash, mi nombre es Nicolas Bourbaki, puede llamarme Nico si así lo prefiere. Estoy aquí para ayudarle a encontrar el auto de sus sueños" + "\n" + "Enseguida le mostraré los autos que la agencia tiene para usted.";
	this.venta = "¡El auto que ha elegido es perfecto!, excelente elección. En un momento le entregaré su ticket de compra, ¿Desea pagar con tarjeta o en efectivo?";
	this.ticket = "¡Ya está todo listo!, hago entrega de su ticket de compra no sin antes recordarle que la agencia Trash agradece su preferencia, esperamos que disfrute de su auto tanto como nosotros disfrutamos su presencia.";
	this.bye = "Hasta luego, de parte de la Agencia Trash le deseo que pase excelentes días junto a su nuevo compañero de viaje.";
    }
  
    /**
     * Constructor con parámetros
     * @param : recibe
     * @param : venta
     * @param : ticket
     * @param : bye
     */

    public Vendedor ( String recibe, String venta, String ticket, String bye ){
	this.recibe = recibe;
	this.venta = venta;
	this.ticket = ticket;
	this.bye = bye;
    }

    /**
     * Acceso a características del vendedor.
     * @return : recibe
     * @return : venta
     * @return : ticket
     * @return : bye
     */
    public String getRecibe ( String recibe ){
	return this.recibe = recibe;
    }

    public String getVenta ( String venta ){
	return this.venta = venta;
    }

    public String getTicket ( String ticket ){
	return this.ticket = ticket;
    }
    public String getBye ( String Bye ){
	return this.bye = bye;
    }

    /**
     * Modificación de las características del Vendedor.
     * @param : recibe
     * @param : venta
     * @param : ticket
     * @param : bye
     */
    public void setRecibe ( String recibe ){
	this.recibe = recibe;
    }

    public void setVenta ( String venta ){
	this.venta = venta;
    }

    public void setTicket ( String ticket ){
	this.ticket = ticket;
    }
    public void setBye ( String bye ){
	this.bye = bye;
    }
}

/**
* Fin del programa.
*/

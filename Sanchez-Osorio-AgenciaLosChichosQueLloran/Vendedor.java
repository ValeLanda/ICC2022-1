/**
 * Clase Vendedor que crea personas encargadas de vender coches dentro de la agencia.
 * @author Fernanda Osorio
 * @version 1.0/ 13 de noviembre de 2021
 */

public class Vendedor{

    //el nombre del vendedor
    private String nombre;
    //el número de vendedor
    private String n_devendedor;
    //el rating del vendedor
    private double rating;
    //el estado de ánimo del vendedor
    private String animo;
    //el sueldo del vendedor
    private double sueldo;
    //un nuevo atributo para cuando se de una queja y el usuario pueda indicar quien fue el vendedor que lo atendió.
    private String nombreVendedor;
    //atributo para insertar la queja que se pone al vendedor.
    private String quejaVendedor;
    //la calificación que el cliente le da al vendedor de acuerdo al servicio que le brindó.
    private int calVendedor;

    //CONSTRUCTORES

    /**
     * Método constructor que no recibe argumentos y que genera un nuevo vendedor de nombre 
     * Luis, con número de vendedor 74, rating de 8.6, estado de ánimo cansado y sueldo de
     * 1290.00 pesos.
     */

    public Vendedor(){
        this.nombre = "Luis";
        this.n_devendedor = "74";
        this.rating = 8.6;
        this.animo = "cansado";
        this.sueldo = 1290.00;
    }

    /**
     * Método constructor que recibe cinco argumentos
     * @param nombre el nombre del vendedor
     * @param n_devendedor su número de vendedor
     * @param rating su rating
     * @param animo su estado de ánimo
     * @param sueldo su sueldo
     */

    public Vendedor(String nombre, String n_devendedor, double rating, String animo, double sueldo){
        this.nombre = nombre;
        this.n_devendedor = n_devendedor;
        this.rating = rating;
        this.animo = animo;
        this.sueldo = sueldo;
    }
    /**
     * Método constructor que recibe tres argumentos
     * @param nombreVendedor nombre del vendedor al cual se le levantará la queja
     * @param quejaVendedor la queja acerca del vendedor
     * @param calVendedor la calificación que el cliente le da al vendedor.
     */
    
    public Vendedor(String nombreVendedor,String quejaVendedor, int calVendedor){
        this.nombreVendedor = nombreVendedor;
        this.quejaVendedor = quejaVendedor;
        this.calVendedor = calVendedor;
    }

    //GETTERS

    /**
     * Método que devuelve el nombre del vendedor
     * @return El nombre del vendedor
     */

    public String getNombre(){
        return this.nombre;
    }

    /**
     * Método que devuelve el número del vendedor
     * @return El número de empleado del vendedor
     */
    public String getN_devendedor(){
        return this.n_devendedor;
    }

    /**
     * Método que devuelve el rating del vendedor
     * @return El rating del vendedor
     */
    public double getRating(){
        return this.rating;
    }

    /**
     * Método que devuelve el estado de ánimo del vendedor
     * @return El estado de ánimo del vendedor
     */
    public String getAnimo(){
        return this.animo;
    }
    /**
     * Método que devuelve el sueldo del vendedor
     * @return EL sueldo del vendedor
     */

    public double getSueldo(){
        return this.sueldo;
    }

    //SETTERS

    /**
     * método que modifica el nombre del vendedor
     * @param nombre El nuevo nombre del vendedor
    */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * método que modifica el número de empleado del vendedor
     * @param n_devendedor El nuevo número del vendedor
    */

    public void setN_devendedor(String n_devendedor){
        this.n_devendedor = n_devendedor;
    }

    /**
     * método que modifica el rating del vendedor
     * @param rating El nuevo rating del vendedor
    */
    public void setRating(double rating){
        this.rating = rating;
    }

    /**
     * método que modifica el estado de ánimo del vendedor
     * @param animo El nuevo estado de ánimo del vendedor
    */
    public void setAnimo(String animo){
        this.animo = animo;
    }

    /**
     * método que modifica el sueldo del vendedor
     * @param sueldo El nuevo sueldo del vendedor
    */
    public void setSueldo(){
        this.sueldo = sueldo;
    }

    //TO STRING
    /**
     * Método To String que vuelve a String los objetos de la clase vendedor.
     * @return El objeto en forma de String
     */
    public String toString(){
        return "La queja se ha registrado a nombre de " + this.nombreVendedor + ",\n" +
        "su rating ha bajado a 3.2, lamentamos haberle dado una mala experiencia. ";
    }

}
/**
 * Clase que representa al vendedor
 * @author : Elizabeth
 * @author : Dhamar
 * @version 1.0
 */

public class Vendedor2
{
    private String nombre;
    private int num_Vendedor;
    private double calif;

    public Vendedor2()
    {
	this.nombre = "Nicolás";
	this.num_Vendedor = 21;
	this.calif = 9.0;
    }

    public Vendedor2(String nombre, int num_Vendedor, double calif)
    {
	this.nombre = nombre;
	this.num_Vendedor = num_Vendedor;
	this.calif = calif;
    }

    public String getNombre()
    {
	return this.nombre;
    }
    public int getNum_vendedor()
    {
	return this.num_Vendedor;
    }
    public double getCalif()
    {
	return this.calif;
    }

    public void setNombre(String nombre)
    {
	this.nombre = nombre;
    }

    public void setNum_Vendedor(int num_Vendedor)
    {
	this.num_Vendedor = num_Vendedor;
    }

    public void setCalif(double calif)
    {
	this.calif = calif;
    }

    public String toString()
    {
	return "El nombre del empleado que lo atenderá es " + this.nombre + ", su número de vendedor es el: " + this.num_Vendedor + "y su calificación es: " + this.calif;
    }
    
}

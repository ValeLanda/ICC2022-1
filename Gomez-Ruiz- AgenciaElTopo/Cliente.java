public class Cliente{

    //Atributos de la clase
    private String cliente;
    private double dinero;
    private String contrasenia;
	
    //////////////////////////////////////////

    //Métodos constructores
    public Cliente(String cliente, String contra){
	this.cliente = cliente;
	this.dinero = 0;
	this.contrasenia = contra;
    }
	
    public Cliente(){
	cliente = "Cliente default 1";
	dinero = 5200.00;
	contrasenia = "kokoko";
    }
	
    public Cliente(String cliente){
	this.cliente = cliente;
	dinero = 8000.00;
	contrasenia = "kakaka";
    }

    public Cliente(double dinero){
	cliente = "Cliente defualt 1";
	this.dinero = dinero;
	contrasenia = "kekeke";
    }
	
    ////////////////////////////////////////////

    //Getters y Setters
    public String getCliente(){
	return this.cliente;
    }
    
    public void setCliente(String cliente){
	this.cliente = cliente;
    }
    
    public double getDinero(){
	return this.dinero;
    }
    
    public void setDinero(double dinero){
	this.dinero = dinero;
    }
    
    public String getContra(){
	return this.contrasenia;
    }
    
    public void setContra(String contra){
	this.contrasenia = contra;
    }

    ///////////////////////////////////////////

    //Método toString	
    public String toString(){
	String s = "";
	s += "\n *Usted accedi\u00f3 como el usuario: "+this.cliente+"*"+"\n *Su capital disponible: \u0024"+this.dinero+"*";
	return s;
    }
	
}

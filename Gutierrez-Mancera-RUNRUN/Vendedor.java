public class Vendedor{

  //Atributos
  private String nombreV;
  private int autosDisponibles;
  private int autosVendidos;
  
  
  public Vendedor(String nombreV,int autosDisponibles,int autosVendidos){
    this.nombreV=nombreV;
    this.autosDisponibles=autosDisponibles;
    this.autosVendidos=autosVendidos;
  }  
  public String getNombreV(){
    return this.nombreV;
  }
  public int getAutosDisponibles(){
    return this.autosDisponibles;
  }
  public int getAutosVendidos(){
    return this.autosVendidos;  
  }
  public void setNombreV(String nombreV){
    this.nombreV=nombreV;  
  }
  public void setAutosDisponibles(int autosDisponibles){
    this.autosDisponibles=autosDisponibles;
  }
  public void setAutosVendidos(int autosVendidos){
    this.autosVendidos=autosVendidos;
  }
}

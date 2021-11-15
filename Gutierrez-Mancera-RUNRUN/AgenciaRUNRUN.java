/**
*@author Gil Axel GUtierrez Lara/Javier Alejandro Mancera Quiroz
*@version 1.0
**/
import java.util.Scanner;
public class AgenciaRUNRUN{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      //Vendedor da la bienvenida
      System.out.println("Bienvenido a la Agencia RUN RUN");
      System.out.println(" ");
      System.out.println("Por favor escriba su nombre");
      //Obtenemos datos del cliente
      String nombreU = sc.nextLine();
      Comprador comprador = new Comprador(nombreU,10);
      comprador.setNombre(nombreU);
      System.out.println("Mucho gusto "+comprador.getNombre());
    
    
    //Obtenemos datos del cliente
    //Vendedor ofrece varios autos sin dar a conocer sus caracteristicas
    //Cliente Selecciona un auto de su interes o ninguno
    //Vendedor da todas las caracteristicas del auto seleccionado
    //Cliente decide si comprarlo o no
    //Vendedor realiza el cobro
    //Cliente paga
    //Auto vendido
    //Despedida al Cliente
    //Calificacion del cliente hacia la agencia.
    
    
      
  }
}

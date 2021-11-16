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
      

      //Vendedor ofrece varios autos sin dar a conocer sus caracteristicas
      Auto auto1 = new Auto("Elantra","rojo",2022,"standar",350000.1);
      System.out.println("Los autos disponibles en inventario son:"+auto1.getNombreA()+"....1");
      System.out.println(comprador.getNombre() + " si te interesa alguno de estos autos, escribe a continuacion el numero correspondiente al auto de tu interes");
      //Cliente Selecciona un auto de su interes o ninguno
      int eleccion = sc.nextInt();
      //Vendedor da todas las caracteristicas del auto seleccionado
      if (eleccion == 1){
	  System.out.println(auto1.toString());
      }else{
	  System.out.println("F");
      }
      //Cliente decide si comprarlo o no
      //Vendedor realiza el cobro
      //Cliente paga
      //Auto vendido
      //Despedida al Cliente
      //Pedir calificacion al cliente sobre la agencia      
  }
}

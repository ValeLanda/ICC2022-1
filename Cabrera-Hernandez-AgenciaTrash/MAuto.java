import java.util.Scanner;
/**
 * Clase que indica las características de un Auto de la Agencia Trash.
 * @author : Dhamar Cabrera.
 * @author : Elizabeth Hernandez.
 * @version : 1.0
 */

public class MAuto {
    public static void main (String[] args){
    /**
     * Método main
     * @param : args
     */
   
    /**
     * Ejecutación del constructor por omisión de la clase @see : Auto
     */
	// Caso 9
    Auto versa = new Auto ();

    /**
     * Ejecutación de   constructores con parámetros de la clase @see : Auto
     */
    //Caso 1
    Auto aveo = new Auto ( "Chevrolet", "Aveo 2021", "Sedan", "Manual",  "Azul", 4, 4, "$280, 300.00" );
    // Caso 2
    Auto tornado = new Auto ( "Chevrolet", "Tornado 2022", "Van", "Automático",  "Blanco", 4, 3, "$267, 900.00" );
    // Caso 3
    Auto explorer = new Auto ( "Ford", "Explorer 2020", "Camioneta Familiar", "Manual",  "Verde", 6, 4, "$964, 200.00" );
    // Caso 4
    Auto mustang = new Auto ( "Ford", "Mustang 2019", "Deportivo", "Manual",  "Naranja",  4, 2, "$1, 040, 000.00" );
    // Caso 5
    Auto wrangler = new Auto ( "Jeep", "Wrangler 2016", "Todoterreno, SUV","Automático", "Negro", 4, 2, "$682, 999.00" );
    // Caso 6
    Auto bumo = new Auto ( "Mercedes Benz", "BUMO Arocs 2021", "Casa Rodante", "Automático", "Blanco", 6, 2, "$1,689, 000.00" );
    // Caso 7
    Auto convertible = new Auto ("Mini", "Mini Convertible 2022", "Cooper", "Automático", "Verde", 4, 4, "$847, 027.00");
    // Caso 8
    Auto tiida = new Auto ( "Nissan", "Tiida 2021", "Sedan", "Manual", "Amarillo", 4, 4, "$115, 000.00" );
    // Caso 10
    Auto fortwo = new Auto ("Smart", "Fortwo 2015", "Coupé","Manual", "Morado", 4, 3, "$162, 440.00" );
    // Caso 11
    Auto sienna = new Auto ( "Toyota", "Sienna 2013", "Minivan", "Manual", "Dorada", 4, 5, "$264, 252.00" );
    // Caso 12
    Auto hilux = new Auto ( "Toyota", "Hilux 2017", "Pickup", "Manual",  "Blanca", 4, 2, "$385, 674.00" );
    
    


    //Menú de los Modelos de Autos disponibles en la Agencia Trash.
    System.out.println ("\n" + "\n" +" ---> Autos de la Agencia Trash disponibles en esta sucursal <--- " + "\n" + "\n" + "1.  Chevrolet Aveo 2021. " + "\n" + "2.  Chevrolet Tornado 2022." + "\n" + "3.  Ford Explorer 2020." + "\n" + "4.  Ford Mustang 2019." + "\n" + "5.  Jeep Wrangler 2016." + "\n" + "6.  Mercedes Benz BUMO Acrocs 2021." + "\n" + "7.  Mini Convertible 2022." + "\n" + "8.  Nissan Tiida 2011." + "\n" + "9.  Nissan Versa 202.1" + "\n" + "10. Smart Fortwo 2015." + "\n" + "11. Toyota Sienna 2013." + "\n" + "12. Toyota Hilux 2017.");
    System.out.print( "\n" + "\n" + " |" + "\n" + " | Indique el número del auto que desearía comprar: ");

    Scanner n = new Scanner (System.in);
    int modeloindicado = n.nextInt ();
    System.out.println( " |" + "\n" + " v" + "\n");
    String modelo = "";
    
    switch (modeloindicado){
    case 1:
	modelo = aveo.toString();
	break;
    case 2:
	modelo = tornado.toString();
	break;
    case 3:
	modelo = explorer.toString();
	break;
    case 4:
	modelo = mustang.toString();
	break;
    case 5:
	modelo = wrangler.toString();
	break;
    case 6:
	modelo = bumo.toString();
	break;
    case 7:
	modelo = convertible.toString();
	break;
    case 8:
	modelo = tiida.toString();
	break;
    case 9:
	modelo = versa.toString();
	break;
    case 10:
	modelo = fortwo.toString();
	break;
    case 11:
	modelo = sienna.toString();
    case 12:
	modelo = hilux.toString();	    
    }
    
    System.out.println(modelo + "\n");
    }
}
/**
 * Fin del programa.
 */


/**
 * Clase Agencia que funje como main para poner en uso la clase Auto, Vendedor y Cliente, simulando un 
 * programa de una agencia de coches.
 * @author Fernanda Osorio y Ethan D. Sánchez.
 * @version 1.0/ 16 de noviembre de 2021.
 */

import java.util.Scanner;

public class Agencia{
    public static void main(String[] args)throws InterruptedException{
	Scanner sc = new Scanner(System.in);

	//este Scanner es para pausar los datos en pantalla, ya que si no, la informacion se imprime y se borra en corto
	Scanner p = new Scanner(System.in);
 	int opcion;
	do{
	    //Agregamos codio ANSI para simular limpieza de pantalla
	    System.out.print("\033[H\033[2J");
	    System.out.println("****BIENVENIDO A LA AGENCIA LOS CHICOS QUE LLORAN****" + "\n");
	    System.out.println("¿Cual es su nombre? ");
	    System.out.print("Ingrese su nombre (ejemplo: Ethan): ");

		Scanner sc7 = new Scanner(System.in);
	    String nombreCliente = sc7.nextLine();

	    Cliente cliente = new Cliente(nombreCliente);
		
		
		
		System.out.println("¿Que podemos hacer por ti "+nombreCliente + "?" + "\n" + "1. Comprar auto" + "\n" + "2. Quejas sobre algun vendedor" + "\n" + "3. Comprar auto para entregar como regalo" + "\n" + "4.Salir");
	    System.out.print("Elija una opcion: ");

	    opcion = sc.nextInt();
	    System.out.println("---------------------------------------------------------------------------------------");
	    
	    switch(opcion){
		
	    case 1:
		do{
		    System.out.print("\033[H\033[2J");
		    
		    //booleano que mientras sea verdadero se va a manetener en el menu de compra
		    boolean repite = true;

		    //Menu de la agencia 
		    System.out.println("**Bienvenido a la compra de autos**");
		    System.out.println("¿Que auto quiere comprar?");
		    System.out.println("1. Chevrolet Aveo 2022 $229,200 (color a elegir)");
		    System.out.println("2. Chevrolet Groove 2022 $332,900 (solo color rojo disponible)");
		    System.out.println("3. Chevrolet Bolt EUV 2020 (precio varia si es electrico o no)");
		    System.out.println("4. Salir al menu principal");
		    System.out.print("Seleccione una opcion: ");
		    opcion = sc.nextInt();
		    System.out.println("------------------------------------------------------");
	 
		    switch(opcion){
			//Si opcion es 1 entra al case 1
		    case 1:
			//codigo ANSI para limpiar la pantalla
			System.out.print("\033[H\033[2J");

			//Pregunta al usuario que color quiere en el auto 
			System.out.println("¿Que color desea?");
			System.out.println("1. Rojo");
			System.out.println("2. Blanco");

			//El usuario ingresa una opcion
			System.out.print("Elija una opcion: ");
			opcion = sc.nextInt();
			System.out.println("---------------------------------------------");

			//Si el usuario ingresa 1 entra al if
			if(opcion == 1){
			    //Se crea un ejemplar de la clase con el constructor que recibe solo el color del auto
			    Auto autoAveo = new Auto("Rojo");
			    System.out.println("Usted ha realizado la compra de:\n" + autoAveo);
				int cobro = cliente.dineroDisponible() - 229200; 
			    System.out.println("Usted dispone de: $"+ cobro);


			    //Si la opcion ingresada es 2 entra al else if
			}else if(opcion == 2){

			    //Se crea un ejemplar de la clase con el constructor que recibe solo el color del auto
			    Auto autoAveo = new Auto("Blanco");
			    System.out.println("Usted ha realizado la compra de:\n" + autoAveo);
				System.out.println("Usted dispone de: $"+ (cliente.dineroDisponible() - 229200));

			    //Si el usuario ingresa otro valor, muestra el siguiente mensaje
			}else{
			    System.out.println("Ingresa una opcion valida");
			}
			System.out.println("---------------------------------------------");

			//El mensaje aparece y los datos en pantala se quedan inmoviles hasta que el usuario teclee enter
			System.out.print("Presione enter para continuar...");
			p.nextLine();
			break;
		
		
		case 2:

		    //Codifo ANSI que simula limpiar la pantalla 
		    System.out.print("\033[H\033[2J");

		    //Se crea un ejemplar de la clase con el constructor sin parametros
		    Auto autoGroove = new Auto();
		    System.out.println("Usted ha realizado la compra de: \n" + autoGroove);
		     System.out.println("Usted dispone de: $"+ (cliente.dineroDisponible() - 332900) );

			System.out.println("---------------------------------------------");

		    //El mensaje aparece y los datos en pantalla se quedan inmoviles hasta que el usuario teclee enter
		    System.out.print("Presione enter para continuar...");
		    p.nextLine();
		    break;
		
		case 3:
		    
		    //Codigo ANSI que simula limpiar la pantalla
		    System.out.print("\033[H\033[2J");

		    //El usuario elige una opcion
		    System.out.println("Elija su clasificacion:");
		    System.out.println("1. Electrico $930,900");
		    System.out.println("2. No electrico $620,000");
		    System.out.print("Elija una opcion: ");
		    opcion = sc.nextInt();
		    System.out.println("---------------------------------------------");

		    //Si la opcion ingresada es 1 entra al if
		    if(opcion == 1){

			//Se crea un ejemplar de la clase con el constructor que recibe si es electrico y el precio del auto 
			Auto autoBolt = new Auto(true, "930,900");
			System.out.println("Usted ha realizado la compra de:\n" + autoBolt);
			System.out.println("Usted dispone de: $"+ (cliente.dineroDisponible() - 930900) );

			//Si la opcion ingresada es 2 entra al else if 
		    }else if(opcion == 2){

			//Se crea un ejemplar de la clase con el constructor que recibe si es electrico y el precio del auto
			Auto autoBolt = new Auto(false, "620,000");
			System.out.println("Usted ha realizado la compra de:\n" + autoBolt);
			System.out.println("Usted dispone de: $"+ (cliente.dineroDisponible() - 620000) );

			//Si la opcion ingresada no es 1 o 2 entra al else y muestra un mensaje al usuario
		    }else{
			System.out.println("Ingresa una opcion valida");
		    }
		    System.out.println("---------------------------------------------");

		    //El mensaje aparece y los datos en pantalla se quedan inmoviles hasta que el usuario teclee enter
		    System.out.print("Presione enter para continuar...");
		    p.nextLine();
		    break;
		
		case 4:
		    //Codigo ANSI que simula la limpieza de pantalla
		    System.out.print("\033[H\033[2J");
		    
		    //repite = false, regresa al menu principal
		    repite = false;
		    break;
		}//fin del segundo switch
		    
	    }while(opcion != 4);//fin del segundo do-while
	    
	    break;

	    
	case 2:

	    //Codigo ANSI para simular limpieza de pantalla
	    System.out.print("\033[H\033[2J");

	    //El usuario elije una opcion
	    System.out.println("¿Cual es su queja?");
	    System.out.println("1. Queja sobre algun vendedor.");
	    System.out.println("2. Queja sobre servicio.");
	    System.out.print("Elija alguna opcion: ");

	    opcion = sc.nextInt();

        //Si el usuario elige dar una queja acerca del vendedor, se le solicitará ingresar el nombre del vendedor y el 
        //motivo de su queja, así como la calificación que le otorga de acuerdo a eso.
	    if(opcion == 1){
		System.out.print("Ingrese el nombre del vendedor:  \n");
		//Scanner nombreVendedor = new Scanner(System.in); //EL NOMBRE DEL SCANNER DEBE SER DISTINTO AL NOMBRE DEL SCANNER
		Scanner sc1 = new Scanner(System.in);
		String nombreVendedor = sc1.nextLine();
		System.out.print("Ingrese el motivo de queja: \n");

		//EL NOMBRE DEL SCANNER DEBE SER DISTINTO AL NOMBRE DEL SCANNER
		//Scanner quejaVendedor = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String quejaVendedor = sc2.nextLine();
		System.out.println("---------------------------------------------");
		System.out.print("¿Que calificacion le da al vendedor del 1 al 5 (1 muy malo - 5 excelente)");

		//EL NOMBRE DEL SCANNER DEBE SER DISTINTO AL NOMBRE DEL SCANNER
		//Scanner calVendedor = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		int calVendedor = sc3.nextInt();
		Vendedor vendedor = new Vendedor(nombreVendedor,quejaVendedor,calVendedor);
		System.out.println("Su queja ha sido recibida:\n" + vendedor);

        //en caso de que el usuario quiera dar una queja acerca del servicio, solamente se le pedirá que escriba cual es.
		    }else if(opcion == 2){
		System.out.print("Ingrese su queja: ");
		Scanner sc4 = new Scanner(System.in);
		String queja = sc4.nextLine();
		System.out.println("Su queja ha sido recibida, gracias");
		
		    }else{
		    System.out.println("Ingresa una opcion valida");}
		    
	    

	    //El mensaje aparece y los datos en pantalla se quedan inmoviles hasta que el usuario teclee enter
	    System.out.print("Teclee cualquier tecla para continuar...");
	    p.nextLine();
	    break;

	case 3:

		//Codigo ANSI que simula limpieza de pantalla
		System.out.println("\033[H\033[2J");
		
		//El usuario elige una opción
		System.out.println("***Bienvenido a la compra de autos para regalo*** \n");
		System.out.println("Por el momento solamente contamos con la posibilidad de regalar el auto Chevrolet Aveo 2022, con precio de $229,200. (color a elegir)");
		System.out.println("Elija el color que prefiera: ");
		System.out.println("1. Rojo");
		System.out.println("2. Blanco");
		opcion = sc.nextInt();
		System.out.println("------------------------------------------------------");

		switch(opcion){
			//el usuario eligió el carro Aveo rojo
			case 1:
			//codigo ANSI para limpiar la pantalla
			System.out.print("\033[H\033[2J");

			//Pregunta donde quiere que se haga la entrega del auto.
			System.out.println("¿Desea que se entregue a domicilio o prefiere que la entrega sea en la agencia?");
			System.out.println("1. A domicilio");
			System.out.println("2. En la agencia");

			//El usuario ingresa una opcion
			System.out.print("Elija una opcion: ");
			opcion = sc.nextInt();
			System.out.println("---------------------------------------------");

			//Si el usuario ingresa 1 entra al if para ver como continua la compra a domicilio
			if(opcion == 1){
			    //Se crea un ejemplar de la clase con el constructor que recibe el color del auto y el domicilio a donde llegará
			    System.out.println("Escriba su calle,número y código postal");
				Scanner sc5 = new Scanner(System.in);
				String domicilio = sc5.nextLine();
				Auto autoAveoregaloR = new Auto("Rojo", domicilio);
			    System.out.println("Usted ha realizado la compra de " + "\n" + autoAveoregaloR + "\n" + "le estará llegando a su domicilio en " + domicilio + "  aproximadamente en 10 días hábiles.");

			    //Si la opcion ingresada es 2 entra al else if
			}else if(opcion == 2){

			    //El cliente eligió que la entrega fuera en la agencia.
			    Auto autoAveorojo = new Auto("Rojo");
			    System.out.println("Usted ha reealizado la compra de " + autoAveorojo + " la persona a la que le dará el regalo podrá recogerlo en tres días hábiles en nuestra agencia.");

			    //Si el usuario ingresa otro valor, muestra el siguiente mensaje
			}else{
			    System.out.println("Ingresa una opcion valida");
			}
			System.out.println("---------------------------------------------");

			//El mensaje aparece y los datos en pantala se quedan inmoviles hasta que el usuario teclee enter
			System.out.print("Presione enter para continuar...");
			p.nextLine();
			break;

			case 2:

			//codigo ANSI para limpiar la pantalla
			System.out.print("\033[H\033[2J");

			//Pregunta al usuario si desea que se entregue a domicilio o en la agencia
			System.out.println("¿Desee que se entregue a domicilio o prefiere que la entrega sea en la agencia?");
			System.out.println("1. A domicilio");
			System.out.println("2. En la agencia");

			//El usuario ingresa una opcion
			System.out.print("Elija una opcion: ");
			opcion = sc.nextInt();
			System.out.println("---------------------------------------------");

			//Si el usuario ingresa 1 entra al if para ver como continua la compra a domicilio
			if(opcion == 1){
			    //Se crea un ejemplar de la clase con el constructor que recibe el color del auto y el domicilio a donde llegará
			    System.out.println("Escriba su calle y número.");
			    Scanner sc6 = new Scanner(System.in);
			    String domicilio = sc6.nextLine();
				System.out.println("---------------------------------------------");
				Auto autoAveoregaloB = new Auto("Blanco", domicilio);
			    System.out.println("Usted ha realizado la compra de: " + autoAveoregaloB + " le estará llegando en su domicilio" + domicilio +  " en un aproximado de 10 días");

			    //Si la opcion ingresada es 2 entra al else if
			}else if(opcion == 2){

			    //El cliente eligió que la entrega fuera en la agencia.
			    Auto autoAveoblanco = new Auto("Blanco");
			    System.out.println("Usted ha realizado la compra de: " + autoAveoblanco + " su auto estará listo para que la persona a la que se lo regaló pase a recogerlo en tres días hábiles");

			    //Si el usuario ingresa otro valor, muestra el siguiente mensaje
			}else{
			    System.out.println("Ingresa una opcion valida");
			}
			System.out.println("---------------------------------------------");

			//El mensaje aparece y los datos en pantala se quedan inmoviles hasta que el usuario teclee enter
			System.out.print("Presione enter para continuar...");
			p.nextLine();
			break;


		}

	case 4:

	    //Codigo ANSI que simula limpieza de pantalla
	    System.out.print("\033[H\033[2J");

	    //Como la opcion es salir, se sale del menu 
	    System.out.println("Gracias por comprar en Los Chicos Que Lloran, buen dia");

	    //Se usa System.exit(0) para saber si la ejecucion del programa fue buena
	    System.exit(0);
	    break;
	    }

	
	
	    }while(opcion != 3);//fin del do-while
	
	
    }//fin del metodo main
    
}//fin de la clase Agencia

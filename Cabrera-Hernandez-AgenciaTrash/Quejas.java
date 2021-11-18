import java.util.Scanner;
public class Quejas
{
    public static void main(String[] args)
    {
	Scanner teclado= new Scanner(System.in); 
	int opcion, queja;
	

	System.out.println("¿Qué opción desea?");
	opcion = teclado.nextInt();

	if (opcion == 2) {
			System.out.println("¿Qué tipo de queja desea poner?");
			System.out.println("1. Servicio");
			System.out.println("2. Vendedor");
			System.out.println("Elija alguna opción: ");
			queja = teclado.nextInt();

			if((queja > 2) || (queja < 1)) {
				System.out.println("La opción no está dentro del menú");
			    }
			else  {
				switch(queja)
				    {
				    case 1: System.out.println("Escriba el mal servicio que recibió: ");
					String servicio = teclado.next();
					System.out.println("Haremos lo posible por mejorar nuestro servicio tomando en cuenta las observaciones que nos ha hecho saber, gracias por su paricipación.");
					break;

				    case 2: System.out.println("Escriba el nombre del vendedor que lo atendió: ");
					String vendedor = teclado.next();
					System.out.println("Escriba su queja sobre el empleado:");
					String empleado = teclado.next();
					System.out.println("Haremos lo posible por mejorar nuestro servicio tomando en cuenta las observaciones que nos ha hecho saber, gracias por su participación. ");
					break;
				    }
			    }
			
	if ( opcion == 3)  {
			System.out.println("Gracias por su visita a la Agencia Trash, esperamos verlo pronto.");
	}
	}
    }
}

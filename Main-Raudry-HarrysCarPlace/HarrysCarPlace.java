public class HarrysCarPlace{
    public static void main(String[] args){
	
	Auto autos[] = new Auto[4];
	autos[0] = new Auto("DeLorean", "Plateado","1982", 200000);
	autos[1] = new Auto("KITT", "Negro", "1982", 150000);
	autos[2] = new Auto("Tsuru", "Arcoiris", "2001", 430000);
	autos[3] = new Auto("Tractor de combate", "Violeta", "1969", 500000);

	Auto autosB[] = new Auto[5];
	autosB[0] = new Auto("Vocho", "Amarillo","1976", 200000);
	autosB[1] = new Auto("Plymouth Fury", "Rojo", "1958", 150000);
	autosB[2] = new Auto("Nosedecoches", "Azul", "1977", 430000);
	autosB[3] = new Auto("fooo", "fefee", "2003", 500000);
	autosB[4] = new Auto("faaa", "fiiii", "1985", 594594);

	
	Vendedor v1 = new Vendedor("Pedrito", autos);
	Vendedor v2 = new Vendedor("Martina", autosB);

	v1.setNombre("Angel");
	
        Comprador c1 = new Comprador("Estela", 5000000, 10);
	Comprador c2 = new Comprador("Diego", 10000000, 3);
	Comprador c3 = new Comprador("Alfredo", 6000000, 5);

	System.out.println("----------------------------------------");
	System.out.println("---Bienvenido a Harry's Car Place---");
	
	System.out.println("/////////////");
	System.out.println("Primer Comprador: ");
	System.out.println("/////////////");
	System.out.println("Nombre del comprador: " + c1.getNombre());
	System.out.println("Dinero actual de " + c1.getNombre() + ": $" + c1.getDinero());
	c1.comprarAuto(autos[0]);
	System.out.println("\n\nDinero actual de " + c1.getNombre() + ": $" + c1.getDinero());
	c1.comprarAuto(autos[1]);
	System.out.println("\n\nDinero actual de " + c1.getNombre() + ": $" + c1.getDinero());
	c1.comprarAuto(autos[1]);
	System.out.println("\n\nDinero actual de " + c1.getNombre() + ": $" + c1.getDinero());

	c1.comprarAuto(autos[2]);
	System.out.println("\n\nDinero actual de " + c1.getNombre() + ": $" + c1.getDinero());

	c1.comprarAuto(autos[3]);
	System.out.println("\n\nDinero actual de " + c1.getNombre() + ": $" + c1.getDinero());
	
	System.out.print("\n");
	
	c1.mostrarAutosEnPosesion();


	System.out.println("\n\n");
	System.out.println("///////////");
	System.out.println("Segundo comprador: ");
	System.out.println("/////////////");
	System.out.println("Nombre del comprador: " + c2.getNombre());
	System.out.println("Dinero actual de " + c2.getNombre() + ": $" + c2.getDinero());
	c2.comprarAuto(autosB[0]);
	System.out.println("\n\nDinero actual de " + c2.getNombre() + ": $" + c2.getDinero());
	c2.comprarAuto(autosB[1]);
	System.out.println("\n\nDinero actual de " + c2.getNombre() + ": $" + c2.getDinero());
	c2.comprarAuto(autosB[2]);
	System.out.println("\n\nDinero actual de " + c2.getNombre() + ": $" + c2.getDinero());

	c2.comprarAuto(autosB[3]);
	System.out.println("\n\nDinero actual de " + c2.getNombre() + ": $" + c2.getDinero());

	c2.comprarAuto(autosB[4]);
	System.out.println("\n\nDinero actual de " + c2.getNombre() + ": $" + c2.getDinero());
	
	System.out.print("\n");
	
	c2.mostrarAutosEnPosesion();



	System.out.println("\n\n");
	System.out.println("///////////");
	System.out.println("Tercer comprador: : ");
	System.out.println("/////////////");
	System.out.println("Nombre del comprador: " + c3.getNombre());
	System.out.println("Dinero actual de " + c3.getNombre() + ": $" + c3.getDinero());
	c3.comprarAuto(autosB[3]);
	System.out.println("\n\nDinero actual de " + c3.getNombre() + ": $" + c3.getDinero());
	c3.comprarAuto(autosB[4]);
	System.out.println("\n\nDinero actual de " + c3.getNombre() + ": $" + c3.getDinero());
	
	
	System.out.print("\n");
	
	c3.mostrarAutosEnPosesion();

	
	
	
	






	

	


    }
}

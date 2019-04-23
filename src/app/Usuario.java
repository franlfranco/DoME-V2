package app;

import java.util.Scanner;

public class Usuario {

	Catalogo catalogo = new Catalogo();
	Scanner sc = new Scanner(System.in);
	
	public void menuPrincipal() {
		System.out.println("Bienvenido al DoME!");
		System.out.println("1. Agregar");
		System.out.println("2. Listar");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("0. Salir");
		System.out.printf("Ingrese su opcion: ");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			catalogo.agregarElemento(crearMusica());
			break;
		}
	}
	
	public Musica crearMusica() {
		System.out.println("Agregar musica");
		System.out.printf("\n\nIngrese el titulo: ");
		sc.next();
		String titulo = sc.nextLine();
		System.out.printf("\n\nIngrese la duracion: ");
		sc.next();
		double duracion = sc.nextDouble();
		System.out.printf("\n\nIngrese el autor: ");
		String autor = sc.nextLine();
		System.out.printf("\n\nIngrese un comentario: ");
		sc.next();
		String comentario = sc.nextLine();
		System.out.printf("\n\nIngrese cantidad de temas: ");
		sc.next();
		int cantidadTemas = sc.nextInt();
		Musica musica = new Musica(titulo, duracion, autor, false, comentario, true, cantidadTemas);
		
		return musica;
	}
}

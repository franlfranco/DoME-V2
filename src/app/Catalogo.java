package app;

import java.util.ArrayList;

public class Catalogo {

	ArrayList<Musica> catalogoMusica;
	ArrayList<Pelicula> catalogoPelicula;
	
	public Catalogo() {
		catalogoMusica = new ArrayList<>();
		catalogoPelicula = new ArrayList<>();
	}
	
	public void agregarElemento(Elemento e) {
		if(e instanceof Musica) {
			catalogoMusica.add((Musica) e);
		} else {
			catalogoPelicula.add((Pelicula) e);
		}
	}
	
	public void listarTodo() {
		listarMusica();
		listarPeliculas();
	}
	
	public void listarMusica() {
		System.out.println("------------Musica------------");
		for(Musica m : catalogoMusica) {
			System.out.println(m.toString());
		}
		System.out.println("------------------------------");
	}
	
	public void listarPeliculas() {
		System.out.println("------------Peliculas------------");
		for(Pelicula p : catalogoPelicula) {
			System.out.println(p.toString());
		}
		System.out.println("------------------------------");
	}
	
	public int buscarMusicaPorTitulo(String titulo) {
		int indice = -1;
		for(Musica m : catalogoMusica) {
			if(titulo.equals(m.getTitulo())) {
				indice = catalogoMusica.indexOf(m);
			}
		}
		return indice;
	}
	
	public int buscarPeliculaPorTitulo(String titulo) {
		int indice = -1;
		for(Pelicula p : catalogoPelicula) {
			if(titulo.equals(p.getTitulo())) {
				indice = catalogoPelicula.indexOf(p);
			}
		}
		return indice;
	}
		
}

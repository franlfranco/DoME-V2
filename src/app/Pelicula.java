package app;

public class Pelicula extends Elemento{

	private String director;
	
	public Pelicula(String titulo, double duracion, String autor, boolean favorito, String comentario, boolean loTengo, String director) {
		super(titulo, duracion, autor, favorito, comentario, loTengo);
		this.director = director;
	}
	
	public String getDirector() {
		return director;
	}
	
	@Override
	public String toString() {
		return "Pelicula \ntitulo: " + getTitulo()
		+ "\nduracion: " + getDuracion()
		+ "\nautor: " + getAutor()
		+ "\nfavorito: " + isFavorito()
		+ "\ncomentario: " + getComentario()
		+ "\nloTengo: " + isLoTengo()
		+ "\ndirector: " + director;
	}
}

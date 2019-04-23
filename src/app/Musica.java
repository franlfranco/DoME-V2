package app;

public class Musica extends Elemento {

	private int cantidadTemas;
	
	public Musica(String titulo, double duracion, String autor, boolean favorito, String comentario, boolean loTengo, int cantidadTemas) {
		super(titulo, duracion, autor, favorito, comentario, loTengo);
		this.cantidadTemas = cantidadTemas;
	}
	
	public int getCantidadTemas() {
		return cantidadTemas;
	}

	@Override
	public String toString() {
		return "Musica \ntitulo: " + getTitulo()
		+ "\nduracion: " + getDuracion()
		+ "\nautor: " + getAutor()
		+ "\nfavorito: " + isFavorito()
		+ "\ncomentario: " + getComentario()
		+ "\nloTengo: " + isLoTengo()
		+ "\ncantidadTemas: " + cantidadTemas;
	}
	
	
}

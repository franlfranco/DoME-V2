package app;

public class Elemento {

	private String titulo;
	private double duracion;
	private String autor;
	private boolean favorito;
	private String comentario;
	private boolean loTengo;
	
	public Elemento(String titulo, double duracion, String autor, boolean favorito, String comentario, boolean loTengo) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.autor = autor;
		this.favorito = favorito;
		this.comentario = comentario;
		this.loTengo = loTengo;
	}
	
	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public void setLoTengo(boolean loTengo) {
		this.loTengo = loTengo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public double getDuracion() {
		return duracion;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public boolean isFavorito() {
		return favorito;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public boolean isLoTengo() {
		return loTengo;
	}
}

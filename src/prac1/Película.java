package prac1;

import java.util.Date;
import java.util.List;
import java.util.LinkedList;

public class Película {
	private String titulo;
	private Date año;
	private String sinopsis;
	private Genero genero;
	private String pais;

	protected List<Persona> actores;
	protected List<Persona> directores;
	protected List<Persona> productores;
	protected List<Persona> guionistas;

	public Película(String titulo, Date año, String sinopsis, Genero genero, String pais) {
		this.titulo = titulo;
		this.año = año;
		this.sinopsis = sinopsis;
		this.genero = genero;
		this.pais = pais;

		actores = new LinkedList<Persona>();
		directores = new LinkedList<Persona>();
		productores = new LinkedList<Persona>();
		guionistas = new LinkedList<Persona>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getAño() {
		return año;
	}

	public void setAño(Date año) {
		this.año = año;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<Persona> getActores() {
		return actores;
	}

	public List<Persona> getDirectores() {
		return directores;
	}

	public List<Persona> getProductores() {
		return productores;
	}

	public List<Persona> getGuionistas() {
		return guionistas;
	}
}

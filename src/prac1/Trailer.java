package prac1;

import java.net.URL;
import java.sql.Time;
import java.util.List;
import java.util.LinkedList;

public class Trailer {
	private URL url;
	private Time duracion;
	
	protected List<Persona> editor;

	public Trailer(URL url, Time duracion) {
		this.url = url;
		this.duracion = duracion;
		this.editor = new LinkedList<>();
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public Time getDuracion() {
		return duracion;
	}

	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}

	public List<Persona> getEditor() {
		return editor;
	}
}

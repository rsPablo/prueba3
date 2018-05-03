package prueba;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

public class LineaEntrada {

	
	public LineaEntrada(String linea) {
	
		linea.split(" ");
		
	}
	

	private static String HOME = "timelog.log";
	private LocalDateTime fechaYhora;
	private String metodo;
	private String recurso;
	private String llamada;
	private double tiempo;
	
	Path p = Paths.get(HOME);
	
	File file = p.toFile();
	
	
	
	

	public LocalDateTime getFechaYhora() {
		return fechaYhora ;
	}

	public String getMetodo() {
		return metodo;
	}

	public String getRecurso() {
		return recurso;
	}

	public String getLlamada() {
		return llamada;
	}

	public double getTiempo() {
		return tiempo;
	}
	
	
	
	

}

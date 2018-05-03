package prueba;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GestorPersonas {

	private static GestorPersonas instance = null;

	public static GestorPersonas getInstance() {

		if (instance == null) {
			instance = new GestorPersonas();
		}
		return instance;
	}

	private GestorPersonas() {
		super();
		listaPersona = new ArrayList<>();
	}

	private List<Persona> listaPersona;

	public double edadMediaPlantilla() {
		double edad = 0.0;
		int sum = 0;
		for (Persona p : this.listaPersona) {
			sum = sum + p.getEdad();
		}
		edad = sum / this.listaPersona.size();
		return edad;
	}

	public List<Persona> getListaPersona() {
		return listaPersona;
	}

	public void añadeEmpleado(Persona p) throws DNIduplicadoException {
		try {
			for (Persona per : getListaPersona()) {
				if (per.getDNI().equals(p.getDNI())) {
					throw new DNIduplicadoException();
				}
			}
			listaPersona.add(p);
		} catch (DNInoValidoException e) {
			e.getMessage();
		}
	}

	public void print(Predicate<Persona> checker) {

		for (Persona p : listaPersona) {
			if (checker.test(p)) {
				System.out.println(p);
			}
		}
	}

	public void procesaPersona(Predicate<Persona> check, Consumer<Persona> block) {

		for (Persona p : listaPersona) {
			if (check.test(p)) {
				block.accept(p);
			}
		}

	}
	
	public double edadMedia() {
		double em = listaPersona.stream()
			.mapToInt(e -> {
				System.out.println("Valor map " + e.getEdad());
				return e.getEdad();
			})
			.average()
			.getAsDouble();
		return em;
		
	} 
	
	public List<Persona> filtrarPorEdadMedia (Predicate<Persona> check){
		
		List<Persona> listaP = new ArrayList<>();
		listaP = listaPersona.stream()
			.filter(check)
			.collect(Collectors.toList());
		
		return listaP;
		
	}
	
	
//	Hacer un metodo genérico con un predicado y un filtrado como entrada
	
	
	
	
	
	
	
}

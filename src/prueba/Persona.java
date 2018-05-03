package prueba;

import java.util.*;

public abstract class Persona extends DNInoValidoException implements Comparable<Persona>, Cotizable {
	
	//Constructores

	public Persona(String nombre, String apellido, Integer edad, String dNI, int fechaInicio, TipoContrato contrato, boolean jubilarse) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		DNI = dNI;
		this.fechaInicio = fechaInicio;
		this.contrato = contrato;
		this.jubilarse = jubilarse;
	}
	
	public Persona(String nombre, String apellido, String dNI, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.edad = edad;
	}
	
	public Persona() {
	}
	
	//Atributos
	
	private String nombre;
	private String apellido;
	private Integer edad;
	private String DNI;
	private int fechaInicio;
	private TipoContrato contrato;
	private boolean jubilarse;

	//Metodos

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String toString() {
		String s = "";
		try {
			s = "[" + getNombre() + ", " + getApellido() + ", " + getDNI() + "]";
		} catch (DNInoValidoException p) {
			System.out.println(p.getMessage());
		} 
		return s;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDNI() throws DNInoValidoException {
		if(DNI.length() != 9) {
			throw new DNInoValidoException();
		}
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public boolean puedeJubilarse() {
		boolean t = false;
		int fecha = Calendar.getInstance().get(Calendar.YEAR) - fechaInicio;
		if (edad > 65 ^ fecha > 30) {
			t = true;
		} else {
			t = false;
		}

		return t;
	}

	public int compareTo(Persona o) {
		return this.edad - o.edad;
	}

	public Integer getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Integer fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public TipoContrato getContrato() {
		return contrato;
	}

	public void setContrato(TipoContrato contrato) {
		this.contrato = contrato;
	}

	// public int añosParaJubilarse() {
	//
	// int tiempoTrabajado = Calendar.getInstance().get(Calendar.YEAR) -
	// fechaInicio;
	// int tiempoParaJubilarse = (int) (30 - tiempoTrabajado);
	// int tiempoPorEdad = Calendar.getInstance().get(Calendar.YEAR) - edad;
	// int res = 0;
	//
	// switch (contrato) {
	//
	// case TEMPORAL:
	// tiempoParaJubilarse = (int) (tiempoParaJubilarse + (int) tiempoParaJubilarse
	// * 0.1);
	// res = tiempoPorEdad | tiempoParaJubilarse;
	// break;
	//
	// default:
	// res = tiempoPorEdad | tiempoParaJubilarse;
	// break;
	//
	// }
	//
	// return res; // Comprobar. Se Borraria de aquí y se implementaría en las
	// hijas.
	//
	// }

	public static TreeSet<Persona> grupoPersona(Persona... personas) {
		TreeSet<Persona> p = new TreeSet<Persona>();
		for (Persona a : personas) {
			p.add(a);
		}
		return p;

	}

	public List<Persona> miMetodo(Persona[] persona) {
		return Arrays.asList(persona);

	}

	public boolean isJubilarse() {
		return jubilarse;
	}

	public void setJubilarse(boolean jubilarse) {
		this.jubilarse = jubilarse;
	}
	


}

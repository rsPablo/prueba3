package prueba;

public class EmpleadoPublico extends Persona {

	// Atributos
	private String organismoPublico;
	private int numTrienio;

	// Constructores
	public EmpleadoPublico() {
		super();
	}

	public EmpleadoPublico(String nombre, String apellido, Integer edad, String dNI, int fechaInicio,
			TipoContrato contrato, boolean jubilarse) {
		super(nombre, apellido, edad, dNI, fechaInicio, contrato, jubilarse);
		// TODO Auto-generated constructor stub
	}
	
	public EmpleadoPublico(String nombre, String apellido, String dNI, Integer edad) {
		super(nombre, apellido, dNI, edad);
		// TODO Auto-generated constructor stub
	}
	

	// Metodos
	public String getOrganismoPublico() {
		return organismoPublico;
	}

	public void setOrganismoPublico(String organismoPublico) {
		this.organismoPublico = organismoPublico;
	}

	

	public int getNumTrienio() {
		return numTrienio;
	}

	public void setNumTrienio(int numTrienio) {
		this.numTrienio = numTrienio;
	}

	public int compareTo(EmpleadoPublico ep) {
		return this.numTrienio - ep.getNumTrienio();
	}

	// public String toString() {
	// return "EmpleadoPublico [organismoPublico=" + organismoPublico + ",
	// numTrienio=" + numTrienio + "]";
	// }

	public String imprimeHistorial() {
		String ih = this.getNombre() + this.getApellido();
		return ih;
	}

	public boolean puedeTrabajar(boolean... listaBooleans) {
		boolean resultado = true;
		bucleFalse: for (boolean b : listaBooleans) {
			if (!b || organismoPublico == null) {
				resultado = false;
				break bucleFalse;

			}

		}
		return resultado;

	}

}

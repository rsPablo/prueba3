package prueba;

public enum TipoContrato {

	INDEFINIDO(1.2,"Indifinido"), OBRA_Y_SERVICIO(1.0,"Obra y servicio"), TEMPORAL(1.0,"Temporal");
	
	
	
	private final double multiplicador;
	private final String nombre;
	
	private TipoContrato(double multiplicador, String nombre) {
		this.multiplicador = multiplicador;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public double getMultiplicador() {
		return multiplicador;
	}
	
	public Double getAño(int año) {
		return this.multiplicador*año;
	}
	
}

package prueba;

public interface Cotizable {

	public String imprimeHistorial();
	
	default boolean puedeTrabajar(boolean... listaBooleans) {
		boolean resultado = true;
		bucleFalse: for (boolean b : listaBooleans) {
			if (!b) {
				resultado = false;
				break bucleFalse;
			}
		}

		return resultado;
	}

	
	
	
}

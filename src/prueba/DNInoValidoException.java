package prueba;

import java.io.PrintStream;
import java.io.PrintWriter;

public class DNInoValidoException extends Exception {

	public DNInoValidoException() {
		super();
	}

	public String getMessage() {
		return "Formato DNI no valido";
	}

}

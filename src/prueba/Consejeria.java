package prueba;

import java.util.ArrayList;
import java.util.List;

public class Consejeria<T> {
	
	// Atributo
	private List<Puesto> puesto;
	
	//Constructor
	public Consejeria() {
		this.puesto = new ArrayList<>();
	}


	//Metodos
	public List<Puesto> getPuesto() {
		return puesto;
	}
	
	public void añadePuesto(Puesto p) {
		puesto.add(p);
	}

	public String buscaObjeto(Object o) {
		String s = "";
		for(Puesto p: puesto) {
			if(p.equals(o)) {
				s = p.getUbicacion();
			}
		}
		return s;		
	}
	
	
	

}

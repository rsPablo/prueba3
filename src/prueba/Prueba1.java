package prueba;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prueba1 {
	
	private static String HOME = "timelog.log";

	public static void main(String[] args) throws IOException {

		// String s = "Pablo Rod";
		//
		// System.out.println(s.indexOf("b"));
		//
		// System.out.println(s.substring(0,3));
		//
		// System.out.println(s.startsWith("P"));
		//
		// System.out.println(s.contains("ablo"));
		//
		// s.replace('b', 'c');
		// System.out.println(s);
		
		
		
		Path p = Paths.get(HOME);
		
		File file = p.toFile();
		
		System.out.println(Files.exists(p));
		
		
		//Comprobar permisos
		
		if(file.canRead() && file.canWrite()) {
			System.out.println("Permiso de lectura y escritura");
		}
		
		//Calcular número de entradas
		
		List<String> entradas = Files.readAllLines(p);
		System.out.println("Número de entradas: " + entradas.size());
		
		//Calcular numero de errores
		
		try(Stream<String> lineas = Files.lines(p)){
			
			System.out.println("Número de Errores: " + lineas.filter(l -> l.contains("(4") || l.contains("(5"))
				.count());
		}
		
		//Calcular dia más visitado
		
		Map<Object, List<String>> listaAgrupado = Files.readAllLines(p)
				.stream()
				.collect(Collectors.groupingBy(l->l.toString().substring(0, 10)));

		Object dias = listaAgrupado.keySet().stream().max((d1,d2) -> 
			Integer.compare(listaAgrupado.get(d1).size(), listaAgrupado.get(d2).size())).get();
		

		System.out.println("Dia con más consultas: " + dias + " | Número de consultas: " 
				+ listaAgrupado.get(dias).size());
		
		// Calcular la página mas solicitada

		Map<Object, List<String>> paginas = Files.readAllLines(p)
				.stream()
				.collect(Collectors.groupingBy(l-> l.split("\"")[1]));
		
		Object pag = paginas
				.keySet()
				.stream()
				.max((p1,p2) -> Integer.compare(paginas.get(p1).size(), paginas.get(p2).size()))
				.get();
		
		System.out.println("Página más visitada: " + pag + " | Número de veces que aparece: " 
				+ paginas.get(pag).size());
	

		LocalDate dia = LocalDate.of(2018, Month.MARCH, 6);
		
		
		
	}

}

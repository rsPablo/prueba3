package prueba;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaPersona {

	public static void main(String[] args) {
		List<EmpleadoPublico> list = new ArrayList<>();
		list.clear();

		// list.add(new Persona("Pablo", "Rodriguez", 25, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Jose", "Rodriguez", 46, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Antonio", "Rodriguez", 24, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Juanjo", "Rodriguez", 25, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Claudia", "Rodriguez", 58, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Abel", "Rodriguez", 41, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Gabriel", "Rodriguez", 28, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Carlos", "Rodriguez", 39, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Enrique", "Rodriguez", 36, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Fernando", "Rodriguez", 47, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Alberto", "Rodriguez", 52, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Maria", "Rodriguez", 43, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Laura", "Rodriguez", 75, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Cristina", "Rodriguez", 45, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));
		// list.add(new Persona("Judi", "Rodriguez", 35, "53283151V", 1995,
		// TipoContrato.INDEFINIDO));

		// Collections.sort(list);
		// System.out.println("-----------------------------------------------");
		// for(Persona p: list) {
		// System.out.println(p);
		// }

		// TreeSet<Persona> per = new TreeSet<Persona>();
		//
		// per = Persona.grupoPersona(list.get(0),list.get(1),list.get(2));
		//
		// for(Persona p: per) {
		// System.out.println(p+"\n");
		// }

		// System.out.println(list.get(0).getContrato().getAño(2018));

		// GestorPersonas.getInstance().getListaPersona().addAll(list);

		// System.out.println(GestorPersonas.getInstance().edadMediaPlantilla());

		// EmpleadoPublico ep = new EmpleadoPublico("Judi", "Rodriguez", 35,
		// "53283151V", 1995, TipoContrato.INDEFINIDO,"Funcionario",1);

		// System.out.println(ep);

		// No se puede usar el compareTo de la clase hija, ya que el padre tiene otra.
		// Collections.sort(GestorPersonas.getInstance().getListaPersona());
		// for (Persona p : GestorPersonas.getInstance().getListaPersona()) {
		// System.out.println(p);
		// }
		//
		// Persona p = new EmpleadoPublico();
		// EmpleadoPublico ep = new EmpleadoPublico();
		// Cotizable c = new EmpleadoPublico();

		EmpleadoPublico p1 = new EmpleadoPublico();
		p1.setNombre("Pablo");
		p1.setApellido("Alvarez");
		p1.setDNI("53283151V");
		p1.setEdad(25);
		p1.setContrato(TipoContrato.INDEFINIDO);
		p1.setFechaInicio(2000);
		p1.setOrganismoPublico("Sanidad");
		p1.setNumTrienio(2);
		p1.setJubilarse(false);
		// System.out.println(p1);

		EmpleadoPublico p2 = new EmpleadoPublico();
		p2.setNombre("Carlos");
		p2.setApellido("Blandon");
		p2.setDNI("53286475F");
		p2.setEdad(68);
		p2.setContrato(TipoContrato.OBRA_Y_SERVICIO);
		p1.setFechaInicio(2000);
		p2.setOrganismoPublico("Sanidad");
		p2.setNumTrienio(2);
		p2.setJubilarse(true);

		EmpleadoPublico p3 = new EmpleadoPublico();
		p3.setNombre("Maria");
		p3.setApellido("Cabrera");
		p3.setDNI("87586424S");
		p3.setEdad(15);
		p3.setContrato(TipoContrato.INDEFINIDO);
		p1.setFechaInicio(1900);
		p3.setOrganismoPublico("Gestion");
		p3.setNumTrienio(2);
		p3.setJubilarse(false);

		EmpleadoPublico p4 = new EmpleadoPublico();
		p4.setNombre("Jose");
		p4.setApellido("Rodriguez");
		p4.setDNI("87549524S");
		p4.setEdad(25);
		p4.setContrato(TipoContrato.INDEFINIDO);
		p4.setFechaInicio(2000);
		p4.setOrganismoPublico("Sanidad");
		p4.setNumTrienio(2);
		p4.setJubilarse(false);

		EmpleadoPublico p5 = new EmpleadoPublico();
		p5.setNombre("Angela");
		p5.setApellido("Anchez");
		p5.setDNI("87586485E");
		p5.setEdad(25);
		p5.setContrato(TipoContrato.INDEFINIDO);
		p5.setFechaInicio(2000);
		p5.setOrganismoPublico("Sanidad");
		p5.setNumTrienio(2);
		p5.setJubilarse(false);

		GestorPersonas gp = GestorPersonas.getInstance();

		// System.out.println(gp.getListaPersona());

		//
		// try {
		// gp.añadeEmpleado(p1);
		// gp.añadeEmpleado(p2);
		// } catch (DNIduplicadoException e) { // Comprobar en casa!
		// e.getMessage();
		// }

		// gp.print(p->p.getContrato() != TipoContrato.OBRA_Y_SERVICIO); //Lambda

		// gp.procesaPersona(p->true, p-> System.out.println(p));
		// gp.procesaPersona(p->p.getEdad()>40, p-> p.puedeJubilarse());
		// System.out.println("----------------------------------------");
		// gp.procesaPersona(p->true, p-> System.out.println(p));

		// List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		// myList.stream()
		// .filter(s -> s.startsWith("a"))
		// .map(String::toUpperCase)
		// .sorted()
		// .forEach(System.out::println);
		//
		// gp.getListaPersona().stream()
		// .filter(s-> s.getEdad()> 65)
		// .sorted()
		// .forEach(s -> s.setJubilarse(true));
		//
		// gp.procesaPersona(p->true, p->System.out.println(p));

		// double edadMedia = gp.getListaPersona().stream()
		// .mapToInt(e -> e.getEdad())
		// .average()
		// .getAsDouble();
		//
		// gp.getListaPersona().stream()
		// .filter(q -> q.getEdad() < edadMedia)
		// .collect(Collectors.toList())
		// .forEach(System.out::println);
		// List<Persona> pers = new ArrayList<>();
		//
		// pers = gp.filtrarPorEdadMedia(s -> s.getEdad() < gp.edadMedia());
		//
		// System.out.println(pers);

		// Supplier<Stream<Persona>> streamSupplier = () ->
		// gp.getListaPersona().stream().filter(s -> s.getEdad() > 65);
		//
		// streamSupplier.get().forEach(System.out::println);

		// gp.getListaPersona().stream().collect(Collectors.toSet()) // TreeSet, buscar;
		// .forEach(System.out::println);
		//
		// Set<Persona> pers =
		// gp.getListaPersona().stream().collect(Collectors.toSet());
		//
		// System.out.println(pers.size());
		// System.out.println(gp.getListaPersona().size());

		// Ordenar alfabeticamente(por hacer)

//		Map<Character, List<Persona>> personasPorApellido = gp.getListaPersona().stream()
//				.sorted(Comparator.comparing((Persona::getApellido)))
//				.collect(Collectors.groupingBy(n -> n.getApellido().charAt(0)));

		// personasPorApellido.forEach((letra,p) ->System.out.format("Letra %s:
		// %s\n",letra,p));

		// Collector<Persona, StringJoiner, String> personaDniCollector =
		// Collector.of(
		// () -> new StringJoiner(" , "),
		// (j,pe) -> {
		// try {
		// j.add(pe.getDNI());
		// } catch (DNInoValidoException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// },
		// (j1,j2) -> j1.merge(j2),
		// StringJoiner::toString);
		//
		//
		// personasPorApellido.forEach((letra,p) ->System.out.format("Letra %s:
		// %s\n",letra,p.stream().collect(personaDniCollector)));
		//
		//
		// Persona person = gp.getListaPersona()
		// .stream()
		// .filter(j -> j.isJubilarse() == false)
		// .reduce((per1, per2) -> per1.getEdad() > per2.getEdad() ? per1 : per2)
		// .get();

		// Usar FlatMap para transformar a las personas que se pueden jubilar en la
		// clase Jubilado
//
		for (int i = 0; i < 100 / 5; i++) {
			list.add(new EmpleadoPublico("Pablo", "Rodriguez", "53283151V", 34));
			list.add(new EmpleadoPublico("Jose", "Sanchez", "53283151V", 54));
			list.add(new EmpleadoPublico("Maria", "Alvarez", "53283151V", 34));
			list.add(new EmpleadoPublico("Angela", "Mei", "53283151V", 56));
			list.add(new EmpleadoPublico("Claudia", "Lopez", "53283151V", 21));
		}

		gp.getListaPersona().addAll(list);
//
//		long inicioProcesoStream = System.currentTimeMillis();
//
//		gp.getListaPersona()
//			.stream()
//			.sorted()
//			.filter(g -> g.getEdad() > 40).collect(Collectors.toList());
//		
//		long tiempoNoParalelo = System.currentTimeMillis() - inicioProcesoStream;
//
//		long inicioProcesoParalelo = System.currentTimeMillis();
//
//		gp.getListaPersona()
//			.parallelStream()
//			.sorted()
//			.filter(c -> c.getEdad() > 40).collect(Collectors.toList());
//		
//		long tiempoParalelo = System.currentTimeMillis() - inicioProcesoParalelo;
//
//		System.out.println("ms parallel: " + tiempoParalelo + "\n" + "ms no Parallel: " + tiempoNoParalelo);
		
		
//		Consejeria<Persona> consejeria = new Consejeria<>();
//		
//		int num = 0;
//		for(Persona p: list) {
//			consejeria.añadePuesto(p);
//		}
//		

		
		
		
	}

}

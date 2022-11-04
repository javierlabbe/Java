package cl.generation.f20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// HERENCIA
		
		//nacen a partir de datos repetidos entre objetos. (se hererda todo, atributos y metodos)
		//por ej. nombre, apellido y edad en objetos Entrenador, Kinesiologo y Basquetbolista.
		// se dejan en una sola clase y luego se comparten (ej. EquipoBasquetball)

		//Instancia de la clase Entrenador (instanciando objetos/clases hijas)
		Entrenador entrenador = new Entrenador ();
		entrenador.setNombre("Antonio");
		entrenador.setApellido("Conte");
		entrenador.setEdad(50);
		entrenador.setAniosExperiencia(10);
		entrenador.setEquipo("Valdivia");
		
		Entrenador entrenadorAyudante = new Entrenador ("Isra", "Palma",42,17,"Cohorte2"); //pasa los datos tanto al constructor propio como al padre

		System.out.println(entrenador.toString()); //para imprimir todos los atributos hay que marcarlos al importar el metodo toString
		System.out.println(entrenadorAyudante.toString());
		
		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEdad(52);
		kine.setTitulo("Kinesiologia");
		kine.setEspecialidad("En músculos");
		
		ArrayList<Basquetbolista> listaJugadores = new ArrayList <Basquetbolista>();
		
		Basquetbolista basque = new Basquetbolista();
		basque.setNombre("Michael");
		basque.setApellido("Pipen");
		basque.setAltura(2.15f);
		
		listaJugadores.add(basque); //agregando objeto a la lista //REVISAR ESTO
		
		Basquetbolista basque2 = new Basquetbolista();
		basque2.setNombre("Steve");
		basque2.setApellido("Curry");
		basque2.setAltura(2.05f);
		
		listaJugadores.add(basque2);
		
		//Recorrer lista
		for (Basquetbolista basquetbolista : listaJugadores) {
			System.out.println(basquetbolista.toString());
		}
		
		entrenador.metodoImprimir();
		kine.metodoImprimir();
		basque2.metodoImprimir();
		
		//Instancia de clase nieta
		//Se hereda desde la clase abuelo y padre. Asi suscesivamente.
		Ayudante ayudante = new Ayudante();
		
		ayudante.metodoImprimir();
		//ayudante.set se veran las herencias obtenidas desde EquipoBasquetball y Entrenador
		
	}

}

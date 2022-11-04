package cl.generation.f20221102Tarea;

import java.util.ArrayList;

import cl.generation.f20221102.Basquetbolista;

public class Main {

	public static void main(String[] args) {
		// Clase Main Escuela

		// Instancia objetos
		
		ArrayList<Estudiante> listaEstudiantes = new ArrayList <Estudiante>();
		
		Estudiante estudiante1 = new Estudiante();

		estudiante1.setNombre("Francisca");
		estudiante1.setApellido("Lazo");
		estudiante1.setCantidadMaterias(5);
		
		listaEstudiantes.add(estudiante1);

		Estudiante estudiante2 = new Estudiante();

		estudiante2.setNombre("Luis");
		estudiante2.setApellido("Serrano");
		estudiante2.setCantidadMaterias(4);
		
		listaEstudiantes.add(estudiante2);
		
		System.out.println(listaEstudiantes.toString());
		
		

	}

}

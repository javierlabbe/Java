package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		// 1. Definición de Set o HashSet
		// HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
		HashSet<String> grupo6 = new HashSet<String>();

		// 2. Agregar elemento al arreglo
		grupo6.add("Javier");
		grupo6.add("Fracisca");
		grupo6.add("Javier"); // no es agregado, está repetido
		grupo6.add("Julian");
		grupo6.add("Luis");
		grupo6.add("Rocio");
		System.out.println(grupo6);

		/*
		 * No agrega datos duplicados. 
		 * Agrega datos únicos. 
		 * Orden de ingreso aleatorio
		 */

		// 3. Verificar el contenido del arreglo
		boolean verificacionNombre = grupo6.contains("Javier");
		System.out.println(verificacionNombre);
		boolean verificacionNombre2 = grupo6.contains("Ignacio");
		System.out.println(verificacionNombre2);

		// 4. Como eliminar un elemento
		grupo6.remove("Luis"); // elimina elemento por contenido
		System.out.println(grupo6);

		// 5. Tamaño del arreglo
		System.out.println("tamaño del arreglo: " + grupo6.size());

		System.out.println("************************************");
		// 6. Recorrer el arreglo
		// for iterador de objetos
		for (String integrante : grupo6) {
			System.out.println("Nombre integrante: " + integrante);
		}
		
	}

}

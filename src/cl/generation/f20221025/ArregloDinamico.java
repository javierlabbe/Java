package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		// ArrayList

		// 1. Definicion
		// ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();
		ArrayList<String> grupo6 = new ArrayList<String>();
		// cmd + shift + o : para importar todas las dependencias de forma rápida

		// 2. Agregar valores al arreglo
		grupo6.add("Javier");
		grupo6.add("Fracisca");
		grupo6.add("Rocio");
		grupo6.add("Julian");
		grupo6.add("Luis");
		grupo6.add(2, "Borrar");

		System.out.println(grupo6);

		// 3. Tamaño del arraylist
		System.out.println(grupo6.size()); // length: para arreglo estático * size: para arreglo dinamico

		// 4. Obtener un elemento dentro del arreglo
		System.out.println(grupo6.get(0));
		// System.out.println(grupo6.get(9)); LANZARA ERROR POR ESTAR FUERA DE INDICE

		// 5. Eliminar un elemento dentro del array
		System.out.println(grupo6.remove(2)); // con el remove elimina el dato y los datos se desplazan hacia la
												// posición 0.
		System.out.println(grupo6);

		// 6. Recorrer el ArrayList;
		for (int i = 0; i < grupo6.size(); i++) {
			System.out.println("Integrante: " + grupo6.get(i));
		}
		System.out.println("***********************");
		// for iterador o for de objeto
		for (String integrante : grupo6) {
			System.out.println("Integrante: " + integrante);
		}

	}

}

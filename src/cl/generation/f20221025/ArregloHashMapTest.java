package cl.generation.f20221025;

import java.util.HashMap;

public class ArregloHashMapTest {

	public static void main(String[] args) {
		// 1. Definición de HashMap
		// Llave, valor (key, value)

		HashMap<Integer, String> relatores = new HashMap<Integer, String>();

		// 2. Agregar valores al map
		// No sigue orden de ingreso, es aleatorio

		relatores.put(11, "Alejandro");
		relatores.put(2, "Andrea");
		relatores.put(33, "Laura");
		relatores.put(4, "Pamela");
		relatores.put(4, "Pamela"); // Se vuelve a sobre escribir. Coincidentemente con el mismo value para este caso.
		relatores.put(11, "Israel"); // Como existe la clave, Sobre escribe el valor.
		
		System.out.println("map " + relatores);
		
		//3. Tamaño del map
		System.out.println(relatores.size());
		
		//4. Acceder a un dato a traves de la clave
		System.out.println(relatores.get(33)); //Laura
		
		//5. Eliminar un par de datos (tupla)
		relatores.remove(11);
		System.out.println("map " + relatores);
		
		//6. Cómo recorremos un mapa
		/* for (Map.Entry<keyType, valType> entry : map.entrySet()) {
			keyType key = entry.getKey();
			valType val = entry.getValue();
	
		}
		*/
		for(Integer clave : relatores.keySet()) {
			System.out.println("clave "+clave+" valor " +relatores.get(clave)); 
		}
		
	}

}

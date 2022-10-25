package cl.generation.f20221025;

import java.util.HashMap;

public class TareaHashMap {

	public static void main(String[] args) {
		// 1. Definición de HashMap
		// HashMap<TIPODATO, Object> nombre_array = new HashMap<TIPODATO, Object>();
		HashMap<String, String> datos = new HashMap<String, String>();

		// 2. Agregar elementos al arreglo
		datos.put("Nombre", "Javier");
		datos.put("Apellido", "Labbé");
		datos.put("Comuna", "Maipú");
		datos.put("Pais", "Chile");
		System.out.println(datos);

		// 3. Obtener elemento del arreglo
		System.out.println(datos.get("Nombre"));

		// 4. Como eliminar un elemento
		datos.remove("Comuna");
		System.out.println(datos);

		// 5. Tamaño del arreglo
		System.out.println(datos.size());

		// 6. Recorrer el array

		// Recorrer Keys
		for (String keys : datos.keySet()) {
			System.out.println("Key: " + keys);
		}
		// Recorrer Values
		for (String values : datos.values()) {
			System.out.println("Value: " + values);
		}

		// 7. Verificar elemento en arreglo

		// Verificar llave
		System.out.println(datos.containsKey("Nombre"));

		// Verificar llave
		System.out.println(datos.containsValue("Javier"));

	}

}

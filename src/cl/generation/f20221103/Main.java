package cl.generation.f20221103;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Objetos de colaboracion
		
		/*
		 * Para agregar mas de un dato podriamos hacer esto, pero no es optimo:
		 * ArrayList<String> arrayTelefonos = new ArrayList<String>();
		 * arrayTelefonos.add("8289894"); arrayTelefonos.add("256125655");
		 * arrayTelefonos.add("787998489"); usuario.setTelefono(arrayTelefonos);
		 * System.out.println(usuario.getTelefono());
		 */
		
		//Mejor hacer esto:
		//Antes de inicializar el array en el constructor vacio
		/*
		 * Usuario usuario = new Usuario(); usuario.getTelefono().add("87998715");
		 * usuario.getTelefono().add("87878777");
		 * System.out.println(usuario.getTelefono());
		 */
		//Tira Error nullPointerException porque no hay espacio de memoria asignado al array que se esta agregando el dato
		// no se esta inicializando el arraylist declarado en Usuario (linea 11 de Usuario.java) inicializar es ademas = new Arraylist<String>();
		//Para que funcione lo anterior inicializar la variable en constructor. (Linea 16 de Usuario.java)
		
		Usuario usuario = new Usuario();
		usuario.getTelefono().add("87998715");
		usuario.getTelefono().add("87878777");
		System.out.println(usuario.getTelefono());
		
		//usuario.setDireccion("arica 12345, maipu, santiago"); //esto funciona pero no es optimo
															  //mejor crear un objeto de colaboracion para poder filtrar por region, ciudad, etc.
		
		Direccion direccion = new Direccion(); //se puede inicializar dentro del constructor como se hizo con el array, ya que es un codigo mas limpio
		direccion.setCalle("Arica");
		direccion.setNumero("1891");
		direccion.setCiudad("Santiago");
		direccion.setRegion("RM");
		usuario.setDireccion(direccion);
		System.out.println(usuario.getDireccion().toString());
		
		
	}

}

package cl.generation.f20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		// Interfaces y clases abstractas
		
		//En Clase abtracta solo se definen los metodos que luego serán implementados donde heredemos la clase padre.
		
		//Animal animal = new Animal(); -> NO se pueden instanciar clases abstractas
		
		Caballo caballo = new Caballo ();
		caballo.setAltura(2.5f);
		
		Humano humano = new Humano();
		humano.metodoEnAnimal();
		
		Leon leon = new Leon();
		leon.setAltura(1.80f);
		leon.setPeso(200f);
		leon.metodoEnAnimal();
		System.out.println(leon.toString());
		
		Persona persona = new Persona();
		

	}

}

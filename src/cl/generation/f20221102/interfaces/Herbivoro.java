package cl.generation.f20221102.interfaces;

public class Herbivoro extends Animal{

	@Override
	public void metodoEnAnimal() {
		// Cuando extendemos de un metodo abstracto, es obligación llamar a los métodos
		// cuando se trabaja con clases abstractas, si no hay metodos que implementar no tira error.
		
		System.out.println("Metodo  animal en herbivoro");
	}

}

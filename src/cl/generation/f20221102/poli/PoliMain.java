package cl.generation.f20221102.poli;

public class PoliMain {

	public static void main(String[] args) {
		// Polimorfismo 
		
		//Instancai de las clases
		Mascota mascota = new Mascota();
		mascota.emitirSonido();
		
		Perro ayun = new Perro();
		ayun.emitirSonido();
		
		Gato tom = new Gato();
		tom.emitirSonido();
		
		/*************** Polimorfismo **********************/
		
		//Una super clase se comporta como una clase hija, pero no es la clase hija.
		/*para que exista polimorfismo:
		 *1. debe existir herencia. Jerarquia de clases
		 */
		
		//como Perro y Gato heredan desde Mascota, se puede hacer lo siguiente.
		
		Mascota regalon = new Perro(); //se comporta como perro pero no es un perro.
		regalon.emitirSonido();
		regalon.setNombre("Zoe");
		//regalon.set solo permitira agregar atributos del PADRE, no se puede acceder a las del hijo
		//se puede ir al metodo del hijo, pero no atributos
		System.out.println();
		
		Mascota michi = new Gato();
		michi.emitirSonido();
		
		/*Polimorfismo parametrico
		 * el metodo se escribe igual pero recibe distintos parametros*/
		michi.horasSiesta(16.5f);
		
		//Perro dog = new Mascota();
		Perro dog = (Perro) regalon; //regalon se trabajo como mascota y se castea como perro
		
		/*Polimorfismo de inclusión
		 * habilidad para redefinir por completo el método de una superclase en una subclase
		 * En él, una subclase define un método que existe en una superclase con una lista de argumentos*/
		
		
		
		
	}

}

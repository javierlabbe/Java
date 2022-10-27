package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// Instancia de clase (referencia a un objeto)
		
		//creando variable auto1 tipo Auto (instanciando auto1 sin saber cuales son sus valores, por eso se usa constructor vacio)
		//Auto() es el constructor
		Auto auto1 = new Auto(); //al estar en el mismo package del main no hay que importar Auto. 
		//auto1.marca = "Nissan"; //error porque marca es privada
		auto1.text = "asdasd"; //text es atributo publico por eso se puede
		
		//Asignar valores a atributos privados
		//solo a traves del método setter
		auto1.setColor("Rojo"); //unica forma de asignar valor al atributo privado
		auto1.setMarca("Nissan");
		auto1.setCilindrada(1.6F);

		//Consultar un atributo puntual
		System.out.println(auto1.getColor());
		
		//Saber el contenido de los atributos
		System.out.println(auto1.toString());
		
		//nueva instancia de auto
		Auto car = new Auto("Nissan","Negro","Qashqai",1.6f,10.0f,240f);
		System.out.println(car.getModelo());
		
		System.out.println(car.toString());
		System.out.println(car);

	}

}

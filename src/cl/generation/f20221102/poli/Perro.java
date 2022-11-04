package cl.generation.f20221102.poli;

public class Perro extends Mascota{
	
	private String sonido;

	public Perro() {
		super();
	}

	public Perro(String raza, String nombre, String sexo) { //Pero no agrega atributo sonido
		super(raza, nombre, sexo);
	}
	
	
	public Perro(String sonido) {
		super();
		this.sonido = sonido;
	}
	

	public Perro(String raza, String nombre, String sexo, String sonido) {
		super(raza, nombre, sexo);
		this.sonido = sonido;
	}

	//Get & Set
	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	
	/*
	 * @Override public String toString() { return "Perro [sonido=" + sonido + "]";
	 * }
	 */

	@Override
	public void emitirSonido() {
		System.out.println(" el sonido (ladrido) es GuauGuau");
	}
	
	
	
}

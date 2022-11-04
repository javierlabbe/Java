package cl.generation.f20221102.poli;

public class Mascota {
	//Atributo
	private String raza;
	private String nombre;
	private String sexo;
	//Constructores
	public Mascota() {
		super();
	}
	public Mascota(String raza, String nombre, String sexo) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	//getters and setters
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	//metodos
	@Override
	public String toString() {
		return "Mascota [raza=" + raza + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}
	
	public void emitirSonido() {
		System.out.println(" el sonido es ...");
	}
	
	
	//polimorfismo paramétrico
	//SOBRE CARGA DEL MÉTODO
	public void horasSiesta() {
		System.out.println("La mascota no duerme");
	}
	
	public void horasSiesta(int horas) {
		System.out.println("La mascota duerme "+horas+" horas");
	}
	
	public void horasSiesta(float horas) {
		System.out.println("La mascota duerme "+horas+" horas");
	}
	
}

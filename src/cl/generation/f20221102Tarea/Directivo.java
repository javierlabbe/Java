package cl.generation.f20221102Tarea;

public class Directivo extends DatosPersonas{
	private String cargo;

	public Directivo() {
		super();
	}

	public Directivo(String cargo) {
		super();
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Directivo [cargo=" + cargo + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getEdad()=" + getEdad() + ", getRut()=" + getRut() + "]";
	}
	
	
}

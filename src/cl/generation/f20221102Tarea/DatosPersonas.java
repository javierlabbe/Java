package cl.generation.f20221102Tarea;

public class DatosPersonas {
	private String nombre;
	private String apellido;
	private int edad;
	private String rut;
	
	//constructor vacio
	public DatosPersonas() {
		super();
	}
	//Constructor con atributos

	public DatosPersonas(String nombre, String apellido, int edad, String rut) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
	}
	//Getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	//Metodos

	@Override
	public String toString() {
		return "Escuela [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", rut=" + rut + "]";
	}
	
	
}

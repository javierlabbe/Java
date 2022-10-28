package cl.generation.f20221028;

public class Estudiante {
	// atributos
	private String nombre;
	private String apellido;
	private Integer edad;
	private String rut;
	private String curso;//1
	private String correo;
	// constructores
	public Estudiante() { //constructor vacio: por si se da el caso que no tuviese ningun dato del estudiante
		super();
	}
	
	public Estudiante(String nombre, String apellido, Integer edad, String rut, String curso, String correo) { //constructor con todos los parametros: para crearlo solicita todos
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
		this.curso = curso;
		this.correo = correo;
	}

	public Estudiante(String nombre, String apellido, String rut) { //constructor con algunos parametros: solo solicita algunos de todos los atributos. no arrojaria error.
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
	}

	public Estudiante(String nombre, String apellido) { //Si se hubiese agregado otro parametro string distinto a rut arroja error porque no se puede diferenciar del constructor pasado
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	// getters y setters

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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	// metodos

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", rut=" + rut
				+ ", curso=" + curso + ", correo=" + correo + "]";
	}
	
}

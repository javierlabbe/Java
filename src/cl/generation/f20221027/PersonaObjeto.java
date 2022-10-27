package cl.generation.f20221027;

public class PersonaObjeto {
	//ATRIBUTOS
	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private String mail;
	private Integer telefono;
	private Integer edad;
	private String direccion;
	private String nacionalidad;
	
	//CONSTRUCTOR
	
	public PersonaObjeto() {
		super();
	}

	public PersonaObjeto(String nombre, String apePaterno, String apeMaterno, String mail, Integer telefono,
			Integer edad, String direccion, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.mail = mail;
		this.telefono = telefono;
		this.edad = edad;
		this.direccion = direccion;
		this.nacionalidad = nacionalidad;
	}
	
	//GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	//MÉTODOS

	@Override
	public String toString() {
		return "PersonaObjeto [nombre=" + nombre + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno
				+ ", mail=" + mail + ", telefono=" + telefono + ", edad=" + edad + ", direccion=" + direccion
				+ ", nacionalidad=" + nacionalidad + "]";
	}
	
}

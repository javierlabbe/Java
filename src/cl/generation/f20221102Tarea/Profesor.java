package cl.generation.f20221102Tarea;

public class Profesor extends DatosPersonas{
	private String asignatura;
	private String cursoJefatura;
	
	public Profesor() {
		super();
	}

	public Profesor(String asignatura, String cursoJefatura) {
		super();
		this.asignatura = asignatura;
		this.cursoJefatura = cursoJefatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getCursoJefatura() {
		return cursoJefatura;
	}

	public void setCursoJefatura(String cursoJefatura) {
		this.cursoJefatura = cursoJefatura;
	}

	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", cursoJefatura=" + cursoJefatura + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", getRut()="
				+ getRut() + "]";
	}
	
	
	

}

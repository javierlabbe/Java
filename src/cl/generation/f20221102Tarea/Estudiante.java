package cl.generation.f20221102Tarea;

public class Estudiante extends DatosPersonas{
	private String curso;
	private Float promedioFinal;
	private int cantidadMaterias;
	
	//Constructor vacio
	public Estudiante() {
		super();
	}
	
	//Constructor con parámetros
	public Estudiante(String curso, Float promedioFinal, int cantidadMaterias) {
		super();
		this.curso = curso;
		this.promedioFinal = promedioFinal;
		this.cantidadMaterias = cantidadMaterias;
	}

	//Getters and Setters
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Float getPromedioFinal() {
		return promedioFinal;
	}

	public void setPromedioFinal(Float promedioFinal) {
		this.promedioFinal = promedioFinal;
	}

	public int getCantidadMaterias() {
		return cantidadMaterias;
	}

	public void setCantidadMaterias(int cantidadMaterias) {
		this.cantidadMaterias = cantidadMaterias;
	}
	//Metodos

	@Override
	public String toString() {
		return "Estudiante [curso=" + curso + ", promedioFinal=" + promedioFinal + ", cantidadMaterias="
				+ cantidadMaterias + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getEdad()=" + getEdad() + ", getRut()=" + getRut() + "]";
	}
	
	
	
	
	
}

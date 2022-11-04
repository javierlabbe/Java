package cl.generation.f20221102;

public class Entrenador extends EquipoBasquetball{ //extends palabra reservada para extender (estamos heredando)
													// Entrenador está extendiendo EquipoBasquetball
	
//	private String nombre;
//	private String apellido;
//	private int edad;
	private int aniosExperiencia;
	private String equipo;
	public Entrenador() {
		super();
	}
	public Entrenador(int aniosExperiencia, String equipo) {
		super(); //NO ES NECESARIO DECLARARLO VACIO, SE DECLARA COMO EL SIGUIENTE
		this.aniosExperiencia = aniosExperiencia;
		this.equipo = equipo;
	}
	
	public Entrenador(String nombre, String apellido, int edad, int aniosExperiencia, String equipo) {
		super(nombre, apellido, edad); //al seleccionar en opcion super, pasa al constructor padre nombre, apellido, edad
										//es necesario para llamar al constructor con parámetros en el Main
		this.aniosExperiencia = aniosExperiencia;
		this.equipo = equipo;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	//si no se establece el metodo toString en el Main llamara al toString de la clase padre
	
	@Override 
	public String toString() { //el toString es una ayuda para el que codifica
		return "Entrenador [aniosExperiencia=" + aniosExperiencia + ", equipo=" + equipo + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
	
	
	@Override //ya que el metodo existe en la clase padre, se debe sobreescribir con el de la clase hija si se esta definiendo aqui 
	public void metodoImprimir() {
	 System.out.println("estoy en el método de la clase hija entrenador"); 
	}
	 

}

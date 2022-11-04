package cl.generation.f20221102;

public class Kinesiologo extends EquipoBasquetball {
	
//	private String nombre;
//	private String apellido;
//	private int edad;
	private String titulo;
	private String especialidad;
	public Kinesiologo() {
		super();
	}
	public Kinesiologo(String titulo, String especialidad) {
		super();
		this.titulo = titulo;
		this.especialidad = especialidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	//sobre escribiendo metodo
	
	@Override //ya que el metodo existe en la clase padre, se debe sobreescribir con el de la clase hija si se esta definiendo aqui
	public void metodoImprimir() {
		System.out.println("estoy en el método de la clase hija kinesiologo");
	}
}

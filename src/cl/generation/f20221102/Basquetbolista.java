package cl.generation.f20221102;

public class Basquetbolista extends EquipoBasquetball{
	
//	private String nombre;
//	private String apellido;
//	private int edad;
	private Float peso;
	private Float altura;
	public Basquetbolista() {
		super();
	}
	public Basquetbolista(Float peso, Float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	
	@Override
	public void metodoImprimir() {
		System.out.println("estoy en el método de la clase hija basquetbolista");
	}

}

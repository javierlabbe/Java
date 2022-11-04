package cl.generation.f20221102.interfaces;

public class Persona extends Humano{
	
	//atributos heredados
	/*
	 * Altura
	 * Peso
	 * Razonamiento
	 * **/
	
	/*Metodos heredados
	 * metodoEnAnimal
	 * respirar
	 * comer 
	 * */
	
	private String dni;

	public Persona() {
		super();
	}
	
	

	public Persona(String dni) {
		super();
		this.dni = dni;
	}



	public Persona(boolean razonamiento, String dni) {
		super(razonamiento);
		this.dni = dni;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
}

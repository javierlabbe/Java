package cl.generation.f20221102.interfaces;

public abstract class Animal {
	private float peso;
	private float altura;
	
	//constructores
	public Animal() {
		super();
	}

	public Animal(float peso, float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	//getters and setters
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	//metodos
	
	/*
	 * public void metodoEnAnimal() {
	 * System.out.println("Estoy en el método de animal"); } //el syso es una implementación de una acción dentro del metodo 
	 * 															implementacion implica {} llaves
	 */
	
	public abstract void metodoEnAnimal(); //definición del metodo

	
	/*
	 * NOTA: Las clases abstractas no se pueden instanciar  */
	
	
}

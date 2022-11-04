package cl.generation.f20221102.interfaces;

public class Humano extends Omnivoro implements Generico{
	private boolean razonamiento;
	
	//Constructores
	public Humano() {
		super();
	}

	public Humano(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}
	
	//getters and setters
	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	//Metodos de generico que no se habian implementado
	/*implements VS extends:
	 * implements solo para implementar metodos genericos
	 * extends es para heredar metodos definidos y atributos */
	
	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		System.out.println("el humano come de todo");
		
	}
	
	
	
}

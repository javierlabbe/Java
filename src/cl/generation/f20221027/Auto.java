package cl.generation.f20221027;

public class Auto { //ESTE ES EL OBJETO
//Orden propuesto por literatura:
	//Atributo, contructor, getter and setter, metodos
	
//ATRIBUTOS
	private String marca; //"Nissan". String porque se define el tipo de dato para este atributo 
							//private porque los atributos son PROPIOS DEL OBJETO
	private String color; //"negro"
	private String modelo;//ñuñuki"
	private Float cilindrada; // 1.6 (cc)
	private Float rendimiento; // 10.6 (km/l)
	private Float velocidad; // km/h
	public String text; //no necesita getter y setter al ser publica
	
	//CONSTRUCTOR
	//nos permite instanciar al objeto
	//nos permite inicializar los atributos
	
	public Auto() { //el constructor vacio se hace porque no sabemos que agregaremos como variables.
		super();
	}

	public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento, Float velocidad) {
		super();
		this.marca = marca; //this indica "el atributo de este objeto" es decir "el atributo de marca
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	}


	//Getters y Setters (accesador y mutador) get: obtener/acceder al valor del atributo set: mutar/cambiar
		//click derecho, soruces, generate getters and setters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Float getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(Float rendimiento) {
		this.rendimiento = rendimiento;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}
	
	//metodos del objeto(acciones)
	
	public void avanzar() { //metodo escrito a mano
		System.out.println("Estoy en el metodo avanzar del objeto");
	}

	@Override //override indica que se esta dando otro uso a un metodo que no pierde la esencia.
	public String toString() { //click derecho, source, generte to string, generar (heredando metodo toString)
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", rendimiento=" + rendimiento + ", velocidad=" + velocidad + "]";
	}
	
	
}

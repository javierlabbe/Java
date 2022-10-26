package cl.generation.f20221026;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// FUNCIONES o Metodos
		// Metodo Main para gatillar el llamado a otras funciones. Es la clase principal.

		// LLamado de un metodo
		nombreMetodo();
		metodo2("Javier");
		metodo3(1);
		metodo4(1, 4.3F);

		String[] arr = { "1", "2", "3" };
		metodo5(arr); // no acepta arreglos sin definir

		// retorno1(); no hace nada con el retorno
		System.out.println(retorno1() + 1); // esto no es optimo, mejor capturar el dato en una variable para
											// utilizarlo.
											// Se ocupa memoria y tiempo de ejecución.
		Integer valorRetornado = retorno1(); // variable Integer que se le asigna el valor de retorno de la función
		System.out.println(valorRetornado + 35); // 35+35 = 70

		String nombreRetornado = obtenerNombreCompleto("Javier", "Labbé", "Soto");
		System.out.println("El nombre completo es: "+nombreRetornado);
		
		llamadaAOtroMetodo();

	}

	// 1. Definicion o estructura de un metodo.

	// public nos permite acceder desde cualquier parte en el codigo java
	// Static nos permite acceder al metodo sin necesidad de instancear
	// Crear una instancia nos permite asignar un espacio de memoria, no necesitamos un "new"
	// void -> el método no retorna ningun valor

	public static void nombreMetodo() {
		System.out.println("Estoy dentro del metodo inicial"); //No recibe parámetro, no retorna mada
	}

	public static void metodo2(String nombre) { //Recibe parámetro, no retorna nada.
		System.out.println("Hola soy " + nombre);
	}

	public static void metodo3(Integer numero) {
		System.out.println("Soy el numero " + numero);
	}

	public static void metodo4(Integer numero1, Float numero2) {
		System.out.println("Soy el Integer " + numero1);
		System.out.println("Soy el Float " + numero2);
	}

	public static void metodo5(String[] arreglito) {
		System.out.println("Soy arreglo " + Arrays.toString(arreglito));
	}

	// FUNCIONES CON RETORNO

	/*
	 * public static TIPODATO_A_RETORNAR retorno1() { return dato_a_retornar; }
	 */

	public static Integer retorno1() { //No recibe parámetro, retorna algo
		Integer totalAlumnos = 35;
		return totalAlumnos;
	}

	//El /** es para hacer un javadoc, nos ayuda a comentar métodos.
	
	/**
	 * Metodo que une todos los datos
	 * 
	 * @param nombre
	 * @param apePaterno
	 * @param apeMaterno
	 * @return nombreCompleto
	 */
	public static String obtenerNombreCompleto(String nombre, String apePaterno, String apeMaterno) { //Recibe parametro, retorna algo
		String nombreCompleto = nombre + " " + apePaterno + " " + apeMaterno;
		return nombreCompleto; // retornamos el contenido de la variable
	}

	//METODO QUE LLAMA A OTRO METODO
	
	public static void llamadaAOtroMetodo() {
		System.out.println("Llamada a otro metodo desde un metodo");
		metodo4(1234,3.5F);
	}

}

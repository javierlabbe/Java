package cl.generation.f20221025;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// FUNCIONES o Metodos
		//Metodo Main para gatillar el llamado a otras funciones
		
		//LLamado de un metodo
		nombreMetodo();
		metodo2("Javier");
		metodo3(1);
		metodo4(1,4.3F);
		
		String[] arr = {"1","2","3"};
		metodo5(arr); //no acepta arreglos sin definir

	}
	//1. Definicion o estructura de un metodo.
	
		//public nos permite acceder desde cualquier parte en el codigo java
		//Static nos permite acceder al metodo sin necesidad de instancear
		//Crear una instancia nos permite asignar un espacio de memoria, no necesitamos un "new" 	
		//void -> el método no retorna ningun valor

	public static void nombreMetodo() {
		System.out.println("Estoy dentro del metodo inicial");
	} 
	
	public static void metodo2(String nombre) {
		System.out.println("Hola soy "+ nombre);
	} 
	
	public static void metodo3(Integer numero) {
		System.out.println("Soy el numero "+ numero);
	} 
	
	public static void metodo4(Integer numero1, Float numero2) {
		System.out.println("Soy el Integer "+ numero1);
		System.out.println("Soy el Float "+ numero2);
	}
	
	public static void metodo5(String[] arreglito) {
		System.out.println("Soy arreglo "+ Arrays.toString(arreglito));
	}

	
}

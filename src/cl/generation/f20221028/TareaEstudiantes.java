package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class TareaEstudiantes {

	public static void main(String[] args) {
		// Tarea Estudiantes
		agregarEstudiante();
	}

	// METODOS

	public static String crearEstudiante() {
		Scanner scanner = new Scanner(System.in); // Capturar datos ingresados por el usuario
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese edad: ");
		Integer edad = scanner.nextInt();
		System.out.println("Ingrese rut: ");
		String rut = scanner.next();
		System.out.println("Ingrese curso: ");
		String curso = scanner.next();
		System.out.println("Ingrese correo: ");
		String correo = scanner.next();

		Estudiante estudiante = new Estudiante(nombre, apellido, edad, rut, curso, correo);
		return estudiante.toString();

	}

	public static void agregarEstudiante() {
		Scanner scanner = new Scanner(System.in); // Capturar datos ingresados por el usuario
		ArrayList<String> listaEstudiantes = new ArrayList<String>(); // arreglo que contiene estudiantes //NOTA: se puede poner tipo de dato Estudiante
		int opcion = 0; // buena practica definir variables arriba
		int contadorErrores = 4;



		// Captura y Validación de datos menu
		do {
			System.out.println("**************************\n");
			System.out.println("* LISTA ESTUDIANTES\n");
			System.out.println("**************************\n");
			System.out.println("*          Menú          *\n");
			System.out.println("1. Agregar estudiante");
			System.out.println("0. SALIR\n");
			System.out.println("**************************\n");
			System.out.println("Selecciona una opción: ");
			opcion = scanner.nextInt();
			System.out.println("\n");
			if (opcion == 1) {
				listaEstudiantes.add(crearEstudiante());
			}
			if (opcion != 1) {
				System.out.println("Usted ha salido del programa");
				scanner.close();
				break; // provoca la salida del if y del do while.
			}

		} while (opcion == 1);
		
		System.out.println(listaEstudiantes);
	}

}

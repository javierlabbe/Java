package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class TareaEstudiantes {

	public static void main(String[] args) {
		// Tarea Estudiantes
		agregarEstudiante();
	}

	// METODOS
	public static Estudiante crearEstudiante() { /* antes retornaba string */
		Scanner scanner = new Scanner(System.in); // Capturar datos ingresados por el usuario
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese apellido: ");
		String apellido = scanner.nextLine();
		System.out.println("Ingrese edad: ");
		Integer edad = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese rut: ");
		String rut = scanner.nextLine();
		System.out.println("Ingrese curso: ");
		String curso = scanner.nextLine();
		System.out.println("Ingrese correo: ");
		String correo = scanner.nextLine();

		Estudiante estudiante = new Estudiante(nombre, apellido, edad, rut, curso, correo);
		// return estudiante.toString();
		return estudiante;

	}

	public static void agregarEstudiante() {
		Scanner scanner = new Scanner(System.in); // Capturar datos ingresados por el usuario
		ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>(); // arreglo que contiene estudiantes																				
		int opcion = 0; // buena practica definir variables arriba
		int contadorIntentos = 3;

		System.out.println("**************************\n");
		System.out.println("* LISTA ESTUDIANTES\n");
		System.out.println("**************************\n");
		System.out.println("*          Menú          *\n");
		System.out.println("1. Agregar estudiante");
		System.out.println("0. SALIR\n");
		System.out.println("************************** \n");
		System.out.println("Selecciona una opción: ");

		// Captura y Validación de datos menu
		do {
			opcion = scanner.nextInt();
			if (opcion == 1) {
				listaEstudiantes.add(crearEstudiante());
				System.out.println("*¿Desea añadir otro estudiante?*\n");
				System.out.println("1. SI     0. NO \n");

			} else if (opcion == 0) {
				System.out.println("Usted ha s" + "alido del programa");
				break; // provoca la salida del if y del do while.
			} else if (contadorIntentos > 1) {
				contadorIntentos--;

				System.out.println("\nError. Opción ingresada no es válida.\n");
				System.out.println(contadorIntentos + " intentos restantes. \nIngrese opción nuevamente: ");

				System.out.println("1. Agregar estudiante");
				System.out.println("0. SALIR\n");

				System.out.println("**************************\n");

			} else {
				contadorIntentos--;
				System.out.println("Número de intentos alcanzado.\n");
				System.out.println("Intente nuevamente en 5 minutos.");
			}

		} while (opcion == 1 || opcion != 0 && contadorIntentos > 0);

		scanner.close();
		System.out.println(listaEstudiantes);
	}

}

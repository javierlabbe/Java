package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		menu();

		// Menu de opciones
		// Calculadora con 4 operaciones basicas
		// Solicitar 2 numeros (float) y capturarlos
		// imprimir los resultados y guardar en variable
		// ofrecer opciones de repiticion (bucles) (LISTO)
		// definir metodos
		// validaciones
		// terminar la ejecucion (LISTO)
		// limpiar las variables

	}

	public static void menu() {
		System.out.println("**************************");
		System.out.println("*          Menú          *.");
		System.out.println("**************************\n");
		System.out.println("Escoja operación deseada:");
		System.out.println("1. SUMAR");
		System.out.println("2. RESTAR");
		System.out.println("3. MULTIPLICAR");
		System.out.println("4. DIVIDIR");
		System.out.println("0. SALIR");

		System.out.println("**************************\n");

		Scanner scanner = new Scanner(System.in); // Capturar datos ingresados por el usuario
		int opcion = 0; // buena practica definir variables arriba
		int contadorErrores = 4;

		// Captura y Validación de datos menu
		do {
			System.out.println("* Selecciona una opción *");
			opcion = scanner.nextInt();

			if (opcion == 0) { // si la opcion es 0 salir del Do While
				System.out.println("Usted ha salido del programa");
				break; //provoca la salida del if y del do while.
			}

			else if (opcion < 0 || opcion > 4) { // condicion de error
				contadorErrores--;
				System.out.println(contadorErrores + " intentos restantes");
			}
			if (contadorErrores == 0) { // ANALIZAR QUE PASA CON 0
				System.out.println("Cantidad de intentos superados");
				break;
			}

		} while (opcion < 0 || opcion > 4);

		if (opcion == 0 || contadorErrores == 0) {
			System.out.println("adios.");
		} else {// entra al else si selecciona opciones 1, 2 ,3 o 4
			// Solicitar numeros
			System.out.println("Ingrese el primer número: ");
			float numero1 = scanner.nextFloat();
			System.out.println("Ingrese el segundo número: ");
			float numero2 = scanner.nextFloat();

			float resultado = 0f;

			switch (opcion) {// se usa cuando se saben los casos fijos a trabajar
			case 1:// SUMAR
				resultado = numero1 + numero2;
				System.out.println("El resultado es: " + resultado);
				break;
			case 2:// RESTA
				resultado = numero1 - numero2;
				System.out.println("El resultado es: " + resultado);
				break;
			case 3:// MULTIPLICACION
				resultado = numero1 * numero2;
				System.out.println("El resultado es: " + resultado);
				break;
			case 4:// DIVISION (CONTINUAR)
				if (numero2 == 0) {
					System.out.println("Divisor debe ser distinto de cero");
					System.out.println("Ingrese nuevamente el número 2: ");
					do {
						numero2 = scanner.nextFloat();
					} while (numero2 == 0);
				} else {
					resultado = numero1 / numero2;
					System.out.println("El resultado es: " + resultado);
				}
				break;

			default:
				System.out.println("Opción no valida");
				break;
			}
		}

	}

}

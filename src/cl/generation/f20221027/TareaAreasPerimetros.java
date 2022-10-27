package cl.generation.f20221027;

import java.util.ArrayList;
import java.util.Scanner;

public class TareaAreasPerimetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();

	}

	public static void menu() {
		System.out.println("**************************\n");
		System.out.println("* CÁLCULO DE ÁREA Y PERÍMETRO\n");
		System.out.println("**************************\n");
		System.out.println("*          Menú          *\n");
		System.out.println("Escoja la figura:");
		System.out.println("1. TRIANGULO");
		System.out.println("2. RECTANGULO");
		System.out.println("3. CIRCUNFERENCIA");
		System.out.println("0. SALIR\n");
		System.out.println("**************************\n");

		Scanner scanner = new Scanner(System.in); // Capturar datos ingresados por el usuario
		int opcion = 0; // buena practica definir variables arriba
		int contadorErrores = 4;
		ArrayList<Float> numeros = new ArrayList<Float>(); // arreglo que contiene lados
		int nLado = 1;
		Float lado = 0F;
		Double area = 0D;
		Double perimetro = 0D;

		// Captura y Validación de datos menu
		do {
			System.out.println("* Selecciona una opción *");
			opcion = scanner.nextInt();
			System.out.println("\n");
			if (opcion == 0) { // si la opcion es 0 salir del Do While
				System.out.println("Usted ha salido del programa");
				break; // provoca la salida del if y del do while.
			}

			else if (opcion < 0 || opcion > 3) { // condicion de error
				contadorErrores--;
				System.out.println(contadorErrores + " intentos restantes");
			}
			if (contadorErrores == 0) { // ANALIZAR QUE PASA CON 0
				System.out.println("Cantidad de intentos superados");
				break;
			}

		} while (opcion < 0 || opcion > 3);

		switch (opcion) {
		case 1:// Triangulo
			System.out.println("Sean a, b, c los lados de un tríangulo y h su altura, donde ");
			System.out.println("a es la base. \n");
			System.out.println("Ingrese los valores en el siguiente orden: ");
			System.out.println("Valor 1: a");
			System.out.println("Valor 2: h");
			System.out.println("Valor 3: b");
			System.out.println("Valor 4: c\n");

			do {
				System.out.println("Ingrese Valor " + nLado + ":");
				do {
					lado = scanner.nextFloat();
					if (lado == 0F) {
						System.out.println("Ingrese un valor mayor que cero");
					}
				} while (lado == 0F);
				numeros.add(Math.abs(lado));
				nLado++;
			} while (numeros.size() < 4);

			area = numeros.get(0) * numeros.get(1) / 2D;
			perimetro = numeros.get(0) * 1D + numeros.get(2) + numeros.get(3);

			break;

		case 2:// Rectangulo
			System.out.println("Sean a y b lados de un rectángulo, donde ");
			System.out.println("a es base y b altura \n");
			System.out.println("Ingrese los valores en el siguiente orden: ");
			System.out.println("Valor 1: a");
			System.out.println("Valor 2: b");

			do {
				System.out.println("Ingrese Valor " + nLado + ":");
				do {
					lado = scanner.nextFloat();
					if (lado == 0F) {
						System.out.println("Ingrese un valor mayor que cero");
					}
				} while (lado == 0F);
				numeros.add(Math.abs(lado));
				nLado++;
			} while (numeros.size() < 2);

			area = numeros.get(0) * numeros.get(1) * 1D;
			perimetro = numeros.get(0) * 2D + numeros.get(1) * 2D;

			break;
		case 3:// Circunferencia
			System.out.println("Ingrese radio: ");
			do {
				lado = scanner.nextFloat();
				if (lado == 0f) {
					System.out.println("Ingrese un valor mayor que cero");
				}
			} while (lado == 0);
			numeros.add(Math.abs(lado));
			System.out.println(numeros);

			area = Math.PI * Math.pow(numeros.get(0), 2);
			perimetro = 2 * Math.PI * numeros.get(0);

			break;

		default:
			System.out.println("Opción no valida");
			break;
		}

		scanner.close();

		System.out.println("El perímetro es: " + perimetro);
		System.out.println("El área es: " + area);
	}

}

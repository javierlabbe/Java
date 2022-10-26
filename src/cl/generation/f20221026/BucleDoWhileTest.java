package cl.generation.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// BUCLE doWhile
		/*
		 * Estructura: A lo menos se ejecuta una vez. Siempre se ejecuta la primera y
		 * luego consulta la condición
		 * 
		 * do {
		 * 
		 * } while (condition);
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		int edad = 0;
		Float kilos = 0F;
		Float estatura = 0F;

		do {
			System.out.println("Ingresa tu edad: ");
			edad = scanner.nextInt();
		} while (edad < 18 || edad > 120); // mientras se cumpla esa condicion se seguira entrando en el do

		System.out.println("Edad ingresada: " + edad);

		// peso
		do {
			System.out.println("Ingresa tu peso en kilos: ");
			kilos = scanner.nextFloat();
		} while (kilos < 40 || kilos > 150); // mientras se cumpla esa condicion se seguira entrando en el do

		System.out.println("Peso ingresado: " + kilos + " kg");

		// estatura
		do {
			System.out.println("Ingresa tu estatura en metros: ");
			estatura = scanner.nextFloat();
		} while (estatura < 1.4 || estatura > 2.10); // mientras se cumpla esa condicion se seguira entrando en el do
													 // no es necesairo poner F de flotante porque se esta comparando el contenido

		System.out.println("Estatura ingresada: " + estatura + " m");

		scanner.close();
	}

}

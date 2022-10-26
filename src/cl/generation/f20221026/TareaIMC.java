package cl.generation.f20221026;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TareaIMC {

	public static void main(String[] args) {
		// Tarea IMC
		datosPaciente();

	}

	// Funcion datos paciente
	public static void datosPaciente() {
		Scanner scanner = new Scanner(System.in);
		int edad = 0;
		String nombre = "";
		String apePaterno = "";
		String apeMaterno = "";
		Float kilos = 0F;
		Float estatura = 0F;

		// Nombre
		do {
			System.out.println("Ingrese nombre: ");
			nombre = scanner.next() + "";
		} while (Pattern.matches("[a-zA-Z]+",nombre) == false);
		
		// Apellido Paterno
		do {
			System.out.println("Ingrese apellido paterno: ");
			apePaterno = scanner.next() + "";
		} while (Pattern.matches("[a-zA-Z]+",apePaterno) == false);
		// Apellido Materno
		do {
			System.out.println("Ingrese apellido materno: ");
			apeMaterno = scanner.next() + "";
		} while (Pattern.matches("[a-zA-Z]+",apeMaterno) == false);

		// edad
		do {
			System.out.println("Ingrese edad: ");
			edad = scanner.nextInt();
		} while (edad < 18 || edad > 120); // mientras se cumpla esa condicion se seguira entrando en el do

		// peso
		do {
			System.out.println("Ingrese peso en kilos: ");
			kilos = scanner.nextFloat();
		} while (kilos < 40 || kilos > 150); // mientras se cumpla esa condicion se seguira entrando en el do

		// estatura
		do {
			System.out.println("Ingrese estatura en metros: ");
			estatura = scanner.nextFloat();
		} while (estatura < 1.4 || estatura > 2.10); // mientras se cumpla esa condicion se seguira entrando en el do
														// no es necesairo poner F de flotante porque se esta comparando
														// el contenido
		System.out.println("\n");
		System.out.println("****************"+ "\n");
		System.out.println("Ficha Clínica Paciente"+ "\n");
		String nombreCompleto = nombre + " " + apePaterno + " " + apeMaterno;
		System.out.println("Nombre paciente: " + nombreCompleto);
		System.out.println("Edad ingresada: " + edad);
		System.out.println("Peso ingresado: " + kilos + " kg");
		System.out.println("Estatura ingresada: " + estatura + " m");

		Float IMC = calculoIMC(kilos, estatura);
		System.out.println("Su IMC es: " + IMC);
		nivelIMC(IMC);

		scanner.close();
	}

	// Funcion para el cálculo de IMC
	public static Float calculoIMC(Float kilos, Float estatura) {
		Float imc = kilos / (estatura * estatura);
		return imc;

	}

	// Funcion estado IMC
	public static void nivelIMC(Float IMC) {
		String estado = "";
		if (IMC < 18.5F) {
			estado = "Bajo peso";
		} else if (IMC >= 18.5F && IMC < 25) { // a los numeros enteros les agrega el .0 por default, ademas Integer
												// esta contenido en Float
			estado = "Normal";
		} else if (IMC >= 25 && IMC < 30) { // se toma menor a 30 para considerar dentro del rango el 29.9999999999
			estado = "Sobrepeso";
		} else {
			estado = "Obeso";
		}
		System.out.println("Estado peso: "+ estado);
	}

}

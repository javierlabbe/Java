package cl.generation.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		Float IMC = calculoIMC();
		nivelIMC(IMC);

	}

	// Funcion para el cálculo de IMC
	public static Float calculoIMC() {
		// Capturar datos ingresados por el usuario
		Scanner scanner = new Scanner(System.in);

		// calculo del IMC;
		// imc = kilos/(estatura*estatura)
		System.out.println("Ingrese su peso en kg: ");
		Float kilos = scanner.nextFloat();

		System.out.println("Ingrese su estatura en metros: ");
		Float estatura = scanner.nextFloat();

		Float imc = kilos / (estatura * estatura);

		scanner.close(); // si no se realiza eso el scanner no deja de funcionar. Estaría todo momento
							// esperando ser llamado.
		System.out.println("Su IMC es: " + imc);
		return imc;
	}

	public static void nivelIMC(Float IMC) {
		/*
		 * Por debajo de 18.5 Bajo peso 
		 * 18.5 - 24.9 Normal 25.0 - 29.9 Sobrepeso 
		 * 30.0 o mas Obeso
		 */
		if (IMC < 18.5F) {
			System.out.println("Bajo peso");
		} else if (IMC >= 18.5F && IMC < 25) { // a los numeros enteros les agrega el .0 por default, ademas Integer
												// esta contenido en Float
			System.out.println("Normal");
		} else if (IMC >= 25 && IMC < 30) { //se toma menor a 30 para considerar dentro del rango el 29.9999999999
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obeso");
		}
	}

}

package cl.generation.f20221027;

import java.util.Scanner;

public class UsoPersonaObjeto {

	public static void main(String[] args) {
		//
		datos();
		
	}

	String nombre = "";
	String apePaterno = "";
	String apeMaterno = "";
	String mail = "";
	Integer telefono = 0;
	Integer edad = 0;
	String direccion = "";
	String nacionalidad = "";

	public static void datos() {
		Scanner scanner = new Scanner(System.in); // Capturar datos ingresados por el usuario
		System.out.println("Ingrese nombre");
		String nombre = scanner.next();
		System.out.println("Ingrese apellido paterno");
		String apePaterno = scanner.next();
		System.out.println("Ingrese apellido materno");
		String apeMaterno = scanner.next();
		System.out.println("Ingrese correo");
		String mail = scanner.next();
		System.out.println("Ingrese telefono");
		Integer telefono = scanner.nextInt();
		System.out.println("Ingrese edad");
		Integer edad = scanner.nextInt();
		System.out.println("Dirección");
		String calle = scanner.next();
		String num = scanner.next();
		String direccion = calle +" "+ num;
		System.out.println("Ingrese nacionalidad");
		String nacionalidad = scanner.next();
		scanner.close();
		
		PersonaObjeto persona1 = new PersonaObjeto(nombre, apePaterno, apeMaterno, mail, telefono, edad, direccion,
				nacionalidad);
		
		System.out.println(persona1.toString());
	}
}

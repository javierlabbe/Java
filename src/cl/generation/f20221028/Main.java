package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Instanciar a estudiante
		/*
		 * Estudiante estudiante = new Estudiante("Mijail","Loren","12254778-5");
		 * System.out.println(estudiante.toString()); estudiante.setEdad(3);
		 * estudiante.setCorreo("m@m.cl"); estudiante.setCurso("1A");
		 * System.out.println(estudiante.toString());
		 */
		capturarEstudiante();
		
	}
	
	public static void capturarEstudiante() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>(); 
		int continuar = 2 ;
		
		do {
			//instancia al objeto estudiante
			Estudiante estudiante = new Estudiante();
			System.out.println("Ingrese el nombre del estudiante: ");
			String nombre = sc.nextLine(); //a diferencia del next, con next line se pueden usar espacios al ingresar datos
			System.out.println("Ingrese el apellido del estudiante: ");
			String apellido = sc.nextLine(); //a diferencia del next, con next line se pueden usar espacios al ingresar datos
			//seteando valor al atributo del objeto
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			
			//agregamos objeto al arreglo
			estudiantes.add(estudiante);
			
			System.out.println("Desea agregar otro estudiante: ");
			System.out.println("(1) SI  (2) NO");
			continuar = sc.nextInt();
			sc.nextLine(); //corrige el error de capturar un nextLine y despues solicitar un numero
			
		} while (continuar == 1);
		
		
		//recorrer la lista de estudiantes con for each
		for (Estudiante estudiante : estudiantes) {
			System.out.println("Nombre: "+ estudiante.getNombre()); //get para consultar el valor de un atributo
			System.out.println("Apellido: "+ estudiante.getApellido());
		}
		
		//Obtener un estudiante (objeto tipo Estudiante) especifico por posicion en array estudiantes
		System.out.println(estudiantes.get(0));
		
		//accedemos al atributo del estudiante
		System.out.println(estudiantes.get(0).getNombre());
		sc.close();
	}

}

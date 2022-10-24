package cl.generation.f20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// ARREGLO (arrays) EN JAVA
		// ESTATICOS:
		// el tamaño de los arreglos estáticos no varía.

		int[] arreglo = new int[3];
		// arreglo.length; tamaño del arreglo

		// a diferencia de Javascript, los arreglos en java no permiten mezclar tipo de
		// datos.
		// por ejemplo, el arrey anterior se definio como int. solo podemos agregar
		// datos int.

		// Agregar datos:
		arreglo[0] = 4; // estamos asignando el int 4 a la primera posición
		arreglo[1] = 8;
		// arrreglo[2]= 12d; no lo aceptaria, ya que se definio el array como int
		arreglo[2] = 12;
		// arreglo[3]= 24; tiraría error, ya que la dimensión del arreglo es 3.
		System.out.println(arreglo.toString()); // no permite convertir directamente el arreglo a string. Convierte a
												// string el espacio de memoria.
		System.out.println(Arrays.toString(arreglo)); // imprime el arreglo
		// System.out.println(arreglo[0].toString()); no funciona, porque se esta
		// tratando de usar un método con un primitivo
		System.out.println(arreglo[0]);

		// {}: para asignar valores de manera predeterminada.
		int[] sinNumeros = {}; // arreglo sin elementos
		System.out.println(sinNumeros.length); // mostrará 0, porque length busca el tamaño o cantidad de elementos que
												// tiene el arreglo
		// sinNumeros[0] = 1; para un arreglo vacío no se puede. Por definición es
		// vacio.
		// System.out.println(sinNumeros[0]);

		String[] vocales = { "a", "e", "i", "o", "u" };
		System.out.println("cantidad de elementos: " + vocales.length); // arrojará 5.
		vocales[0] = "y"; // si se puede sobreescribir un dato en una posición existente.
		System.out.println(vocales[0]);

		/* Crear un array de números flotantes de tamaño 6 */
		float[] arreglo2 = new float[6];
		System.out.println(arreglo2.length);
		/* Agregar 6 elementos al arreglo */
		arreglo2[0] = 1; // se puede agregar un 1 porque int esta dentro de los float.
		arreglo2[1] = -0.6f; // especificar la f al final cuando hay punto, sin la f lo considera double.
		arreglo2[3] = 1;
		arreglo2[4] = 1;
		arreglo2[5] = 1;
		System.out.println(arreglo2[0]); // arroja 1.0

		int[] arreglo3 = new int[2];
		// arreglo3[0] = 0.2; arrojaría error porque float no es entero, no esta
		// contenido en int. Habría que castear a int.
		arreglo3[0] = (int) 0.2; // el syso arrojaría 0, que es la parte entera, al castear se trunca

		/*
		 * Crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente desde
		 * el 1 al 100
		 */
		int[] arreglo4 = new int[100];
		for (int i = 0; i < arreglo4.length; i++) {
			arreglo4[i] = i + 1;
		}

		System.out.println(Arrays.toString(arreglo4));

		// hacer lo mismo del 100 al 1.
		int[] arreglo5 = new int[100];
		for (int i = arreglo5.length; i > 0; i--) {
			arreglo5[i - 1] = arreglo5.length - i + 1;

		}

		System.out.println(Arrays.toString(arreglo5));
		// otra solución:
		int[] arreglo100a1 = new int[100];
		// {100,99,98,97...0}
		for (int i = arreglo100a1.length; i > 0; i--) {
			arreglo100a1[arreglo100a1.length - i] = i;
		}
		
		// Escribir un arreglo de tamaño de 10 ,con números positivos y negativos , capturar en máximo y mínimo
		
		int mayor = 0;
		int menor = 0;
		int[] numeros = {-3,-5, 4,12, 3,35, -35,77,-1, 0};
		for (int i = 0; i < numeros.length;i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			} 
			if (numeros[i]> mayor) {
				mayor = numeros[i];
			}
		}
		
		System.out.println("mayor "+mayor);
		System.out.println("menor "+menor);
		
		//2. El mismo arreglo crear otros 2 arreglos, uno con solo los pares y otro arreglo solo con los impares
		int contPares = 0;
		int contImpares = 0;
		
		for (int i = 0; i < numeros.length;i++) {
			if (numeros[i] % 2 == 0) {
				contPares += 1;
			} else {
				contImpares += 1;
			}
		}
		
		int[] arrPares = new int[numeros.length];
		int[] arrImpares = new int[numeros.length];
		for (int i = 0; i < numeros.length;i++) {
			if (numeros[i] % 2 == 0) {
				arrPares[i] = numeros[i];
			} else {
				arrImpares[i] = numeros[i];
			}
		}
		System.out.println(Arrays.toString(arrPares));
		System.out.println(Arrays.toString(arrImpares));
		
		//3. Para el mismo arreglo, sacar promedio
		float sumaTotal = 0;
		for (int i = 0; i < numeros.length;i++) {
			sumaTotal += numeros[i];
		}
		float promedio = sumaTotal / (float)numeros.length;
		System.out.println(promedio);
	}

}

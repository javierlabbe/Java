package cl.generation.f20221024;
//en esta sección se importan librerias (bajo el package)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LAS VARIABLES
		//var nombre_variable (EN JAVASCRIPT, EN JAVA NO)
		
		//En java:
		//VARIABLES PRIMITIVAS, CARACTER ESTATICO
		//Las variables primitivas son super pequeñas.
		//todas inician con minusculas.
		//no nos permiten trabajar con métodos, por eso son llamadas estáticas.
		
		int numero = 2; //variable numerica 32bits y valor -2,147,483,648 y el máximo 2,147,483,647 (inclusive).
		long numero2 = 2147483648l;// -2^63 y 2^63 -1
		float decimal = 2.5f;// 1.4x10^-45 a 3.4028235x10^38. (32bits)
		float decimal2 = (float) 2.5; //castear el 2.5 a un flotante de otra manera
		double decimal3 = 9.8d; //doble de presición que un decimal (64bits)
		
		char caracter = 'a'; //comilla simple es considerado caracter. Simepre se deben trabajar con comilla simple. ES UN CARACTER. 'aa' no es un caracter. 'a' es un caracter.
		
		boolean respuesta = true; //o false (1bit)
		//investigar short y byte (variables)
		
		System.out.println(numero+" "+numero2+" "+respuesta); //aqui dejan de aparecer las alertas amarillas al lado de las variables utilziadas.
		//hay que concatenar, no funciona la coma como en JavaScript.
		
		
		//VARIABLES OBJETO 
		//nos permiten trabajar con métodos (funciones)
		
		String palabra = "qwerty"; //la recomendación es usar comillas dobles para diferenciar del char. 
		//No es primitiva pero es la única forma de trabajar con texto.
		//siempre va con mayuscula, con minuscula no funciona.
		
		
		Integer numero3 = 2;//variable numerica 32bits y valor -2^31 y +2^31 - 1
		//ejemplo de trabajar con metodos -> nombre_variable.metodo
		
		Long numero4 = 1234567890L; //java considera por default que todos los números son Int, por eso hay que castearlos.
		Float numero5 = 7654F;
		Double numero6 = 123456787655454D;
		
		Boolean presente2 = true;
		
		//CONVERSIÓN DE DATOS (tarea)
		
		/*Si la conversión es a partir de un valor numerico, usar como última opción de conversión PARSE. Parse convierte string a valor numérico.
		pues obligamos a la maquina a hacer un paso adicional, es mejor usar casteo. 	*/
		
		//parseInt retorna un int, valor primitivo.
		
		/* valueof se ocupa cuando estamos trabajando con datos de tipo objeto y se quiere extraer el objeto completo, con todas las propiedades
		y no solamente el dígito (solo el digito sería valor primitivo, no objeto. Espera un primitivo y retorna un objeto */
		
		
		
	}

}

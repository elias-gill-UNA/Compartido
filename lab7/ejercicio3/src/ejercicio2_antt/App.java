// @autor Elias Gill
package ejercicio2_antt;

import java.security.SecureRandom;
import java.util.Scanner;

public class App {
	// clase que guarda una nueva pregunta

	private class Pregunta {

		public String pregunta;
		private int num1;
		private int num2;
		public int res;

		public Pregunta() {
			SecureRandom random = new SecureRandom();
			num1 = random.nextInt(10);
			num2 = random.nextInt(10);
			res = num1 * num2;
			pregunta = String.format("Cuanto es %d x %d ?", num1, num2);
		}
	}

	// funcion que crea una nueva pregunta
	public Pregunta nuevaPregunta() {
		return new Pregunta();
	}

	public static void main(String[] args) {
		App preguntero = new App();
		int nivel = 0; // despues de 10 niveles se para el programa
		Pregunta pregunta = preguntero.nuevaPregunta();
		Scanner eleccion = new Scanner(System.in);

		// despues de 10 niveles se para el programa
		while (nivel != 10) {
			System.out.println(pregunta.pregunta);
			// lanzar un mensaje de error hasta que se acierte
			while (eleccion.nextInt() != pregunta.res) {
				System.out.println("Intentelo nuevamente");
			}
			System.out.println("Bien hecho !!!\n");
			pregunta = preguntero.nuevaPregunta();
			nivel++;
		}
		eleccion.close();
	}
}

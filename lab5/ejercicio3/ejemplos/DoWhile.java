// PruebaDoWhile.java
// La instrucción de repetición do...while.

public class PruebaDoWhile{
	public static voidmain(String[]args) { 
		int contador = 1; 

		do {
			System.out.printf(“%d ”, contador);
			++contador;
		}while (contador <=10);	// fin de do...while

		System.out.println();
	}
}// fin de la clase PruebaDoWhile
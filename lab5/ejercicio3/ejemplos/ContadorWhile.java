// Fig. 5.1: ContadorWhile.java
// Repetici�n controlada con contador, con la instrucci�n de repetici�n while.

public class ContadorWhile {
	public static voidmain(String[] args) { 
		int contador =1;		// declara e inicializa la variable de control

		while (contador <=10) {	// condici�n de continuaci�n de ciclo
			System.out.printf(�%d �, contador);
			++contador; 		// incrementa la variable de control 
		} 

		System.out.println();	
   }
  } // fin de la clase ContadorWhile
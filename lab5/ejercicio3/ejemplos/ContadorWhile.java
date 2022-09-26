// Fig. 5.1: ContadorWhile.java
// Repetición controlada con contador, con la instrucción de repetición while.

public class ContadorWhile {
	public static voidmain(String[] args) { 
		int contador =1;		// declara e inicializa la variable de control

		while (contador <=10) {	// condición de continuación de ciclo
			System.out.printf(“%d ”, contador);
			++contador; 		// incrementa la variable de control 
		} 

		System.out.println();	
   }
  } // fin de la clase ContadorWhile
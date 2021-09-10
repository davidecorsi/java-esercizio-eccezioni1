/*
 * Nella parte di controllo una volta che viene trovato un carattere che non è una cifra è inutile 
 * esaminare le successiva. Modificate questa applicazione in 3 modi:
 * 1- Riscrivete questa parte ricorrendo all'istruzione break.
 * 2- Riscrivete questa parte senza ricorrere all'istruzione break. 
 * 3- Riscrivete l'applicazione utilizzando il meccanismo delle eccezioni
 */
public class Main {
	public static void main(String[] args) {
		Integer somma = 0;
		try {
			for(String s: args) {
				Integer i = Integer.parseInt(s);
				somma = somma + i;
			}
		} catch(NumberFormatException e) {
			System.out.println("Sono state fornite stringhe che non rappresentano numeri");
			somma = null;
		}
		if(somma != null) {
			System.out.println(somma);
		}
	}
}

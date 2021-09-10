/*
 * Nella parte di controllo una volta che viene trovato un carattere che non è una cifra è inutile 
 * esaminare le successiva. Modificate questa applicazione in 2 modi:
 * 1- Riscrivete questa parte ricorrendo all'istruzione break.
 * 2- Riscrivete questa parte senza ricorrere all'istruzione break. 
 * 3- Riscrivete l'applicazione utilizzando il meccanismo delle eccezioni
 */
public class Main {
	public static void main(String[] args) {
		boolean soloCifre = true;
		for(String s: args) {
			for(int j = 0; j < s.length(); j++) {
				if(!Character.isDigit(s.charAt(j))) {
					soloCifre = false;
				}
			}
		}
		if(soloCifre) {
			int somma = 0;
			for(String s: args) {
				Integer i = Integer.parseInt(s);
				somma = somma + i;
			}
			System.out.println(somma);
		} else {
			System.out.println("Sono state fornite stringhe che non rappresentano numeri");
		}
	}
}

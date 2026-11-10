package it.univr.esercizi.foglio01;

/*
 * Esercizio 18 
 */

public class RapportoValoreFloatDouble {

	public static void main(String[] args) {
		
		// Variabili float
		float valoreIniziale = 10.45F;
		float valoreFinale = 27.22F;
		float fattoreCrescita = valoreFinale / valoreIniziale;
		System.out.println("Valore iniziale: " + valoreIniziale);
		System.out.println("Valore finale: " + valoreFinale);
		System.out.println("Fattore di crescita: " + fattoreCrescita);
		
		// Variabili double
		double valoreInizialeDouble = 10.45;
		double valoreFinaleDouble = 27.22;
		double fattoreCrescitaDouble = valoreFinaleDouble / valoreInizialeDouble;
		System.out.println("Valore iniziale: " + valoreInizialeDouble);
		System.out.println("Valore finale: " + valoreFinaleDouble);
		System.out.println("Fattore di crescita: " + fattoreCrescitaDouble);
		
		

	}

}

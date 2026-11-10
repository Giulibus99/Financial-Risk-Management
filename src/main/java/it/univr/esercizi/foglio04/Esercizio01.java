package it.univr.esercizi.foglio04;

/*
 * Esercizio 1 - ContoVincolato main
 */
public class Esercizio01 {

	public static void main(String[] args) {
		ContoVincolato conto1 = new ContoVincolato(1000.0, 0.05);
		/*
		 * Non posso modificare il valore di capitale dato che il campo della classe
		 * ContoVincolato è private ed è accessibile solo dalla stessa classe.
		 * conto1.capitale = 100;
		 */
		int anni = 2;
		System.out.println("Il montante finale è: " + conto1.montante(anni));
	}

}

package it.univr.esercizi.foglio01;
/*
 * Esercizio 13 
 */

public class StatoMercato {

	public static void main(String[] args) {
		boolean mercatoChiuso = false;
		boolean mercatoAperto = !mercatoChiuso;
		boolean doppiaNegazione = !! mercatoChiuso;
		
		System.out.println("Il mercato e' chiuso? " + mercatoChiuso);
		System.out.println("Se faccio la negazione della variabile precedente: " + mercatoAperto);
		System.out.println("Se calcolo la doppia negazione: " + doppiaNegazione);
	}

}

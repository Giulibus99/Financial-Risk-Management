package it.univr.esercizi.foglio04;

/*
 * Esercizio 6 – PosizioneValida main
 */


public class Esercizio06 {

	public static void main(String[] args) {
		PosizioneValida pos1 = PosizioneValida.crea(5, 20.0);
		PosizioneValida pos2 = PosizioneValida.crea(-2, 20.0);
		if(pos1 != null) {
			System.out.println("Il valore della posizione 1 è: " + pos1.valore());
		}
		else {
			System.out.println("Non è stato creato nulla");
		}
		
		if(pos2 != null) {
			System.out.println("Il valore della posizione 2 è: " + pos2.valore());
		}
		else {
			System.out.println("Non è stato creato nulla");
		}

	}

}

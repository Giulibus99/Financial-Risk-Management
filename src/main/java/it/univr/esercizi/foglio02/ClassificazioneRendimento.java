package it.univr.esercizi.foglio02;

// Esercizio 03


public class ClassificazioneRendimento {

	public static void main(String[] args) {
		double rendimento = 0.018;
		if (rendimento >= 0.03) {
			System.out.println("Rendimento elevato");
		} else if (rendimento >= 0) {
			System.out.println("Rendimento non negativo");
		} else {
			System.out.println("Rendimento negativo");
		}
		
		System.out.println("Rendimento: " + rendimento);
	}

}

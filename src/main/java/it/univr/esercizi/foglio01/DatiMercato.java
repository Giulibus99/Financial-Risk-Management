package it.univr.esercizi.foglio01;

// Esercizio 1

public class DatiMercato {

	public static void main(String[] args) {
		int numeroAzioni = 120;
		double prezzoAzione = 45.75;
		boolean mercatoAperto = true;
		char classeRischio = 'A';
		
		System.out.println(numeroAzioni + ": numero di azioni nel mercato");
		System.out.println(prezzoAzione + ": prezzo di una singola azione");
		System.out.println(mercatoAperto + ": se 'true' il mercato è aperto altrimenti chiuso");
		System.out.println(classeRischio + ": classe di rischio dell'azione considerata");

	}

}

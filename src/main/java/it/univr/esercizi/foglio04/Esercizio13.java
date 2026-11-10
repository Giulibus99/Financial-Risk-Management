package it.univr.esercizi.foglio04;

public class Esercizio13 {

	public static void main(String[] args) {
		double[] flussi = {5.0, 5.0, 105.0};
		double prezzoObbligazione = MyAnalyticFormulas.prezzoObbligazione(flussi, 0.05);
		
		System.out.println("Il prezzo dell'obbligazione è: " + prezzoObbligazione);

	}

}

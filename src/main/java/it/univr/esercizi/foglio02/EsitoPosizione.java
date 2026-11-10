package it.univr.esercizi.foglio02;

// Esercizio 02
public class EsitoPosizione {

	public static void main(String[] args) {
		double prezzoAcquisto = 98.50;
		double prezzoCorrente = 103.20;
		double differenza = prezzoCorrente - prezzoAcquisto;
		if (prezzoCorrente > prezzoAcquisto) {
			System.out.println("Posizione in guadagno");
		} else {
			System.out.println("Posizione non in guadagno");
		}
		System.out.println("Differenza: " + differenza);
	}

}

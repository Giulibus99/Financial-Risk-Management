package it.univr.esercizi.foglio01;

// Esercizio 7

public class PrezzoMedioAcquisto {

	public static void main(String[] args) {
		double capitaleInvestito = 1500.0;
		double numeroQuote = 12.0;
		
		double prezzoMedio = capitaleInvestito / numeroQuote;
		
		System.out.println("Il capitale investito e': " + capitaleInvestito);
		System.out.println("Si sono acquistate " + numeroQuote + " quote");
		System.out.println("Il prezzo medio pagato e' stato: " + prezzoMedio);
	}

}
package it.univr.esercizi.foglio01;

// Esercizio 6

public class CommissioneOperazione {

	public static void main(String[] args) {
		double valoreOperazione = 2500.0;
		double aliquotaCommissione = 0.008;
		
		double commissione = valoreOperazione * aliquotaCommissione;
		double valoreOperazioneNetto = valoreOperazione - commissione;
		
		System.out.println("Il valore lordo della commissione e': " + valoreOperazione);
		System.out.println("Commissione: " + commissione);
		System.out.println("Il valore netto della commissione risulta: " + valoreOperazioneNetto);
		
	}

}

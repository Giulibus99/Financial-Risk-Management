package it.univr.esercizi.foglio02;

// Esercizio 06

public class AliquotaCommissione {

	public static void main(String[] args) {
		double valoreOperazione = 12000.0;
		boolean volumeElevato = (valoreOperazione >= 10000.0);
		
		double aliquotaCommissione = volumeElevato ? 0.004 : 0.007;
		
		double commissione = valoreOperazione * aliquotaCommissione;
		
		System.out.println("Commissione: " + commissione);

	}

}

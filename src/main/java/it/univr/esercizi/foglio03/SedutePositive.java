package it.univr.esercizi.foglio03;

/*
 * Esercizio 16
 */
public class SedutePositive {

	public static void main(String[] args) {
		double[] rendimentiGiornalieri = {-0.01, 0.02, 0.0, 0.015, -0.03, 0.025};
		int positivo = 0;
		int nonNegativo = 0;

		for (int i = 0; i < rendimentiGiornalieri.length; i++) {
			if (rendimentiGiornalieri[i] > 0) {
				positivo++;
			}
			if (rendimentiGiornalieri[i] >= 0) {
				nonNegativo++;
			}
		}
		System.out.println("Rendimenti strettamente positivi: " + positivo);
		System.out.println("Rendimenti non negativi: " + nonNegativo);
	}

}

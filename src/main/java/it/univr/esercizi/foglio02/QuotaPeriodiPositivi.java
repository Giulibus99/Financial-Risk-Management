package it.univr.esercizi.foglio02;

// Esercizio 15

public class QuotaPeriodiPositivi {

	public static void main(String[] args) {
		int variazioneCentesimi;
		int periodiPositivi = 0;
		
		for (int i = 1; i <= 6; i++) {
			variazioneCentesimi = i - 3;
			if (variazioneCentesimi > 0) {
				periodiPositivi++;
			}
			
		}

		double quotaPeriodiPositivi = (double)periodiPositivi / 6;
		System.out.println("Periodi positivi: " + periodiPositivi);
		System.out.println("Quota periodi positivi: " + quotaPeriodiPositivi);
	}

}

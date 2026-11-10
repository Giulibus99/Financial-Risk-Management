package it.univr.esercizi.foglio05;


// Esercizio 01

public class EquivalentRates {

	static double effectiveAnnual(double tasso, int volte) {
		return Math.pow((1.0 + (tasso / volte)), volte) - 1.0;
	}
	
	static double effectivePeriodic (double tasso, int volte) {
		return Math.pow((1.0 + effectiveAnnual(tasso, volte)), (1.0 / volte)) - 1.0;
	}
}

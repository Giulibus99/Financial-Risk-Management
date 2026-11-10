package it.univr.esercizi.foglio05;

public class Esercizio01 {

	public static void main(String[] args) {
		System.out.println("Il tasso annuo effettivo è: " + 
				EquivalentRates.effectiveAnnual(0.08, 4));

		System.out.println("Il tasso periodico effettivo è: " + 
				EquivalentRates.effectivePeriodic(0.08, 4));
	}

}

package it.univr.esercizi.foglio05;

public class Esercizio09 {

	public static void main(String[] args) {
		// ActurialPresentValue valoreAttuariale = new ActurialPresentValue();
		MortalityTable table = new MortalityTable();
		System.out.println("Il valore attuariale è: " + 
				ActurialPresentValues.deathBenefitInYear(table, 65, 3, 10000, 0.02));

	}

}

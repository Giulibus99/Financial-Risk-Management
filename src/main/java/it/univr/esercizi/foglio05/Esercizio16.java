package it.univr.esercizi.foglio05;

public class Esercizio16 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();
		DecreaseTermLife valore = new DecreaseTermLife(65, 10000.0, 5);

		System.out.println("Il valore attuale: " + valore.getValue(table, 0.02));
		
	}

}

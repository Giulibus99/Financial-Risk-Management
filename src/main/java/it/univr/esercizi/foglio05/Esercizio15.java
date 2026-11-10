package it.univr.esercizi.foglio05;

public class Esercizio15 {

	public static void main(String[] args) {
		DeferredLifeAnnuity rendita = new DeferredLifeAnnuity(65, 1000.0, 3, 5);
		MortalityTable table = new MortalityTable();
		
		System.out.println("La rendita posticipata: " + rendita.getValue(table, 0.02));

	}

}

package it.univr.esercizi.foglio05;

public class Esercizio13 {

	public static void main(String[] args) {
		LifeAnnuity rendita = new LifeAnnuity(65, 1000.0, 5);
		MortalityTable table = new MortalityTable();
		
		System.out.println("La rendita posticipata: " + rendita.getValue(table, 0.02));

	}

}

package it.univr.esercizi.foglio05;

public class Esercizio19 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();
		LevelPremium premio = new LevelPremium(65, 10000.0, 5);
		
		System.out.println("Il premio costante è: " + premio.getValue(table, 0.02));

	}

}

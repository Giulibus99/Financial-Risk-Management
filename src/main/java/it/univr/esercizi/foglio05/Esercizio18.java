package it.univr.esercizi.foglio05;

public class Esercizio18 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();
		JointLives prob = new JointLives(60, 65);
		JointLifeAnnuity rendita = new JointLifeAnnuity(prob, 1000.0 ,5);
		
		System.out.println("Il valore è: " + rendita.getValue(table, 0.02));
	}

}

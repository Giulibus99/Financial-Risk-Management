package it.univr.esercizi.foglio05;

public class Esercizio17 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();
		JointLives prob = new JointLives(60, 65);
		
		System.out.println("Probabilità di sopravvivenza congiunta: " +
				prob.survivalOfBoth(table, 5));

	}

}

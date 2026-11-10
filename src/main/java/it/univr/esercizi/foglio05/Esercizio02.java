package it.univr.esercizi.foglio05;

public class Esercizio02 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();

		System.out.println("La probabilità di morte è: " + 
				table.getDeathProbability(65));
	}

}

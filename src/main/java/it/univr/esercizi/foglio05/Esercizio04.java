package it.univr.esercizi.foglio05;

public class Esercizio04 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();
		
		System.out.println("La probabilità di sopravvivenza: " + 
				table.getSurvivalProbability(65, 5));
	}

}

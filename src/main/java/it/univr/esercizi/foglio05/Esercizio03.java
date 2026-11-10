package it.univr.esercizi.foglio05;

public class Esercizio03 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();
		
		System.out.println("Il tasso di sopravvivenza è: " 
				+ table.getAnnualSurvivalProbability(65));
		
		if(table.getAnnualSurvivalProbability(65) == 1.0 - table.getDeathProbability(65)) {
			System.out.println("Controllo ok");
		}
		else {
			System.out.println("Errore");
		}
		
	}

}

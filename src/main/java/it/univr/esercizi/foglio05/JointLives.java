package it.univr.esercizi.foglio05;

public class JointLives {
	
	private int firstAge;
	private int secondAge;
	
	JointLives(int firstAge, int secondAge) {
		this.firstAge = firstAge;
		this.secondAge = secondAge;
	}
	
	double survivalOfBoth(MortalityTable table, int years) {
		return table.getSurvivalProbability(firstAge, years) *
				table.getSurvivalProbability(secondAge, years);
 	}

}

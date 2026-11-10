package it.univr.esercizi.foglio05;

public class ActurialPresentValues {
	
	static double deathBenefitInYear(MortalityTable table, int age, int year, 
			double benefit, double annualRate) {
		
		return benefit * table.getDeathInYear(age, year) * 
				Math.pow((1.0 + annualRate), (- year));
	}
	

}

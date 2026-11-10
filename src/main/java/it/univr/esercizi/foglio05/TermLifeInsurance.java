package it.univr.esercizi.foglio05;


public class TermLifeInsurance {
	
	private int age;
	private double benefit;
	private int years;
	
	TermLifeInsurance(int age, double benefit, int years) {
		this.age = age;
		this.benefit = benefit;
		this.years = years;
	}
	
	double getValue(MortalityTable table, double interestRate) {
		double valoreAtturiale = 0.0;
		
		for (int k = 1; k <= years; k++) {
			valoreAtturiale += 
					ActurialPresentValues.deathBenefitInYear(table, age, k, benefit, interestRate);
		}
		
		return valoreAtturiale;
	}

}

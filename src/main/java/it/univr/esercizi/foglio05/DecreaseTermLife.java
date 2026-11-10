package it.univr.esercizi.foglio05;

public class DecreaseTermLife {
	int age;
	double initialBenefit;
	int years;
	
	DecreaseTermLife(int age, double initialBenefit, int years) {
		this.age = age;
		this.initialBenefit = initialBenefit;
		this.years = years;
	}
	
	double getValue(MortalityTable table, double interestRate) {
		double result = 0;
		double doubleYears = years;
		
		for (int k = 1; k <= years; k++) {
			double firstTerm = (initialBenefit * (years - k + 1.0)) / doubleYears;
			
			result += ActurialPresentValues.deathBenefitInYear
					(table, age, k, firstTerm, interestRate);
		}
		
		
		return result;
		
	}
	

}

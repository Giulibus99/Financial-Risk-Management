package it.univr.esercizi.foglio05;

public class LifeAnnuity {
	
	int age;
	double payment;
	int years;
	private boolean inAdvance;
	
	
	// Overloading del costruttore
	LifeAnnuity(int age, double payment, int years, boolean inAdvance) {
		this.age = age;
		this.payment = payment;
		this.years = years;
		this.inAdvance = inAdvance;
	}
	
	// Costruttore richiama l'altro costruttore dando al campo boolean valore false
	LifeAnnuity(int age, double payment, int years) {
		this(age, payment, years, false);
	}
	
	
	double getValue(MortalityTable table, double interestRate) {
		double result = 0.0;
		
		if(!inAdvance) {
			for (int k = 1; k <= years; k++) {
				result += (table.getSurvivalProbability(age, k) * 
						Math.pow((1.0 + interestRate), -k)); 		
			}
		}
		else {
			for (int k = 0; k < years; k++) {
				result += (table.getSurvivalProbability(age, k) * 
						Math.pow((1.0 + interestRate), -k)); 		
			}
			
		}
		result *= payment;
		
		return result;
	}

}

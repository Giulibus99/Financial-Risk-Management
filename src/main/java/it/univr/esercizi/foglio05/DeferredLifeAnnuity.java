package it.univr.esercizi.foglio05;


public class DeferredLifeAnnuity {
	
	int age; //x
	double payment; //R
	int deferral; //m
	int payments; //n
	
	DeferredLifeAnnuity(int age, double payment, int deferral, int payments) {
		this.age = age; 
		this.payment = payment;
		this.deferral = deferral;
		this.payments = payments;
	}
	
	double getValue(MortalityTable table, double interestRate) {
		double result = 0.0;
		
		for (int k = deferral + 1; k <= (deferral + payments); k++) {
			result += table.getSurvivalProbability(age, k) * 
					Math.pow((1.0 + interestRate), -k);
		}
		
		return result * payment;
	}

}

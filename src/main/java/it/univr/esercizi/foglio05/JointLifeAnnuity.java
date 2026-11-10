package it.univr.esercizi.foglio05;

public class JointLifeAnnuity {
	
	private JointLives lives;
	private double payment;
	private int years;
	
	
	JointLifeAnnuity(JointLives lives, double payment, int years) {
		this.lives = lives;
		this.payment = payment;
		this.years = years;
	}
	
	double getValue(MortalityTable table, double interestRate) {
		double result = 0.0;
		
		for (int k = 1; k <= years; k++) {
			result += lives.survivalOfBoth(table, k) * 
					Math.pow((1.0 + interestRate), -k);
			
		}
			
		return payment * result;
	}
	
}

package it.univr.esercizi.foglio05;

public class LevelPremium {
	
	private TermLifeInsurance insurance;
	private LifeAnnuity annuity;
	
	LevelPremium(int age, double benefit, int years) {
		this.insurance = new TermLifeInsurance(age, benefit, years);
		this.annuity = new LifeAnnuity(age, benefit, years, true);
	}
	
	double getValue(MortalityTable table, double interestRate) {
		
		return insurance.getValue(table, interestRate) /
				((annuity.getValue(table, interestRate) / annuity.payment));
		
	}

}

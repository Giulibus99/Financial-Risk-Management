package it.univr.esercizi.foglio05;

public class EndowmentInsurance {
	
	TermLifeInsurance insurance;
	PureEndowment endowment;

	EndowmentInsurance(int age, double benefit, int years) {
		this.insurance = new TermLifeInsurance(age, benefit, years);
		this.endowment = new PureEndowment(age, benefit, years);
	}
	
	double getValue(MortalityTable table, double interestRate) {
		return insurance.getValue(table, interestRate) + 
				endowment.getValue(table, interestRate);
	}
	
}

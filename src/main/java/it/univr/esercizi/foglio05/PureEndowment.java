package it.univr.esercizi.foglio05;

public class PureEndowment {
	
	private int age;
	private double benefit;
	private int years;
	
	PureEndowment(int age, double benefit, int years) {
		this.age = age;
		this.benefit = benefit;
		this.years = years;
	}
	
	double getValue(MortalityTable table , double interestRate) {
		return benefit * table.getSurvivalProbability(age, years) *
				Math.pow((1.0 + interestRate), (- years));
	}

}

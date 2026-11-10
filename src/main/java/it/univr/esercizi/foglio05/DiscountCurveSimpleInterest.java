package it.univr.esercizi.foglio05;

public class DiscountCurveSimpleInterest extends DiscountCurve {

	private double annualRate;
	
	DiscountCurveSimpleInterest(double rate) {
		this.annualRate = rate;
	}
	
	@Override
	public double getValue(double time) {
		return 1.0 / (1.0 + (annualRate * time));
	}
}

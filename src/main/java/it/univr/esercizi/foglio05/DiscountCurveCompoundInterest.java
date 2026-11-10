package it.univr.esercizi.foglio05;

public class DiscountCurveCompoundInterest extends DiscountCurve{
	
	private double annualRate;

	DiscountCurveCompoundInterest(double rate) {
		this.annualRate = rate;
	}
	
	@Override
	public double getValue(double time) {
		return Math.pow((1.0 + annualRate), -time);
				
	}
}

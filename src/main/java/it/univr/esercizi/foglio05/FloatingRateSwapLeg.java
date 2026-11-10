package it.univr.esercizi.foglio05;

public class FloatingRateSwapLeg extends FinancialProduct{
	
	private double notional;
	private double[] forwardRate;
	
	FloatingRateSwapLeg(double notional, double[] rates) {
		super(rates.length);
		this.notional = notional;
		forwardRate = new double[rates.length];
		for (int i = 0; i < rates.length; i++) {
			forwardRate[i] = rates[i];
		}
				
	}
	
	@Override
	double getValue(DiscountCurve curve) {
		double discount = 0.0;
		
		for (int i = 1; i <= forwardRate.length; i++) {
			discount += forwardRate[i-1] * curve.getValue(i);
		}
		
		return notional * discount;		
	}
	
	

}

package it.univr.esercizi.foglio05;

public class InterestRateSwap extends FinancialProduct {
	
	private FixedRateSwapLeg fixedRateSwapLeg;
	private FloatingRateSwapLeg floatingSwapLeg;
	
	
	InterestRateSwap(int maturity, double notional, double fixRate, double[] rates) {
		super(maturity);
		this.fixedRateSwapLeg = new FixedRateSwapLeg(notional, fixRate, maturity);
		this.floatingSwapLeg = new FloatingRateSwapLeg(notional, rates);
	}
	
	@Override
	double getValue(DiscountCurve curve) {
		return floatingSwapLeg.getValue(curve) - fixedRateSwapLeg.getValue(curve);
	}
	

	

}

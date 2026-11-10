package it.univr.esercizi.foglio05;

public class EuropeanOption extends FinancialProduct {
	
	private double strike;
	private double terminalSpot;
	
	EuropeanOption(double maturity, double strike, double terminalSpot) {
		super(maturity);
		this.strike = strike;
		this.terminalSpot = terminalSpot;
	}

	double getStrike() {
		return strike;
	}
	
	double getTerminalSpot() {
		return terminalSpot;
	}
	
	public double getPayoff() {
		return 0.0;
	}
	
	@Override
	double getValue(DiscountCurve curve) {
		return getPayoff() * curve.getValue(getMaturity());
	}
}

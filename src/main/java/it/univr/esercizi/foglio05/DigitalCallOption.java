package it.univr.esercizi.foglio05;

public class DigitalCallOption extends EuropeanOption{
	
	private double payout;
	
	DigitalCallOption(double maturity, double strike, double terminalSpot, double payout) {
		super(maturity, strike, terminalSpot);
		this.payout = payout;
	}
	
	@Override
	public double getPayoff() {
		double result = payout;
		
		if (getTerminalSpot() <= getStrike()) {
			result = 0.0;
		}
		
		return result;
	}

}

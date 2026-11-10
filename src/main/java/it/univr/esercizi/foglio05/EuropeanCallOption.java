package it.univr.esercizi.foglio05;

public class EuropeanCallOption extends EuropeanOption {
	
	EuropeanCallOption(double maturity, double strike, double terminalSpot) {
		super(maturity, strike, terminalSpot);
	}
	
	@Override
	public double getPayoff() {
		double result = getTerminalSpot() - getStrike();
		
		if (result < 0) {
			result = 0;
		}
		return result;
	}

}

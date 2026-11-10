package it.univr.esercizi.foglio05;

public class EuropeanPutOption extends EuropeanOption{
	
	EuropeanPutOption(double maturity, double strike, double terminalSpot) {
		super(maturity, strike, terminalSpot);
	}
	
	@Override
	public double getPayoff() {
		double result = (getStrike() - getTerminalSpot() > 0 ? 
				getStrike() - getTerminalSpot() : 0);
		
		return result;
	}
	 
}

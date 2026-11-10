package it.univr.esercizi.foglio05;

public class Esercizio36 {

	public static void main(String[] args) {
		EuropeanCallOption callOption = new EuropeanCallOption(1, 100, 120);
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il payoff della call è: " + callOption.getValue(curve));

	}

}

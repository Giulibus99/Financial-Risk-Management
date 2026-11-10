package it.univr.esercizi.foglio05;

public class Esercizio38 {

	public static void main(String[] args) {
		DigitalCallOption digitalCallOption = new DigitalCallOption(1, 100, 110, 50);
		
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il payoff è: " + digitalCallOption.getPayoff());
		System.out.println("Il valore è: " + digitalCallOption.getValue(curve));
	
	}

}

package it.univr.esercizi.foglio05;

public class Esercizio37 {

	public static void main(String[] args) {
		EuropeanPutOption putOption = new EuropeanPutOption(1, 100, 80);
		
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il payoff è: " + putOption.getPayoff());
		System.out.println("Il valore è: " + putOption.getValue(curve));

	}

}

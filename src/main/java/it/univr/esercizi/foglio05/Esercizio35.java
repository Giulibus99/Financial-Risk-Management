package it.univr.esercizi.foglio05;

public class Esercizio35 {

	public static void main(String[] args) {
		EuropeanOption option = new EuropeanOption(2, 100, 110);
		
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il risultato provvisorio: " + option.getValue(curve));

	}
}

package it.univr.esercizi.foglio05;

public class Esercizio39 {

	public static void main(String[] args) {
		FixedRateSwapLeg swap = new FixedRateSwapLeg(1000.0, 0.04, 3);
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il valore dello swap è: " + swap.getValue(curve));
	}

}

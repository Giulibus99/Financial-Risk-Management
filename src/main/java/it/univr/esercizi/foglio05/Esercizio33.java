package it.univr.esercizi.foglio05;

public class Esercizio33 {

	public static void main(String[] args) {
		LevelPaymentLoan loan = new LevelPaymentLoan(1000.0, 3, 0.06);
		
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il valore è: " + loan.getValue(curve));

	}

}

package it.univr.esercizi.foglio05;

public class Esercizio32 {

	public static void main(String[] args) {
		BulletLoan loan = new BulletLoan(1000.0, 0.06, 3);
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il valore del prestito è: " + loan.getValue(curve));

	}

}

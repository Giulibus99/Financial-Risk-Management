package it.univr.esercizi.foglio05;

public class Esercizio34 {

	public static void main(String[] args) {
		ForwardContract forward = new ForwardContract(1, 105, 110);
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il valore iniziale: " + forward.getValue(curve));

	}

}

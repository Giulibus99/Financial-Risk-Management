package it.univr.esercizi.foglio05;

public class Esercizio21 {

	public static void main(String[] args) {
		FinancialProduct product = new FinancialProduct(3.0);
		
		System.out.println("La scadenza è: " + product.getMaturity());
		System.out.println("Il valore è: " + product.getValue(new DiscountCurve()));

	}

}

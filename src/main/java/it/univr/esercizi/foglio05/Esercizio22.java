package it.univr.esercizi.foglio05;

public class Esercizio22 {

	public static void main(String[] args) {
		/*
		 * Posso anche scrivere come segue dato che CorporateBond 
		 * eredita da FinancialProduct
		 * FinancialProduct corporateBond = new CorporateBond(3.0, "Alfa SpA");
		 */
		CorporateBond corporateBond = new CorporateBond(3.0, "Alfa SpA");

		System.out.println("Scadenza: " + corporateBond.getMaturity());
		System.out.println("Emittente: " + corporateBond.getIssuer());
		System.out.println("Valore provvisorio: " + 
				corporateBond.getValue(new DiscountCurve()));
		
	}

}

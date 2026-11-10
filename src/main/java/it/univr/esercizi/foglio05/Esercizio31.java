package it.univr.esercizi.foglio05;

public class Esercizio31 {

	public static void main(String[] args) {
		Loan loan = new Loan(3.0, 1000.0);
		
		System.out.println("Il capitale: " + loan.getPrincipal());
		System.out.println("La scadenza: " + loan.getMaturity());

	}

}

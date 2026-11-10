package it.univr.esercizi.foglio02;

// Esercizio 05

public class PayooffDigitale {

	public static void main(String[] args) {
		double prezzoSottostante = 105.0;
		double strike = 100.0;
		
		boolean sottostanteSopraStrike = (prezzoSottostante >= strike);
		
		int payoff = sottostanteSopraStrike ? 1 : 0;
		
		System.out.println("Boolean: " + sottostanteSopraStrike);
		System.out.println("Payoff: " + payoff);
		

	}

}

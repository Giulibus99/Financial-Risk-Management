package it.univr.lezioni.lezione04;

import it.univr.lezioni.lezione03.CashFlow;

public class TestCashFlow {

	public static void main(String[] args) {
		/*
		 * Essendo public la classe CashFlow nel package it.univr.lezioni.lezione03
		 * posso richiamarla e creare nuove istanze
		 */
		CashFlow flusso1 = new CashFlow(1000.0, 7.0);
		/*
		 *  Se tolgo public dal metodo getValue() che si trova in un altro package 
		 *  non riesco a richiamarlo.
		 *  Senza access modifier il metodo è visibile solo all'interno del package
		 */
		double result = flusso1.getValue(2.0);
		System.out.println("Il risultato è: " + result);
		
	}

}

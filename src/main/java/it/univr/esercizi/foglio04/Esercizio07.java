package it.univr.esercizi.foglio04;

//Esercizio 7 – Rendita finanziaria main

public class Esercizio07 {

	public static void main(String[] args) {
		/*
		 * Cashflow cashflow1 = new Cashflow(100.0, 1.0);
		 * Cashflow cashflow2 = new Cashflow(100.0, 2.0);
		 * Cashflow cashflow3 = new Cashflow(100.0, 3.0);
		 * Cashflow[] array = new Cashflow[3];
		 * 
		 * array[0] = cashflow1;
		 * array[1] = cashflow2;
		 * array[2] = cashflow3;
		 */
		
		
		Cashflow[] array = new Cashflow[3];
		for (int i = 0; i < 3; i++) {
			array[i] = new Cashflow(100.0, i+1);	
		}
		
		Annuity results = new Annuity(array);
		
		System.out.println("Il totale nominale è: " + results.getTotalAmount());
		System.out.println("Il valore attuale è: " + results.getValue(0.05));
		
		
		

	}

}

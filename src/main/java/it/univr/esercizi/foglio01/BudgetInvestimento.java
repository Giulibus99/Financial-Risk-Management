package it.univr.esercizi.foglio01;
/*
 * Esercizio 19
 */

public class BudgetInvestimento {

	public static void main(String[] args) {
		int capitaleDisponibile = 1250;
		int prezzoQuotaEuro = 48;
		
		// Divisione intera
		int quoteIntere = capitaleDisponibile / prezzoQuotaEuro;
		// Modulo
		int liquiditaRimanente = capitaleDisponibile % prezzoQuotaEuro;
		
		System.out.println("Si sono acquistate " + quoteIntere + 
				" azioni e sono rimasti " + liquiditaRimanente + " euro");

	}

}

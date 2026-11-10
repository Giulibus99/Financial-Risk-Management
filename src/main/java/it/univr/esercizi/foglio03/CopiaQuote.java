package it.univr.esercizi.foglio03;

/*
 * Esercizio 13
 */
public class CopiaQuote {
	
	private int quote;
	
	private void configura(int quote) {
		this.quote = quote;
	}
	
	private void aggiungiQuote(int aumento) {
		this.quote += aumento;
	}
	
	private int leggiQuote() {
		return this.quote;
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println("TIPI PRIMITIVI");
		int quoteOriginali = 20;
		int quoteCopiate = quoteOriginali;
		quoteCopiate += 5; 
		System.out.println("Quote originali: " + quoteOriginali);
		System.out.println("Quote copiate: " + quoteCopiate);
		System.out.println();


		System.out.println("TIPI NON PRIMITIVI");
		CopiaQuote quoteOriginali1 = new CopiaQuote();
		CopiaQuote quoteCopiate1 = new CopiaQuote();
		
		quoteOriginali1.configura(20);
		quoteCopiate1.quote = quoteOriginali1.quote;
		quoteCopiate1.aggiungiQuote(5);
		System.out.println("Quote originali: " + quoteOriginali1.leggiQuote());
		System.out.println("Quote copiate: " + quoteCopiate1.leggiQuote());
		
		System.out.println("Cambio referenze perdendo il controllo si quoteCopiate1");
		quoteCopiate1 = quoteOriginali1;
		System.out.println("Quote originali: " + quoteOriginali1.leggiQuote());
		System.out.println("Quote copiate: " + quoteCopiate1.leggiQuote());
		System.out.println();
		System.out.println("Aggiungo 5 quote con quoteCopiate1");
		quoteCopiate1.aggiungiQuote(5);
		System.out.println("Quote originali: " + quoteOriginali1.leggiQuote());
		System.out.println("Quote copiate: " + quoteCopiate1.leggiQuote());
		

	}

}

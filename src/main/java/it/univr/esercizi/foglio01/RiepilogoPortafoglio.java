package it.univr.esercizi.foglio01;

/*
 * Esercizio 20 – Esercizio riepilogativo finanziario
Crea la classe RiepilogoPortafoglio. Parti da int numeroQuote = 17 e int prezzoQuotaEuro
= 6. Calcola il valore iniziale del portafoglio. Sottrai una commissione di 7 euro usando-=
.
Sul valore netto calcola quante unità intere da 10 euro si possono formare e quanti euro restano
usando / e %. Calcola poi il capitale medio per 3 strategie usando un casting a double. Crea
boolean capitaleAlmenoNovanta che verifichi se il valore netto è almeno 90 euro e boolean
capitaleSufficienteConResiduo che sia vera quando il capitale è almeno 90 euro e resta almeno
1 euro. Infine parti da int numeroOperazioni = 4 e incrementalo di uno con ++. Stampa tutti i
risultati in modo leggibile
 * 
 */
public class RiepilogoPortafoglio {

	public static void main(String[] args) {
		int numeroQuote = 17;
		int prezzoQuoteEuro = 6;
		int valorePortafoglio = numeroQuote * prezzoQuoteEuro;
		System.out.println("Il valore del portafoglio iniziale e': " + valorePortafoglio);
		
		int commissione = 7;
		valorePortafoglio -= commissione;
		System.out.println("Il valore del portafoglio dopo la commissione e': " + valorePortafoglio);
		
		int unitaIntere = valorePortafoglio / 10;
		int rimanenza = valorePortafoglio % 10;
		System.out.println("Posso formare " + unitaIntere + " unita' intere da 10 euro");
		System.out.println("Mi rimangono " + rimanenza + " euro");
		
		boolean capitaleAlmenoNovanta = valorePortafoglio >= 90;
		System.out.println("Il valore del portafoglio e'almeno di 90 euro? " + capitaleAlmenoNovanta);
		
		boolean capitaleSufficienteConResiduo = (valorePortafoglio >= 0 && rimanenza >= 1);
		System.out.println("Il valore del portafoglio e'almeno di 90 euro e rimane almeno 1 euro? " + 
				capitaleSufficienteConResiduo);
		
		int numeroOperazioni = 4;
		System.out.println("Numero operazioni iniziale " + numeroOperazioni++);
		System.out.println("Numero operazioni dopo incremento " + numeroOperazioni);
		
		

	}

}

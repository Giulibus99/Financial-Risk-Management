package it.univr.esercizi.foglio02;

// Esercizio 20

public class PianoInvestimentoCompleto {

	public static void main(String[] args) {
		int profiloRischio = 2;
		double capitale = 1000.0;
		double versamentoPeriodo = 150.0;
		int numeroPeriodi = 5;
		double obiettivo = 1800.0;
		double tassoPeriodo = 0.0;
		double rendimentoPeriodo = 0.0;
		boolean obiettivoRaggiunto; // false di default
		char codiceEsito;
		int capitaleIntero;
		
		switch (profiloRischio) {
		case 1:
			tassoPeriodo = 0.01;
			break;
		case 2:
			tassoPeriodo = 0.02;
			break;
		case 3:
			tassoPeriodo = 0.03;
			break;
		default:
			tassoPeriodo = 0.0;
			break;
		}
		System.out.println("Capitale: " + capitale + ". Tasso di periodo: " + tassoPeriodo);
		for (int i = 1; i <= numeroPeriodi; i++) {
			capitale += versamentoPeriodo;
			rendimentoPeriodo = capitale * tassoPeriodo;
			capitale += rendimentoPeriodo;
			System.out.println("Capitale aggiornato dopo il " + i + "° periodo: " + capitale);
		}
		
		// Check
		obiettivoRaggiunto = (capitale >= obiettivo);

		// Operatore ternario
		codiceEsito = obiettivoRaggiunto ? 'S' : 'N';
		
		// Come condizione nell'if potevo anche utilizzare codiceEsito
		if (obiettivoRaggiunto) {
			System.out.println("Obiettivo raggiunto");
		} else {
			System.out.println("Obiettivo non raggiunto");
		}
		
		capitaleIntero = (int)capitale; 
		System.out.println("Capitale finale: " + capitale);
		System.out.println("Codice esito: " + codiceEsito);
		System.out.println("Capitale intero: " + capitaleIntero);
	}

}

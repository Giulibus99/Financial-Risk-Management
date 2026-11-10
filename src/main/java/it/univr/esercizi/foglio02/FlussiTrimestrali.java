package it.univr.esercizi.foglio02;

// Esercizio 18

public class FlussiTrimestrali {

	public static void main(String[] args) {
		int flussoTotale = 0;
		int flussoTrimestre = 0;
		for (int i = 1; i <= 4; i++) {
			switch (i) {
			case 1:
				flussoTrimestre = 100;
				flussoTotale += flussoTrimestre;
				break;
			case 2:
				flussoTrimestre = 120;
				flussoTotale += flussoTrimestre;
				break;
			case 3:
				flussoTrimestre = 110;
				flussoTotale += flussoTrimestre;
				break;
			case 4:
				flussoTrimestre = 150;
				flussoTotale += flussoTrimestre;
				break;
			default:
				System.out.println("Error");
				break;
			}
			System.out.println("Flusso trimestre " + i + ": " + flussoTrimestre);
			
		}
		System.out.println("Flusso totale: " + flussoTotale);
	}

}

package it.univr.esercizi.foglio01;

// Esercizio 4

public class ImportoInEuro {

	public static void main(String[] args) {
		int importoCentesimi = 7384;
		
		int euro = importoCentesimi / 100;
		int resto = importoCentesimi % 100;
		
		System.out.println(euro + " euro interi sono contenuti in " + importoCentesimi + " centesimi.");
		System.out.println("Da questa conversione mi rimangono " + resto + " centesimi.");
	}

}

package it.univr.esercizi.foglio01;

// Esercizio 9

public class MovimentiAzionari {

	public static void main(String[] args) {
		int numeroAzioni = 100;
		
		// Acquisto 25 azioni
		numeroAzioni += 25;
		System.out.println("Numero azioni: " + numeroAzioni);
		
		// Vendita 10 azioni
		numeroAzioni -= 10;
		System.out.println("Numero azioni: " + numeroAzioni);
		
		// Frazionamento due-per-uno
		numeroAzioni *= 2;
		System.out.println("Numero azioni: " + numeroAzioni);
		
		// Frazionamento in 5 portafogli
		numeroAzioni /= 5;
		System.out.println("Numero azioni: " + numeroAzioni);
		
		// Formazione lotti da 7 azioni ciascuno
		numeroAzioni %= 7;
		System.out.println("Resto dopo la formazione di lotti da 7 azioni ciascuno: " + numeroAzioni);
		
	}

}

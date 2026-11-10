package it.univr.esercizi.foglio02;

// Esercizio 9

public class LivelloControllo {

	public static void main(String[] args) {
		int livelloAllerta = 3;
		
		switch (livelloAllerta) {
		case 3:
			System.out.println("Bloccare nuovi ordini");
		case 2:
			System.out.println("Richiedere una verifica aggiuntiva");
		case 1:
			System.out.println("Registrare il controllo");
			break;
		default:
			System.out.println("Default");
			break;
		}

	}

}

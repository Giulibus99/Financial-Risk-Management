package it.univr.esercizi.foglio02;

// Esercizio 07

public class ProfiloRischio {

	public static void main(String[] args) {
		int codiceProfilo = 2;
		
		switch (codiceProfilo) {
		case 1:
			System.out.println("Profilo prudente");
			break;
		case 2:
			System.out.println("Profilo bilanciato");
			break;
		case 3:
			System.out.println("Profilo dinamico");
			break;
		default:
			System.out.println("Codice non riconosciuto");
			break;
		}

	}

}

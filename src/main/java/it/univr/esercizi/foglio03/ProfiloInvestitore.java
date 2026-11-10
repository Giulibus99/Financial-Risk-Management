package it.univr.esercizi.foglio03;

/*
 * Esercizio 06
 */

public class ProfiloInvestitore {

	private int codiceProfilo;
	
	public void impostaCodice(int codice) {
		this.codiceProfilo = codice;
	}
	
	public void stampaProfilo() {
		switch (codiceProfilo) {
		case 1:
			System.out.println("Prudente");
			break;
			
		case 2:
			System.out.println("Bilanciato");
			break;
			
		case 3:
			System.out.println("Dinamico");
			break;

		default:
			System.out.println("Non riconosciuto");
			break;
		}
	}
	
	public static void main(String[] args) {
		ProfiloInvestitore investitore1 = new ProfiloInvestitore();
		ProfiloInvestitore investitore2 = new ProfiloInvestitore();
		
		investitore1.impostaCodice(2);
		investitore2.impostaCodice(5);
		
		investitore1.stampaProfilo();
		investitore2.stampaProfilo();

	}

}

package it.univr.esercizi.foglio02;

// Esercizio 08

public class TipoOrdine {

	public static void main(String[] args) {
		char tipoOrdine = 'A';
		
		switch (tipoOrdine) {
		case 'A':
			System.out.println("Ordine di acquisto");
			break;
		case 'V':
			System.out.println("Ordine di vendita");
			break;
		default:
			System.out.println("Carattere non riconosciuto");
			break;
		}

	}

}

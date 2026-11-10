package it.univr.esercizi.foglio01;

// Esercizio 2

public class OperazioniPortafoglio {

	public static void main(String[] args) {
		int capitaleEuro = 1000;
		int versamentoEuro = 200;
		int prezzoTitoloEuro = 73;
		int numeroTitoliDaAcquistare = 7;
		
		// Nuove variabili non date direttamente dal problema
		int capitaleDopoVersamento = capitaleEuro + versamentoEuro;
		int costoTitoli = prezzoTitoloEuro * numeroTitoliDaAcquistare;
		int capitaleResiduo = capitaleDopoVersamento - costoTitoli;
		int maxTitoliAcquistabili = capitaleDopoVersamento / prezzoTitoloEuro;
		int liquiditaNonInvestita = capitaleDopoVersamento % prezzoTitoloEuro;
		
		System.out.println("Capitale dopo il versamento: " + capitaleDopoVersamento);
		System.out.println("Costo dei titoli: " + costoTitoli);
		System.out.println("Capitale residuo: " + capitaleResiduo);
		System.out.println("Nr massimo di titoli acquistabili: " + maxTitoliAcquistabili);
		System.out.println("Liquidità rimanente: " + liquiditaNonInvestita);
		
	}

}

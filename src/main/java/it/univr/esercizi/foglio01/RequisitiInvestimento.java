package it.univr.esercizi.foglio01;
/*
 * Esercizio 12
 */
public class RequisitiInvestimento {

	public static void main(String[] args) {
		int capitaleDisponibile = 5000;
		int investimentoMinimo = 3000;
		double rendimentoAtteso = 0.06;
		double rendimentoMinimo = 0.05;
		boolean capitaleSufficiente = (capitaleDisponibile > investimentoMinimo);
		boolean rendimentoSufficiente = (rendimentoAtteso > rendimentoMinimo);
		
		System.out.println("Il capitale disaponibile e' sufficiente? " + capitaleSufficiente);
		System.out.println("Il rendimento atteso e' maggiore di quello minimo? " + rendimentoSufficiente);
		
		boolean entrambiRequisiti = (capitaleSufficiente && rendimentoSufficiente);
		boolean almenoUnRequisito = (capitaleSufficiente || rendimentoSufficiente);
		
		System.out.println("Entrambi i requisiti sono soddisfatti? " + entrambiRequisiti);
		System.out.println("Almeno un requisito e' soddisfatto? " + almenoUnRequisito);
	}

}

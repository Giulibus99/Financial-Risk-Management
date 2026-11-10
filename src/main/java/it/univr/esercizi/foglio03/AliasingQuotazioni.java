package it.univr.esercizi.foglio03;

/*
 * Esercizio 18 
 */

public class AliasingQuotazioni {

	public static void main(String[] args) {
		double[] primaSerie = {50.0, 52.0, 54.0};
		
		/*
		 * secondaSerie ha la reference sullo stesso array di primaSerie
		 * Anche gli array (struttura dati) hanno lo stesso comportamento
		 * dei tipi non primitivi.
		 */
		
		double[] secondaSerie = primaSerie;
		secondaSerie[1] = 60.0;
		
		System.out.println("Valore all'indice 1 di primaSerie: " + primaSerie[1]);
		System.out.println("Valore all'indice 1 di secondaSerie: " + secondaSerie[1]);
		System.out.println("Sono uguali: " + (primaSerie == secondaSerie));
	}

}

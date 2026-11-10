package it.univr.esercizi.foglio04;

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

// Esercizio 18

public class Esercizio18 {

	public static void main(String[] args) {
		double[] prezzi = {99,101,100, 102};
		
		SummaryStatistics statistiche = new SummaryStatistics();
		
		for (int i = 0; i < prezzi.length; i++) {
			statistiche.addValue(prezzi[i]);
		}
		
		System.out.println("Numero valori: " + statistiche.getN());
		System.out.println("Media: " + statistiche.getMean());
		System.out.println("Standard deviation: " + statistiche.getStandardDeviation());
	}

}

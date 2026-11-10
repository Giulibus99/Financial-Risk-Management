package it.univr.esercizi.foglio04;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/*
 * Esercizio 16
 */

public class Esercizio16 {
	public static void main(String[] args) {
		double[] prezzi =  {100.0, 102.0, 98.0, 101.0};
		DescriptiveStatistics metriche = new DescriptiveStatistics(prezzi);
		
		double media = metriche.getMean();
		double min = metriche.getMin();
		double max = metriche.getMax();
		
		System.out.println("La media è: " + media);
		System.out.println("Il minimo è: " + min);
		System.out.println("Il massimo è: " + max);
		
	}

}

package it.univr.esercizi.foglio04;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

// Esercizio 17

public class Esercizio17 {

	public static void main(String[] args) {
		DescriptiveStatistics rendimenti = new DescriptiveStatistics();
		
		double[] rendimentiInput = {0.01, -0.01, 0.03, 0.01};
		
		for (int i = 0; i < rendimentiInput.length; i++) {
			rendimenti.addValue(rendimentiInput[i]);
		}
		
		System.out.println("Media: " + rendimenti.getMean());
		System.out.println("Varianza: " + rendimenti.getVariance());
		System.out.println("Varianza popolazione: " + rendimenti.getPopulationVariance());
		System.out.println(rendimenti);
	}

}

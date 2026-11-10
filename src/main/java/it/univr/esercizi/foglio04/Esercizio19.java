package it.univr.esercizi.foglio04;

import net.finmath.functions.NormalDistribution;

public class Esercizio19 {

	public static void main(String[] args) {
		System.out.println("Probabilità minore di 0: " 
	+ NormalDistribution.cumulativeDistribution(0));
		System.out.println("Probabilità minore di 1: " 
				+ NormalDistribution.cumulativeDistribution(1));
		System.out.println("Quantile: " 
				+ NormalDistribution.inverseCumulativeDistribution(0.975));


	}

}

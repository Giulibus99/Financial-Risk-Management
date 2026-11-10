package it.univr.esercizi.foglio04;

import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

/** Due portafogli di Markowitz con tre titoli, senza vincoli sui segni. */
public class Esercizio20Prof {
	public static void main(String[] args) {
		double[] returns = {0.03, 0.07, 0.12};
		double[][] covarianceData = {
				{0.040, 0.006, 0.008},
				{0.006, 0.090, 0.012},
				{0.008, 0.012, 0.160}
		};
		double targetReturn = 0.06;
		RealVector mu = MatrixUtils.createRealVector(returns);
		RealVector ones = MatrixUtils.createRealVector(new double[] {1.0, 1.0, 1.0});
		RealMatrix sigma = MatrixUtils.createRealMatrix(covarianceData);
		RealMatrix sigmaInverse = new LUDecomposition(sigma).getSolver().getInverse();
		
		// Calcola prima le due moltiplicazioni con Sigma inversa.
		RealVector inverseOnes = sigmaInverse.operate(ones);
		RealVector inverseMu = sigmaInverse.operate(mu);
		double a = ones.dotProduct(inverseOnes);
		double b = ones.dotProduct(inverseMu);
		double c = mu.dotProduct(inverseMu);
	
		double determinant = a * c - b * b;
		
		// Pesi del portafoglio a varianza minima globale.
		RealVector minimumVariance = inverseOnes.mapMultiply(1.0 / a);
		
		
		// Pesi della soluzione con rendimento atteso prefissato al 6%.
		RealVector efficient = inverseOnes.mapMultiply(
				(c - b * targetReturn) / determinant).add(
						inverseMu.mapMultiply((a * targetReturn - b) / determinant));
		System.out.println("Portafoglio a varianza minima:");
		for (int i = 0; i < minimumVariance.getDimension(); i++) {
			System.out.println("Titolo " + (i + 1) + ": " + minimumVariance.getEntry(i));
		}
		System.out.println("Somma pesi: " + ones.dotProduct(minimumVariance));
		System.out.println("Rendimento atteso: " + mu.dotProduct(minimumVariance));
		System.out.println("Varianza: " + 
		minimumVariance.dotProduct(sigma.operate(minimumVariance)));
		System.out.println("Portafoglio con rendimento atteso del 6%:");
		for (int i = 0; i < efficient.getDimension(); i++) {
			System.out.println("Titolo " + (i + 1) + ": " + efficient.getEntry(i));
		}
		System.out.println("Somma pesi: " + ones.dotProduct(efficient));
		System.out.println("Rendimento atteso: " + mu.dotProduct(efficient));
		System.out.println("Varianza: " + efficient.dotProduct(sigma.operate(efficient)));
	}
}
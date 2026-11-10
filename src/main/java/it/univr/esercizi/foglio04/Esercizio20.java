package it.univr.esercizi.foglio04;

import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

// Esercizio 20
// NON TERMINATO

public class Esercizio20 {

	public static void main(String[] args) {
		double[] rendimenti = {0.03, 0.07, 0.12};
		double[][] varianzaCovarianza = {{0.040, 0.006, 0.008,
				0.006, 0.090, 0.012,
				0.008, 0.012, 0,160}};
		double[] uno = {1, 1, 1};
		
		RealVector mu =  MatrixUtils.createRealVector(rendimenti);
		RealMatrix sigma = MatrixUtils.createRealMatrix(varianzaCovarianza);
		RealVector uni =  MatrixUtils.createRealVector(uno);
		RealMatrix sigmaInverse = new LUDecomposition(sigma).getSolver().getInverse();
		
		

	}

}

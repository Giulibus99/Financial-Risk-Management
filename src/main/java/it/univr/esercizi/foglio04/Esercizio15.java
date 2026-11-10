package it.univr.esercizi.foglio04;

public class Esercizio15 {

	public static void main(String[] args) {
		double[] flussi = {5.0, 5.0, 100.0};
		double convexity = MyAnalyticFormulas.convexity(flussi, 0.05);
		
		System.out.println("La convessità è: " + convexity);
	}

}

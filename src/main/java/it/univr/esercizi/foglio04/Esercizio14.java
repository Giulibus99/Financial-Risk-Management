package it.univr.esercizi.foglio04;

public class Esercizio14 {

	public static void main(String[] args) {
		double[] flussi = {5.0, 5.0, 105.0};
		double duration = MyAnalyticFormulas.durationMacaulay(flussi, 0.05);
		double durationModificata = MyAnalyticFormulas.durationModificata(flussi, 0.05);
		
		System.out.println("La duration è: " + duration);
		System.out.println("La duration è: " + durationModificata);

	}

}

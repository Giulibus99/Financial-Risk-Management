package it.univr.esercizi.foglio04;

/*
 * Nuova classe con solo metodi static
 * per esercizi 10-15
 */

public class MyAnalyticFormulas {
	
	// Es.10
	public static double montanteSemplice(double capitale, double tasso, double anni) {
		return capitale * (1 + tasso * anni);
	}
	
	// Es.11
	public static double montanteComposto(double capitale, double tasso, double anni) {
		double result = capitale;
		for (int i = 0; i < anni; i++) {
			result *= (1 + tasso); 
		}
		return result;
	}
	
	// Es.12
	public static double prezzoZeroCoupon(double nominale, double rendimento, int anni) {
		double denominatore = (1 + rendimento);
		for (int i = 1; i < anni; i++) {
			denominatore *= (1 + rendimento);
		}
		return nominale / denominatore; 	
	}
	
	// Es.13
	public static double prezzoObbligazione(double[] flussi, double rendimento) {
		double prezzo = 0.0;
		double denominatore = (1 + rendimento);
		
		for (int i = 0; i < flussi.length; i++) {
			prezzo += flussi[i] / denominatore;
			denominatore *= (1 + rendimento); 
		}
		
		return prezzo;	
	}
	
	// Es. 14
	public static double durationMacaulay(double[] flussi, double rendimento) {
		double duration = 0.0;
		double denominatore = (1 + rendimento);
		
		for (int t = 0; t < flussi.length; t++) {
			duration += ((t+1) * flussi[t]) / denominatore;
			denominatore *= (1 + rendimento);
		}
		
		duration /= prezzoObbligazione(flussi, rendimento);
		
		return duration;
	}
	
	public static double durationModificata(double[] flussi, double rendimento) {
		return durationMacaulay(flussi, rendimento) / (1 + rendimento);
	}
	
	// Es. 15
	public static double convexity(double[] flussi, double rendimento) {
		double convexity = 0.0;
		double fattore;
		double denominatore = (1 + rendimento) * (1 + rendimento) * (1 + rendimento);
		for (int t = 1; t <= flussi.length; t++) {
			fattore = t * (t + 1);
			convexity += (fattore * flussi[t-1]) / denominatore;
			denominatore *= (1 + rendimento);
		}
		
		convexity /= prezzoObbligazione(flussi, rendimento);
		
		return convexity;
	}
	

}

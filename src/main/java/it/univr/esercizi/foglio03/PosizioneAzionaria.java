package it.univr.esercizi.foglio03;

/*
 * Esercizio 04
 */

public class PosizioneAzionaria {

	private int numeroAzioni;
	private double prezzoAcquisto;
	private double prezzoCorrente;
	
	
	public void configura(int nAzioni, double prezzoAcquisto, double prezzoCorreente){
		this.numeroAzioni = nAzioni;
		this.prezzoAcquisto = prezzoAcquisto;
		this.prezzoCorrente = prezzoCorreente;
	}
	
	public double calcolaProfitto(){
		return ((prezzoCorrente - prezzoAcquisto) * numeroAzioni);
	}
	
	public boolean inGuadagno(){
		return prezzoCorrente > prezzoAcquisto;
	}
	
	public static void main(String[] args) {
		PosizioneAzionaria posizione01 = new PosizioneAzionaria();
		posizione01.configura(40, 23.50, 25.0);
		
		double profitto = posizione01.calcolaProfitto();
		boolean guadagno = posizione01.inGuadagno();
		
		System.out.println("Il profitto è: " + profitto);
		System.out.println("La posizione è in guadagno? " + guadagno);
		

	}

}

package it.univr.esercizi.foglio03;

/*
 * Esercizio 05
 */

public class CommissioniBroker {

	private double controvalore;
	
	public void impostaControvalore(double controvalore){
		this.controvalore = controvalore;
	}
	
	public double calcolaCommissione(){
		double soglia = 10000.0;
		double commissione;
		if (controvalore >= soglia) {
			commissione = controvalore * 0.003; 
		}
		else {
			commissione = controvalore * 0.006; 
		}
		return commissione;
	}
	
	public static void main(String[] args) {
		CommissioniBroker commissione1 = new CommissioniBroker();
		CommissioniBroker commissione2 = new CommissioniBroker();
		
		commissione1.impostaControvalore(12000.0);
		commissione2.impostaControvalore(4000);
		
		System.out.println("La commissione 1 è: " + commissione1.calcolaCommissione());
		System.out.println("La commissione 2 è: " + commissione2.calcolaCommissione());

	}

}

package it.univr.esercizi.foglio03;

/*
 * Esercizio 08
 */

public class PrestitoRateale {

	private int debitoResiduo;
	private int rata;
	
	public void configura(int debitoResiduo, int rata) {
		this.debitoResiduo = debitoResiduo;
		this.rata = rata;
	}
	
	public int rimbrsaFinoAZero() {
		int numeroRate = 0;
		while (this.debitoResiduo > 0) {
			this.debitoResiduo -= this.rata;
			numeroRate++;
		}
		return numeroRate;
	}
	
	public static void main(String[] args) {
		PrestitoRateale debito = new PrestitoRateale();
		debito.configura(1800, 300);

		System.out.println("Il numero delle rate è: " + debito.rimbrsaFinoAZero() + 
				". Il debito residuo è: " + debito.debitoResiduo);
		
	}

}

package it.univr.esercizi.foglio02;

// Esercizio 17

public class ObiettivoInvestimento {

	public static void main(String[] args) {
		int capitale = 500;
		int versamentoAnnuale = 300;
		int obiettivo = 1500;
		boolean obiettivoSegnalato = false;
		int primoAnnoRaggiungimento = 0;
		
		for (int i = 1; i <= 6; i++) {
			capitale += versamentoAnnuale;
			/*
			 *  Entro nel for quando capitale è almeno pari all'obiettivo e 
			 *  obiettivo non ancora segnalato.
			 *  Variabile boolean inizializzata a false.
			 *  Con operatore AND per avere true devo avere due true
			 */
			if (capitale >= obiettivo && !obiettivoSegnalato) {
				primoAnnoRaggiungimento = i;
				// Assegnando valore true alla variabile boolean non accederò più all'if
				obiettivoSegnalato = true;
			}
		}
		System.out.println("L'obiettivo è stato raggiunto nell'anno : " + primoAnnoRaggiungimento);

	}

}

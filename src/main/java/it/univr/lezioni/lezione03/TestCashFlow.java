package it.univr.lezioni.lezione03;
/*
 * Il compito di questo file è quello di richiamare il file CashFlow
 * In quel file ho una classe che crea una nuova istanza di CashFlow
 * Devo richiamare il costruttore della classe CashFlow
 */

public class TestCashFlow {

	public static void main(String[] args) {
		/*
		 * Creaiamo due istanze della classe Cashflow 
		 */
		double amount1 = 5340.56;
		/*
		 *  Attenzione a non riportare 1/12 che sarebbe una divisione 
		 *  tra interi e il risultato sarebbe 0
		 */
		double maturity1 = 1.0/12; // Tra 1 mese
		// Creato un nuovo tipo di dato: CashFlow
		// Prenotata memoria per salvare un CashFlow
		CashFlow flow1;
				
		
		double amount2 = 3500.09;
		double maturity2 = 7.0/12;
		CashFlow flow2;
		
		// Creiamo una istanza della classe
		// Attenzione all'ordine degli input
		flow1 = new CashFlow(amount1, maturity1); // "new" serve per invocare il costrutture della classe
		flow2 = new CashFlow(amount2, maturity2);
		
		/*
		 * Invochiamo i metodi della classe
		 * SINTASSI:
		 * nomeIstanza.nomeMetodo(argomentiInput);
		 */
		// Richiamo i valori dei flussi di cassa senza attualizzarli
		flow1.getAmount();
		flow2.getAmount();
		// Calcolo il Present Value utilizzando il metodo della classe CashFlow
		double presentValue1 = flow1.getValue(0.02);
		double presentValue2 = flow2.getValue(0.04);
		System.out.println("Il PV del flusso 1: " + presentValue1);
		System.out.println("Il PV del flusso 2: " + presentValue2);
		
		/* 
		 * ALIAS: asttenzione con i tipi non primitivi/oggetti
		 * Manipoliamo/controlliamo gli oggetti attraverso le referenze
		 * REFERENZE (=indirizzi di memoria):
		 * flow1 e flow2 sono delle referenze "due telecomandi" che
		 * puntano (per adesso) a due oggetti diversi "due TV"
		 */
		
		// Stampo gli indirizzi di memoria iniziali
		System.out.println();
		System.out.println("Indirizzi di memoria");
		System.out.println(flow1);
		System.out.println(flow2);
		System.out.println("Sono uguali le referenze? " + (flow1 == flow2)); // Confronta gli indirizzi di memoria
		System.out.println("Sono uguali i valori? " + (flow1.amount == flow2.amount)); // Confronto il valore del flusso
		flow1.getAmount();
		flow2.getAmount();
		System.out.println();
		
		System.out.println("Cambio le refeerenze: flow1 punta a flow2");
		flow1 = flow2;
		/*
		 *  Adesso entrambi "i telecomandi" puntano allo stesso oggetto
		 *  Si è persa la referenza all'oggetto flow1, 
		 *  che verrà eliminato dfal garbage collector.
		 *  I valori degli oggetti NON si copiano, ma solo le referenze
		 *  
		 *  Diverso è il comportamento per i tipi primitivi che copiano i valori
		 */
		System.out.println(flow1);
		System.out.println(flow2);
		System.out.println("Sono uguali le referenze? " + (flow1 == flow2));
		flow1.getAmount();
		flow2.getAmount();
		
		
		System.out.println("NUOVO METODO 'changeValue'");
		System.out.println("Cambio il valore utilizzando flow1");
		flow1.changeAmount(10000.00);
		flow1.getAmount();
		flow2.getAmount();
		
		System.out.println("Cambio il valore utilizzando flow2");
		flow2.changeAmount(13000.00);
		flow1.getAmount();
		flow2.getAmount();
		
		
		/*
		 * ARRAYS: struttura dati
		 * Insieme di oggetti dello stesso tipo
		 * ! NON è possibile cambiare la lunghezza di un array (è statico)
		 */
		System.out.println();
		System.out.println("ARRAY");
		double[] esempioArray = {1.0, 2, 3.1}; // In modo dichiarativo
		System.out.println("Il primo elemento è: " + esempioArray[0]);
		// Ho inserito un int -> avviene un cast implicito a double
		System.out.println("Il secondo elemento è: " + esempioArray[1]);
		
		int length = 12; // Lunghezza dell'array
		// Questa operazione crea 12 celle che possono essere riempite con un intero
		int[] numeroRate = new int[length]; // Specifico la lunghezza che rimane costante
		// numeroRate[12] = 10; ISTRUZIONE NON AMMESSA, posizione 12 "out of bounds"
		
		// Popolo l'array con valori interi 
		for (int i = 0; i < length; i++) {
			// Accedo agli elementi dell'array. Primo elemento è in posizione 0
			numeroRate[i] = i*2;
		}
		
		/*
		 * Uso un ciclo for per leggere il contenuto di un array
		 */
		System.out.println("Stampo l'array");
		for (int i = 0; i < length; i++) {
			System.out.println(i+1 + "° elemento: " + numeroRate[i]);
		}
	}

}

package it.univr.lezioni.lezione03;

public class Cat {
	
	/*
	 * Ogni gatto ha un suo nome e una sua età. La cosa fondamantale da notare è che il valore di questi campi
	 * (anche detti attributi) può cambiare da gatto a gatto, ovvero, da oggetto di tipo Gatto a oggetto di tipo Gatto
	 * (nell'altra classe di questo pacchetto vedremo come costruire oggetti di questa classe e come dare un valore
	 * a questi campi).
	 * Notate anche che i campi sono dichiarati (con tipo e nome) fuori da qualsiasi metodo della classe: è così
	 * per tutte le classi.  
	 */
	// Attributi
	String name;
	int age;
	
	/*
	 * Quando un oggetto di tipo Gatto "chiama" questo metodo, avviene una stampa la cui ultima parola è la stringa
	 * "name" DI QUELLO SPECIFICO OGGETTO. Ovvero: l'effetto della chiamata del metodo dipende dall'oggetto che lo chiama.
	 * Ora, guardiamo l'intestazione del metodo: void vuol dire che non "ritorna" nulla, l'unica cosa che succede è una stampa;
	 * segue il nome del metodo, e poi due parentesi che contengono gli EVENTUALI input di cui ha bisogno il metodo per
	 * poter essere eseguito: in questo caso, nulla.
	 */
	
	// Metodi/funzioni della classe Cat
	// Metodo void: non ritorna uno specifico valore (non c'è il return)
	void printName() {
		System.out.println("The name of this cat is " + name);
	}
	
	/*
	 * Quando un oggetto di tipo Gatto "chiama" questo metodo, avviene una stampa che contiene il numero "age"
	 * DI QUELLO SPECIFICO OGGETTO. Come sopra, l'effetto della chiamata del metodo dipende dall'oggetto che lo chiama. 
	 */
	void printAge() {
		System.out.println("This cat is " + age + " years old");
	}
	
	/*
	 * Vedete che questa volta la parola chiave davanti al nome del metodo non è void, ma int: quando chiamiamo il metodo,
	 * l'effetto è che ci dà (ci "ritorna") una variabile di tipo int.
	 */
	int getAge() {
		return age;
	}

	/*
	 * E adesso è String: quando chiamiamo il metodo,l'effetto è che ci dà (ci "ritorna") un oggetto di tipo String, che è
	 * una classe di Java
	 */
	String getName() {
		return name;
	}
	
	/*
	 * Altro metodo che ogni oggetto di tipo Gatto può chiamare. Questa volta, la sua (semplice) implementazione non dipende
	 * dal valore di alcun campo della classe
	 */
    void eat() {
		System.out.println("We make the cat eating");
	}
	
    /*
     * Anche questo metodo non dipende dal valore di alcun campo della classe, ma questa volta dipende da una variabile di tipo
     * int DATA IN INPUT: vedete la specificazione dell'input dentro parentesi
     */
	void move(int howManyMeters) {
		System.out.println("We make the cat walk " + howManyMeters + " meters");
	}
}

package it.univr.lezioni.lezione05;

public class Studente extends Persona{
	
	private double[] votes;
	private String matricola;
	

	Studente(String name, String surname, int age, double[] votes, String matricola) {
		super(name, surname, age);
		this.votes = votes;
		this.matricola = matricola;
	}
	
	
	String getMatricola() {
		return matricola;
	}


	double getAverageVotes() {
		double sum = 0.0;
		
		for (int i = 0; i < votes.length; i++) {
			sum += votes[i];
		}
		
		return sum / votes.length; 
	}

	void increaseAge() {
		super.increaseAge();
		System.out.println("Ciao dal metodo di studente: " + super.getAge());
	}


}

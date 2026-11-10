package it.univr.esercizi.foglio05;


public class MortalityTable {
	
	private double[] deathProbabilities;
	
	MortalityTable() {
		this.deathProbabilities = (IstatMortalityData.getDeathRatesPerMille());
		
		for (int i = 0; i < deathProbabilities.length; i++) {
			deathProbabilities[i] = deathProbabilities[i] / 1000.0;
		}
	}
	
	MortalityTable(int firstAge, int secondAge){
		this();
		for(int i = firstAge; i <= secondAge; i++) {
			deathProbabilities[i] = deathProbabilities[i] * 1.1;
		}
	}
	
	int getNumberOfAges() {
		return deathProbabilities.length;
	}
	
	
	double getDeathProbability(int age) {
		return deathProbabilities[age];
	}
	
	double getAnnualSurvivalProbability(int age) {
		return (1.0 - getDeathProbability(age));
	}
	
	double getSurvivalProbability(int age, int years) {
		// Valore di default quando age = 1
		double survivalProbability = 1.0;
		
		/*
		 * Check di non superare la dimensione dall'array
		 * che è una struttura dati di dimensione statica
		 */
		
		int limite = ((age + years) < getNumberOfAges()) ? years : 
			(getNumberOfAges() - age);
		
		if (age >= 0) {
			for (int k = 0; k < limite; k++) {
				survivalProbability *= getAnnualSurvivalProbability(age + k);
			}
		}
		return survivalProbability;
	}

	double getDeathInYear(int age, int year) {
		double probability = 0.0;
		if (year >= 1) {
			probability = (getSurvivalProbability(age, year - 1) * 
					getDeathProbability(age + year - 1));
		}
		return probability;
	}
	
	double getDeathWithin(int age, int years) {
		return 1.0 - getSurvivalProbability(age, years);
	}
	
	double getExpectedDeaths(int age, int years, int insuredCount) {
		return insuredCount * getDeathWithin(age, years);
	}
	
	double getCurtateLifetime(int age, int horizon) {
		double result = 0.0;
		for (int k = 1; k <= horizon; k++) {
			result += getSurvivalProbability(age, k);
			
		}
		return result;
	}
	
}

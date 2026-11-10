package it.univr.lezioni.lezione05;

public class TestStudente {

	public static void main(String[] args) {
		double[] voti = {30.0, 20.0, 25.0};
		
		Studente studente1 = new Studente("Giulio", "Bezzi", 27, voti, "VR11111");
		
		System.out.println("Nome: " + studente1.getName());
		System.out.println("Cognome: " + studente1.getSurname());
		System.out.println("Eta': " + studente1.getAge());
		System.out.println("Media voti: " + studente1.getAverageVotes());
		System.out.println("Matricola: " + studente1.getMatricola());
		studente1.increaseAge();
		
		System.out.println("");
		
		Persona persona1 = new Persona("Fabio", "Rossi", 10);
		System.out.println("Eta': " + persona1.getAge());
		persona1.increaseAge();
		System.out.println("Eta': " + persona1.getAge());
		
		/*
		 * Il campo prova ha un modificatore di accesso protected
		 * Essendo questa classe "TestStudente" all'interno dello stesso package
		 * posso richiamarla andondola a modificare
		 */
		studente1.prova = 1;
		System.out.println("L'attributo prova: " + studente1.prova);
		
		/*
		 * Anche il metodo modifyProva() è protected ma posso usarlo comunque
		 */
		studente1.modifyProva();
		System.out.println("L'attributo prova modificato: " + studente1.prova);
		
		
	}

}

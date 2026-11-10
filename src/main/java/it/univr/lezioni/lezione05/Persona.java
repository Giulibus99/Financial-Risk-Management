package it.univr.lezioni.lezione05;

public class Persona {
	
	private String name;
	private String surname;
	private int age;
	protected int prova;
	
	Persona(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	
	void increaseAge() {
		this.age++;
	}
	
	protected void modifyProva() {
		this.prova = 100;
	}
	

}

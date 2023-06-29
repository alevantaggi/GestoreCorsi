package it.polito.tdp.corsi.model;

public class Studente {
	private Integer matricola;
	private String cognome;
	private String nome;
	private String CDS;
	
	public Studente(Integer matricola, String cognome, String nome, String cDS) {
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
		this.CDS = cDS;
	}

	public Integer getMatricola() {
		return matricola;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCDS() {
		return CDS;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", cognome=" + cognome + ", nome=" + nome + ", CDS=" + CDS + "]";
	}

	
}

package it.polito.tdp.corsi.model;

import java.util.Objects;

public class Corso {
	
	// Attributi della tabella corso
	private String codins;
	private int crediti;
	private String nomi;
	private int pd;
	
	public Corso(String codins, int crediti, String nomi, int pd) {
		this.codins = codins;
		this.crediti = crediti;
		this.nomi = nomi;
		this.pd = pd;
	}

	public String getCodins() {
		return codins;
	}

	public void setCodins(String codins) {
		this.codins = codins;
	}

	public int getCrediti() {
		return crediti;
	}

	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}

	public String getNomi() {
		return nomi;
	}

	public void setNomi(String nomi) {
		this.nomi = nomi;
	}

	public int getPd() {
		return pd;
	}

	public void setPd(int pd) {
		this.pd = pd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codins);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corso other = (Corso) obj;
		return Objects.equals(codins, other.codins);
	}

	@Override
	public String toString() {
		return "Corso [codins=" + codins + ", crediti=" + crediti + ", nomi=" + nomi + ", pd=" + pd + "]";
	}
	
	
	 
	
	

}

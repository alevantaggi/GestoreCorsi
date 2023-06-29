package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;
import it.polito.tdp.corsi.db.StudenteDAO;

public class Model {
	
	private CorsoDAO corsoDAO;
	private StudenteDAO studenteDAO;
	
	public Model() {
		this.corsoDAO= new CorsoDAO();
		this.studenteDAO= new StudenteDAO();
		
	}
	
	/**
	 * Chiede al DAO di interrogare il Database
	 * @param periodo
	 * @return {@code List}  la lista dei corsi
	 */
	public List<Corso>  getCorsoByPeriodo(int periodo){
		return corsoDAO.getCorsoByPeriodo(periodo);
	}
	
	public Map<Corso, Integer> getCorsoIscritti (int periodo){
		return corsoDAO.getCorsoIscritti(periodo);
	}
	
	public List<Studente> getIscrittiCorso(String codins){
		return studenteDAO.getIscrittiCorso(codins);
	}
	
	public List<Divisione> getDivisioneStudentiCorso(String codins){
		return studenteDAO.getDivisioneStudentiCorso(codins);
	}
}

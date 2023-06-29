package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.model.Corso;

public class CorsoDAO {
	
	public List<Corso> getCorsoByPeriodo(int periodo){
		String sql= "SELECT * FROM corso WHERE pd= ?";
		List<Corso> resulCorso= new ArrayList<>();
		
		try {
			Connection conn= ConnectDB.getConnection();
			PreparedStatement st= conn.prepareStatement(sql);
			st.setInt(1, periodo);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {			
				Corso c= new Corso(rs.getString("codins"),rs.getInt("crediti"),rs.getString("nome"),rs.getInt("pd"));			
				resulCorso.add(c);
			}
			
//			st.close();
//			rs.close();
			conn.close();
			return resulCorso;
			
		} catch (SQLException e) {
//			System.out.println("Error in corso DAO");
			e.printStackTrace();
			return null;
		}
	}
	
	public Map<Corso, Integer> getCorsoIscritti(int periodo){
		
		String sql= "SELECT c.codins, c.crediti,c.nome,c.pd,COUNT(*) AS numTot FROM iscrizione i, corso c WHERE c.pd=? AND c.codins=i.codins GROUP BY c.codins";
		Map<Corso, Integer> result= new HashMap<>();
		
		try {
			Connection conn= ConnectDB.getConnection();
			PreparedStatement st= conn.prepareStatement(sql);
			st.setInt(1, periodo);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Corso c= new Corso(rs.getString("codins"),rs.getInt("crediti"),rs.getString("nome"),rs.getInt("pd"));			
				result.put(c, rs.getInt("numTot"));
			}
			
//			st.close();
//			rs.close();
			conn.close();
			return result;
			
			
		} catch (Exception e) {
//			System.out.println("Error in corso DAO");
			e.printStackTrace();
			return null;

		}
	}

}

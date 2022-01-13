package fr.voyage.business;

import java.util.List;

import fr.voyage.gestionerreur.VoyageExeption;
import fr.voyage.model.Avion;

public interface IBusinessAvion {
	
	
	public Avion saveAvion(Avion avion) throws VoyageExeption;
	
	public List<Avion> showAllAvions();

}

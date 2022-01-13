package fr.voyage.utils;

import fr.voyage.model.Avion;
import fr.voyage.model.ModeleAvion;

public abstract  class CreatorAvion {
	
	protected Avion avion;
	
	protected ModeleAvion modeleAvion;
	
	public void setModeleAvion(ModeleAvion modeleAvion) {
		this.modeleAvion = modeleAvion;
	}

	public abstract Avion create () ;
}

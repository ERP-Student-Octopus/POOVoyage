package fr.voyage.utils;

import fr.voyage.model.Avion;
import fr.voyage.model.Boeing;

public class CreatorBoeing extends CreatorAvion {

	@Override
	public Avion create() {
		this.avion = new Boeing();
		this.avion.setModeleAvion(this.modeleAvion);
		this.avion.getModeleAvion().setValue(this.modeleAvion.getClass().getSimpleName());
		return this.avion;
	}

}

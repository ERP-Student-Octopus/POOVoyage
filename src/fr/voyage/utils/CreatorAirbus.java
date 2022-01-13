package fr.voyage.utils;

import fr.voyage.model.AirBus;
import fr.voyage.model.Avion;

public class CreatorAirbus extends CreatorAvion {

	@Override
	public Avion create() {
		this.avion = new AirBus();
		this.avion.setModeleAvion(this.modeleAvion);
		this.avion.getModeleAvion().setValue(this.modeleAvion.getClass().getSimpleName());
		return this.avion;
	}

}

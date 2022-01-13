package fr.voyage.utils;

import fr.voyage.model.Boeing737;
import fr.voyage.model.ModeleAvion;

public class CreatorBoeing737 extends CreatorModel{

	@Override
	public ModeleAvion create() {
		return new Boeing737();
	}

}

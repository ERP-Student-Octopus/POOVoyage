package fr.voyage.utils;

import fr.voyage.model.Boeing737;
import fr.voyage.model.Boeing737Max;
import fr.voyage.model.ModeleAvion;

public class CreatorBoeing738Max extends CreatorModel{

	@Override
	public ModeleAvion create() {
		return new Boeing737Max();
	}

}

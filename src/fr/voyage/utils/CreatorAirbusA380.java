package fr.voyage.utils;

import fr.voyage.model.AirbusA380;
import fr.voyage.model.ModeleAvion;

public class CreatorAirbusA380 extends CreatorModel{

	@Override
	public ModeleAvion create() {
		return new AirbusA380();
	}

}

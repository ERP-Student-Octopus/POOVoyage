package fr.voyage.utils;

import fr.voyage.model.AirbusA320;
import fr.voyage.model.ModeleAvion;

public class CreatorAirbusA320 extends CreatorModel{

	@Override
	public ModeleAvion create() {
		return new AirbusA320();
	}

}

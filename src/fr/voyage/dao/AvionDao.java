package fr.voyage.dao;

import java.time.LocalDate;

import fr.voyage.model.AbstractEntity;
import fr.voyage.model.Avion;
import fr.voyage.utils.CreatorAirbus;
import fr.voyage.utils.CreatorAirbusA320;
import fr.voyage.utils.CreatorAvion;

public class AvionDao extends GenericDao<Avion> {

	@Override
	protected AbstractEntity convertStringToInstance(String string) {
		String[] strings = string.split(",");
		CreatorAvion creatorAvion = new CreatorAirbus();
		creatorAvion.setModeleAvion(new CreatorAirbusA320().create());
		Avion avion = creatorAvion.create();
		int i = 0;
		for (String instanceString : strings) {
			if (i == 0)
				avion.setReference(instanceString);
			if (i == 1) {
				avion.setNumberPlace(Integer.parseInt(instanceString));
			}
			if (i == 2) {
				String[] tempDate = instanceString.split("-");
				avion.setDateCreation(LocalDate.of(Integer.parseInt(tempDate[0]), Integer.parseInt(tempDate[1]),
						Integer.parseInt(tempDate[2])));
			}
			
			//creatorAvion.setModeleAvion(new CreatorAirbusA320().create());


			
			i = i + 1;

		}

		return avion;
	}

}

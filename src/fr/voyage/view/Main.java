package fr.voyage.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import fr.voyage.business.AvionBusiness;
import fr.voyage.business.IBusinessAvion;
import fr.voyage.dao.AvionDao;
import fr.voyage.dao.GenericDao;
import fr.voyage.gestionerreur.VoyageExeption;
import fr.voyage.model.Avion;
import fr.voyage.utils.CreatorAirbus;
import fr.voyage.utils.CreatorAirbusA320;
import fr.voyage.utils.CreatorAirbusA380;
import fr.voyage.utils.CreatorAvion;
import fr.voyage.utils.CreatorModel;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		CreatorAvion creatorAvion=new CreatorAirbus();
		creatorAvion.setModeleAvion(new CreatorAirbusA320().create());
		Avion avion=creatorAvion.create();
	
		
		avion.setDateCreation(LocalDate.of(2000, 02, 10));
		avion.setNumberPlace(400);
		//avion.setReference("003");
		IBusinessAvion businessAvion=new AvionBusiness();
		try {
			businessAvion.saveAvion(avion);
		} catch (VoyageExeption e1) {
			e1.printStackTrace();
		}
		

		
//		List<Avion> avions=dao.showAll(Avion.class);
//		for (Avion avion : avions) {
//			System.out.println(avion.toString());
//		}
//		
		//System.out.println(avion);

	}

}

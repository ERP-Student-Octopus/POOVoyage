package fr.voyage.business;

import java.io.IOException;
import java.util.List;

import fr.voyage.dao.AvionDao;
import fr.voyage.dao.GenericDao;
import fr.voyage.gestionerreur.VoyageExeption;
import fr.voyage.model.Avion;

public class AvionBusiness extends GenericBusiness<Avion> implements IBusinessAvion{

	@Override
	protected GenericDao genericDao() {
		return new AvionDao();
	}

	@Override
	protected Class getEntityClassName() {
		return Avion.class;
	}

	@Override
	public Avion saveAvion(Avion avion) throws VoyageExeption {
		if (avion.getReference()==null || avion.getReference().isEmpty()) {
			throw new VoyageExeption("Reference vide !!!");
		}
		if (avion.getNumberPlace()==0 ) {
			throw new VoyageExeption("Précisz le nombre de place");
		}
		
		try {
			return super.save(avion);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Avion> showAllAvions() {
		// TODO Auto-generated method stub
		return null;
	}

}

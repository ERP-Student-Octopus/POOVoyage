package fr.voyage.model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Avion extends AbstractEntity implements Serializable {

	private String reference;

	private int numberPlace;

	private LocalDate dateCreation;

	private ModeleAvion modeleAvion;

	public Avion() {

	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getNumberPlace() {
		return numberPlace;
	}

	public void setNumberPlace(int numberPlace) {
		this.numberPlace = numberPlace;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

	public ModeleAvion getModeleAvion() {
		return modeleAvion;
	}

	public void setModeleAvion(ModeleAvion modeleAvion) {
		this.modeleAvion = modeleAvion;
	}

	@Override
	public String toString() {
		return reference + "," + numberPlace + "," + dateCreation + "," + modeleAvion;
	}

}

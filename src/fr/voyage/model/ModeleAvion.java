package fr.voyage.model;

import java.io.Serializable;

public abstract class ModeleAvion implements Serializable {

    private String value;
    
	

	public ModeleAvion() {
		
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	@Override
	public String toString() {
		return  value ;
	}
	
	
}

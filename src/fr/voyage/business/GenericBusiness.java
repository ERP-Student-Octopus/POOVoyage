package fr.voyage.business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import fr.voyage.dao.GenericDao;
import fr.voyage.model.AbstractEntity;
import fr.voyage.model.Avion;

public abstract class GenericBusiness<T extends AbstractEntity> {
	
	protected abstract GenericDao genericDao ();
	
	protected abstract Class getEntityClassName ();

	public T save(T entity) throws IOException {
		return (T) genericDao ().save(entity);

	}
	
	public List<T> showAll() throws FileNotFoundException, IOException{
		return genericDao ().showAll(getEntityClassName ());
	}

	
}

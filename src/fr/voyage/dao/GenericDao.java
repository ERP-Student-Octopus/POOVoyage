package fr.voyage.dao;

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

import fr.voyage.model.AbstractEntity;
import fr.voyage.model.Avion;

public abstract class GenericDao<T extends AbstractEntity> {
	
	protected abstract AbstractEntity convertStringToInstance (String string);

	public T save(T entity) throws IOException {
		FileWriter fw = null; 
		BufferedWriter bw = null; PrintWriter pw = null; 
		try { 
			fw = new FileWriter(entity.getClass().getSuperclass().getSimpleName() + ".txt", true);
			bw = new BufferedWriter(fw); 
			pw = new PrintWriter(bw);
			pw.println(entity.toString()); 
			System.out.println("Data Successfully appended into file");
			pw.flush(); } finally { try { pw.close(); 
			bw.close(); fw.close(); } 
			catch (IOException io) {
			}
		}

			
		return entity;

	}

	public List<T> showAll(Class cls) throws FileNotFoundException, IOException {
		List<T> list=new ArrayList<>();
		StringBuilder resultStringBuilder = new StringBuilder();
	    try (BufferedReader br
	      = new BufferedReader(new InputStreamReader(new FileInputStream(new File(cls.getSimpleName() + ".txt"))))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	        	if (line!=null && !line.isEmpty()) {
	        		Avion avion=(Avion) convertStringToInstance(line);
	        		//System.out.println(line);
	        		list.add((T) avion);
	        	}
	        	//
	        }
	    }
		return list;

	}
}

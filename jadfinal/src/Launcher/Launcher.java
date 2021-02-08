package Launcher;

import java.io.IOException;
import java.util.ArrayList;

import services.Persons;
import services.Reader;

public class Launcher {
	
	public static void main(String[] args) throws IOException {
		
		Reader r = new Reader();
		ArrayList<Persons> pers =new ArrayList<>();
		pers=r.getPersons();
		for (int i=0; i<pers.size();i++) {
			System.out.println(pers.get(i));
		}
		//System.out.println(pers.get(0));
	}
	

}

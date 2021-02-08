package Launcher;

import java.io.IOException;
import java.util.ArrayList;

import services.Persons;
import services.Reader;

public class Launcher {
	
	public static void main(String[] args) throws IOException {
		
		Reader r = new Reader();
		ArrayList<Persons> pers =new ArrayList<>();
		pers=r.getFirstThree(10);
		//pers=r.getPersons();
		for (int i=0; i<pers.size();i++) {
			System.out.println(pers.get(i));
		}
		//System.out.println(pers.get(0));
		
		System.out.println("All greater than 21");
		
		ArrayList<Persons> filtered = r.getAgeGreaterThan(21);
		for (int i=0; i<filtered.size();i++) {
			System.out.println(filtered.get(i));
		}		
		System.out.println("All age greater than 21 and height greater than 185");
		
		ArrayList<Persons> filtered2 = r.getAgeAndHeightGreaterThan(21, 185);
		for (int i=0; i<filtered2.size();i++) {
			System.out.println(filtered2.get(i));
		}
		
		System.out.println("Average age");
		System.out.println(r.avgAge());
		
		System.out.println("Postcode");
		ArrayList<Persons> postcode=r.getPostcode(94400);
		for (Persons i:postcode)
		{
			System.out.println(i);
		}
		
		System.out.println("Hair Color");
		ArrayList<Persons> hairs = r.getColorHair("Black");
		for (Persons i:hairs) {
			System.out.println(i);
		}
		
	}
	

}

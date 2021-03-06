package services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Reader {
	
	public ArrayList<Persons> getPersons() throws IOException{
		
		ArrayList<Persons> out = new ArrayList<>();
		
		List<String> listOfLines = Files.readAllLines(new File("data.csv").toPath());
		listOfLines.remove(0);
		
		for (String s:listOfLines) {
			String[] l = s.split(",");	
			//System.out.println(s); //we will have all file
			String[] d = l[2].split("/"); // to separate date
			//System.out.println(d[2]); here we are splitting the date in 3 parts d[0], d[1],d[2]
			
			Persons p = new Persons(l[0],l[1],LocalDate.of(Integer.parseInt(d[2]), Integer.parseInt(d[1]), Integer.parseInt(d[0])),Integer.parseInt(l[3]),Double.parseDouble(l[4]),Double.parseDouble(l[5]),l[6],l[7],l[8],Integer.parseInt(l[9]), Integer.parseInt(l[10]));
			out.add(p);
			
			//for (String parse : l) {
				//System.out.println(parse);
			//}
			
		}
		
		
		return out; 
	}
	
	public ArrayList<Persons> getFirstThree(int nOfLines) throws IOException{ //read three lines
		
		ArrayList<Persons> out = new ArrayList<>();
		
		List<String> listOfLines = Files.readAllLines(new File("data.csv").toPath());
		listOfLines.remove(0);
		

		if(nOfLines<0)
			System.out.println("invalid");
		else { 
			if(nOfLines>listOfLines.size())
				nOfLines=listOfLines.size();
	
			for (int i=0;i<nOfLines;i++) {
				String[] l = listOfLines.get(i).split(",");	
				//System.out.println(s); //we will have all file
				String[] d = l[2].split("/"); // to separate date
				//System.out.println(d[2]); here we are splitting the date in 3 parts d[0], d[1],d[2]
				
				Persons p = new Persons(l[0],l[1],LocalDate.of(Integer.parseInt(d[2]), Integer.parseInt(d[1]), Integer.parseInt(d[0])),Integer.parseInt(l[3]),Double.parseDouble(l[4]),Double.parseDouble(l[5]),l[6],l[7],l[8],Integer.parseInt(l[9]), Integer.parseInt(l[10]));
				out.add(p);
				
				//for (String parse : l) {
					//System.out.println(parse);
				//}
				
			}
		}
		
		
		return out; 
	}
	
	public ArrayList<Persons> getAgeGreaterThan(int val) throws IOException{
		ArrayList<Persons> out = new ArrayList<>();
		
		ArrayList<Persons> all  = getPersons();
		for(Persons i: all) {
			if(i.getAge()>val)
				out.add(i);
		}
		
		
		return out;
	}	
	public ArrayList<Persons> getAgeAndHeightGreaterThan(int age,double height) throws IOException{
		ArrayList<Persons> out = new ArrayList<>();
		
		ArrayList<Persons> all  = getPersons();
		for(Persons i: all) {
			if(i.getAge()>age && i.getHeight()> height)
				out.add(i);
		}
		
		
		return out;
	}
	
	public double avgAge() throws IOException{
		
		ArrayList<Persons> pers = new ArrayList<>();
		pers=getPersons();
		int avg=0;
		for (Persons i:pers) {
			avg+=i.getAge();
			
		}
		double result=avg/pers.size();
		return result;
	}
	
	
	public ArrayList <Persons> getPostcode(int postcode) throws IOException{
		
		ArrayList<Persons> out = new ArrayList<>();
		ArrayList<Persons> pers = getPersons();
		
		for (Persons i:pers) {
			if (postcode == i.getPostalCode()) {
				out.add(i);
			}
			
		}
		
		
		return out; 
	}
	
	
	
	public ArrayList<Persons> getColorHair(String color) throws IOException{
		
		ArrayList<Persons>out = new ArrayList<>();
		
		ArrayList<Persons> pers = getPersons();
		
		for (Persons i:pers) {
			if (color.equals(i.getHairColor())) {
				out.add(i);
			}
			
		}
		
		
		
		
		return out;
	}
	

}

package services;

import java.time.LocalDate;



public class Persons {
	
	private String fName;
	private String lName;
	private LocalDate dob; 
	private int age;
	private double height;
	private double weight;
	private String eyeColor;
	private String hairColor;
	private String emailAddress;
	private int postalCode;
	private int telephoneNumber;
	
	
	
	public Persons(String fName, String lName, LocalDate dob, int age, double height, double weight, String eyeColor,
			String hairColor, String emailAddress, int postalCode, int telephoneNumber) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.emailAddress = emailAddress;
		this.postalCode = postalCode;
		this.telephoneNumber = telephoneNumber;
	}
	
	public Persons() {
		
	}
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	@Override
	public String toString() {
		return "Persons [fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", age=" + age + ", height=" + height
				+ ", weight=" + weight + ", eyeColor=" + eyeColor + ", hairColor=" + hairColor + ", emailAddress="
				+ emailAddress + ", postalCode=" + postalCode + ", telephoneNumber=" + telephoneNumber + "]";
	}
	
	

}

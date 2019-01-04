package de.weihnachten;

public class Rentier {
	
	private double hunger;
	private double gGewicht;
	static int anzahlRentier = 0;
	
	public static void rentier(){	
		WeihnachtsObjekt.scanThings(anzahlRentier);
	}
	
	public double getHunger() {
		this.hunger = getHunger();
		return hunger;
	}
	
	public double getHunger(double gGewicht) {
		this.gGewicht = getHunger();
		return gGewicht;
	}
	
	public String asString() {
        String weightAsString = "";
        return weightAsString;
    }
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		System.out.println(anzahlRentier);
	}
}

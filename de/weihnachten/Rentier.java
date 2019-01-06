package de.weihnachten;

import java.util.Random;

public class Rentier extends GewichtigesWeihnachtsObjekt {
	
	private double hunger;
	private double gGewicht;
	private int weight;
	
	public Rentier(){
		super(0);
		double zufallsZahl = new Random().nextDouble();
		int zufallsZahlInt = new Random().nextInt(300);
		
		if(zufallsZahlInt <= 100) {
			zufallsZahlInt += 200;
		}if(zufallsZahlInt <= 200 && zufallsZahlInt >= 100) {
			zufallsZahlInt += 100;	
		}
		
		weight = zufallsZahlInt;
		hunger = 1.0 + (zufallsZahl * (2.0 - 1.0));
		
	}
	
	public double getHunger() {
		return this.hunger;
	}
	
	public double getHunger(double gGewicht) {
		this.gGewicht = getHunger();
		return gGewicht;
	}
	
	public String asString() {   
        return "Das Rentier hat " + this.getHunger() 
			+ " Hunger und ist " + weight + "KG schwer.";
    }
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	
	public static void main(String[] args) {
		
		Rentier rudolph = new Rentier();
		System.out.println(rudolph.asString()); 
		
		
	}

	
}

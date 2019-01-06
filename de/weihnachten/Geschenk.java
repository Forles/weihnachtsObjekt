package de.weihnachten;

import java.util.Random;

public class Geschenk extends GewichtigesWeihnachtsObjekt {

	private int anzahlGeschenke = 1;
	private int zufallsGewicht[] = new int[anzahlGeschenke];
	
	public Geschenk(){
		super(1);
		Random zufallsZahl = new Random();	
		
		//Zufälliges Gewicht für jedes Geschenk im Konstruktor!
		for(int i = 0; i < anzahlGeschenke; i++) {
			zufallsGewicht[i] = zufallsZahl.nextInt(20);
			i++;
		}		
	}

	public String toString() {
        int i = 0;
		return String.format("%s und %s", anzahlGeschenke, zufallsGewicht[i]);
    }
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		Geschenk geschenkEins = new Geschenk();
		Geschenk geschenkZwei = new Geschenk();
		System.out.println(geschenkEins.toString());
	}
}

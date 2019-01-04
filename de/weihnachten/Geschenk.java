package de.weihnachten;

import java.util.Random;

public class Geschenk extends GewichtigesWeihnachtsObjekt {

	static int anzahlGeschenke = 1;
	private static int zufallsGewicht[] = new int[anzahlGeschenke];
	
	public static void Geschenk(){
		WeihnachtsObjekt.scanThings(anzahlGeschenke);
		
		for(int i = 0; i<= anzahlGeschenke; i++) {
			Random zufallsZahl = new Random();
			zufallsGewicht[i] = zufallsZahl.nextInt(20);
			i++;
		}
		return;
	}
	
	public String toString() {
        return String.format("%s und %s", anzahlGeschenke, zufallsGewicht);
    }
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		System.out.println(anzahlGeschenke);
		
	}
}

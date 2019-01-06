package de.weihnachten;
//Einstiegspunkt des Programms

public class WeihnachtsObjekt {

	//Funktion erbt von GewichtigesWeihnachtsObjekt
	public int getGewicht() {
		return 0;
	}
	
	public boolean kannKollidieren(WeihnachtsObjekt object) {
		
		return false;
	}
		
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		//Deklaration der Variablen
		int anzahlRentiere = 0, anzahlGeschenke = 0, futtervorrat = 0;
		
		System.out.println("Hallo User"
				+ "\nBitte gib die Anzahl der Rentiere ein:");
		//Einlesen der Anzahl Rentiere
		anzahlRentiere = XMasUtils.readInt();
		System.out.println("Wunderbar, vielen Dank! \n"
				+ "Jetzt teile uns die Anzahl der Geschenke mit:");
		//Einlesen der Anzahl Geschenke
		anzahlGeschenke = XMasUtils.readInt();
		System.out.println("So viele Geschenke?? Wahnsinn!\n"
				+ "Als letztes benötigen wir noch den "
				+ "Futtervorrat für unsere Rentiere!\n"
				+ "Teile mir den Futtervorrat in Kilogramm mit.");
		//Einlesen des Futtervorrats
		futtervorrat = XMasUtils.readInt();
		
		//Ausgabe zur Überprüfung ob die Methoden dahinter funktionieren.
		System.out.println("Wir starten unser Weihnachten also mit "
				+ anzahlGeschenke 
				+ " Geschenken und "
				+ futtervorrat
				+ " KG Fressen, sowie  mit "
				+ anzahlRentiere
				+ " Rentieren. ");
		System.out.println("Unser Schlitten wiegt aktuell 85 KG");
		
	}
	
}

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
	
		int anzahlRentiere = 0, anzahlGeschenke = 0, futtervorrat = 0;
		
		System.out.println("Hallo User"
				+ "\nBitte gib die Anzahl der Rentiere ein:");
		anzahlRentiere = XMasUtils.readInt();
		System.out.println("Wunderbar, vielen Dank! \n"
				+ "Jetzt teile uns die Anzahl der Geschenke mit:");
		anzahlGeschenke = XMasUtils.readInt();
		System.out.println("So viele Geschenke?? Wahnsinn!\n"
				+ "Als letztes benötigen wir noch den "
				+ "Futtervorrat für unsere Rentiere!\n"
				+ "Teile mir den Futtervorrat in Kilogramm mit.");
		futtervorrat = XMasUtils.readInt();
		System.out.println("Wir starten unser Weihnachten also mit "
				+ anzahlGeschenke 
				+ "Geschenken und soviel KG "
				+ futtervorrat
				+ " und mit "
				+ anzahlRentiere
				+ " Rentieren. ");
		System.out.println("Unser Schlitten wiegt aktuell 85 KG");
		
	}
	
}

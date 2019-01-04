package de.weihnachten;
//Einstiegspunkt des Programms

public class WeihnachtsObjekt {

	//Funktion erbt von GewichtigesWeihnachtsObjekt
	public int getGewicht() {
		GewichtigesWeihnachtsObjekt.gewicht = getGewicht();
		return GewichtigesWeihnachtsObjekt.gewicht;
	}
	
	public static void kannKollidieren(WeihnachtsObjekt object) {
		
	}
	
	public static void scanThings(int eingabe) {
		java.util.Scanner scanner = new java.util.Scanner(System. in);
		eingabe = scanner.nextInt();
	}
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
	
		System.out.println("Hallo User"
				+ "\nBitte gib die Anzahl der Rentiere ein:");
		Rentier.rentier();
		System.out.println("Wunderbar, vielen Dank! \n"
				+ "Jetzt teile uns die Anzahl der Geschenke mit:");
		Geschenk.Geschenk();
		System.out.println("So viele Geschenke?? Wahnsinn!\n"
				+ "Als letztes benötigen wir noch den "
				+ "Futtervorrat für unsere Rentiere!\n"
				+ "Teile mir den Futtervorrat in Kilogramm mit.");
		GewichtigesWeihnachtsObjekt.gewichtigesWeihnachtsObjekt(0);
		System.out.println("Wir starten unser Weihnachten also mit "
				+ Geschenk.anzahlGeschenke 
				+ "Geschenken und soviel KG "
				+ GewichtigesWeihnachtsObjekt.gewicht
				+ " und mit "
				+ Rentier.anzahlRentier
				+ " Rentieren. ");
		System.out.println("Unser Schlitten wiegt aktuell 85 KG");
		
	}
	
}

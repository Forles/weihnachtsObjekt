package de.weihnachten;

public class WeihnachtsObjekt {

	public int getGewicht() {
		GewichtigesWeihnachtsObjekt.gewicht = getGewicht();
		return GewichtigesWeihnachtsObjekt.gewicht;
	}
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
}

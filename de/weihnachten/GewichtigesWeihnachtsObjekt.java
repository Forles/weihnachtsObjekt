package de.weihnachten;

public class GewichtigesWeihnachtsObjekt extends WeihnachtsObjekt{
	
	static int gewicht;
	
	public static int gewichtigesWeihnachtsObjekt(int gewicht){
		WeihnachtsObjekt.scanThings(gewicht);
		return gewicht;
	}
	
	public int getGewicht(){
		this.gewicht = getGewicht();
		return gewicht;
	}
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	
}

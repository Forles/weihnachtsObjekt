package de.weihnachten;

public class GewichtigesWeihnachtsObjekt extends WeihnachtsObjekt{
	
	private int gewicht;
	
	public GewichtigesWeihnachtsObjekt(int gewicht){
		this.gewicht = gewicht;
	}
	
	@Override
	public int getGewicht() {
		return this.gewicht;
	}
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	
}

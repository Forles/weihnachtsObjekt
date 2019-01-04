package de.weihnachten;

public class Weihnachtsmann extends WeihnachtsObjekt{
	
	private double futtervorrat;
	
	public Weihnachtsmann(Double futtervorrat , Schlitten schlitten) {
		
	}
	
	public boolean istFertig() {
		return true;
	}
	
	public boolean kannNochFuettern() {
		return true;
	}
	
	public void naechstesGeschenkAusliefern() {
		
	}
	
	public void fuettern() {
		
	}
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

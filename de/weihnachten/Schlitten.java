package de.weihnachten;

public class Schlitten extends WeihnachtsObjekt{
	
	
	private Geschenk[] geschenke;
	private Rentier[] rentiere;
	
	public Schlitten(Geschenk[] geschenke, Rentier[] rentiere){
		this.geschenke = geschenke;
		this.rentiere = rentiere;
	}
	
	/*public Geschenk getNaechstesGeschenk(){
	
		return Geschenk;
	}*/
	
	public int getGewicht() {		
		int gesamtGewicht = 0;
		for(Geschenk geschenk : geschenke) {
			gesamtGewicht += geschenk.getGewicht();
		}
		return gesamtGewicht;
	}
	
	public boolean kannFliegen() {
		return true;
	}
	
	public boolean istLeer() {
		return true;
	}
	
	public int getAnzahlRentiere(){		
		return this.rentiere.length;
	}
	
	public int getAnzahlGeschenke() {
		return this.geschenke.length;
	}
	
	/*public Rentier getRentier(int index) {
		
		return Rentier;
	}*/
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

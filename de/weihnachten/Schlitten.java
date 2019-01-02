package de.weihnachten;

public class Schlitten {
	
	int gewicht;
	int anzahlRentiere;
	int geschenke;
	
	public Schlitten(Geschenk[] geschenke, Rentier[] rentiere){
		
	}
	
	/*public void Geschenk getNaechstesGeschenk(){
	
	}*/
	
	public int getGewicht() {
		this.gewicht = getGewicht();
		return gewicht;
	}
	
	public boolean kannFliegen() {
		return true;
	}
	
	public boolean istLeer() {
		return true;
	}
	
	public int getAnzahlRentiere(){
		this.anzahlRentiere = getAnzahlRentiere();
		return anzahlRentiere;
	}
	
	public int getAnzahlGeschenke() {
		this.geschenke = getAnzahlGeschenke();
		return geschenke;
	}
	
	/*public Rentier getRentier(int index) {
		this.Rentier = getRentier();
		return Rentier;
	}*/
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

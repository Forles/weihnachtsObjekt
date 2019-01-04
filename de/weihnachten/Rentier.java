package de.weihnachten;

public class Rentier extends GewichtigesWeihnachtsObjekt {
	
	private double hunger;
	private double gGewicht;
	
	public Rentier(){
		super(80); //(int) XMasUtils.zufallsZahl(100, 200);	
		
		this.hunger = 2; //(int) XMasUtils.zufallsZahl(1, 2);	
	}
	
	public double getHunger() {
		return this.hunger;
	}
	
	public double getHunger(double gGewicht) {
		this.gGewicht = getHunger();
		return gGewicht;
	}
	
	public String asString() {
        
        return "Das Rentier hat " + this.getHunger() 
			+ " und ist " + this.getGewicht() + "KG schwer.";
    }
	
	//Zur Überprüfung der Klasse jeweils eine Main 
	public static void main(String[] args) {
		Rentier rudolph = new Rentier();
		System.out.println(rudolph.asString()); 
		
		
	}

	
}

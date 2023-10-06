package n1exercici1;

public class Instrument_vent extends Instrument{

	public Instrument_vent (String nom, int preu){
		super(nom, preu);
	}
	
	public String tocar() {
		return "Està sonant un instrument de vent";
	
}
}
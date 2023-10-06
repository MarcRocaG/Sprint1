package n1exercici1;

public class Instrument_percussio extends Instrument {

	public Instrument_percussio (String nom, int preu){
		super(nom, preu);
	}
	
	public String tocar() {
		return "Està sonant un instrument de percussió";
}
}
package n1exercici1;

public class Instrument_corda extends Instrument{

	public Instrument_corda (String nom, int preu){
		super(nom, preu);
	}
	
	public String tocar() {
		return "Està sonant un instrument de corda";
	}
}
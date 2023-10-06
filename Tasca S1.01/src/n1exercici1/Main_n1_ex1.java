package n1exercici1;

public class Main_n1_ex1 {
	
	public  Main_n1_ex1() {
	System.out.println ("Demostració");
	}
	static {
		System.out.println("Bloc estàtic 1");
	}
	static {
		System.out.println("Bloc estàtic 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main_n1_ex1();
		
		Instrument_vent flauta = new Instrument_vent("Flauta", 78);
		Instrument_percussio bateria = new Instrument_percussio("Bateria", 250);
		Instrument_corda violi = new Instrument_corda("Violí", 100);
		
		System.out.println (flauta.tocar());
		System.out.println (bateria.tocar());
		System.out.println (violi.tocar());
	}

}

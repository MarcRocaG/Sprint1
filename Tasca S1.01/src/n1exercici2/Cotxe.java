package n1exercici2;

public class Cotxe {

	static final String marca = "";
	static String model;
	final int potencia = 0;
	
	public Cotxe(String marca, String model, int potencia) {
	this.model = model;
	
	}

	public static void frenar() {
		System.out.println ("El vehicle està frenant");
	}

	public String accelerar() {
		return "El vehicle està accelerant";
	}
}

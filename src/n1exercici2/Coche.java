package n1exercici2;

public class Coche {

	private static final String marca = "Seat";
	private static String modelo;
	private final int potencia = 150;

	public Coche(String modelo) {

		this.modelo = modelo;
	}

	// Getter y setter
	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}

	// Metodos
	public static void frenar() {
		System.out.println("El vehículo está frenando");
	}

	public void acelerar() {
		System.out.println("El vehículo está acelerando");
	}

}

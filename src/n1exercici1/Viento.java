package n1exercici1;

public class Viento extends Instrumentos {

	public Viento(String nom, double precio) {
		super(nom, precio);

	}

	static {
		System.out.println("Está sonando un instrumento de viento");
	}

	// Metodos
	public void tocar() {
		System.out.println("Está sonando un instrumento de viento");

	}
}

package n1exercici1;

public class Viento extends Instrumento {

	public Viento(String nom, double precio) {
		super(nom, precio);
	}

	static {
		System.out.println("Está sonando un instrumento de viento");
	}
	{
		System.out.println("Está sonando un instrumento de viento");
	}

	// Metodos
	public void tocar() {
		System.out.println("Está sonando un instrumento de viento");

	}
}

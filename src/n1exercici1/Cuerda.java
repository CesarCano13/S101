package n1exercici1;

public class Cuerda extends Instrumento {

	public Cuerda(String nom, double precio) {
		super(nom, precio);
	}

	static {
		System.out.println("Está sonando un instrumento de cuerda");
	}
	{
		System.out.println("Está sonando un instrumento de cuerda");
	}

	// Metodos
	public void tocar() {
		System.out.println("Está sonando un instrumento de cuerda");

	}
}

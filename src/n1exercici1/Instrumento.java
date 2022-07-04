package n1exercici1;

public abstract class Instrumento {

	private String nom;
	private double precio;

	// Constructor
	public Instrumento(String nom, double precio) {
		this.nom = nom;
		this.precio = precio;
	}

	// Getter
	public String getNom() {
		return nom;
	}

	public double getPrecio() {
		return precio;
	}

	// Setter
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Metodos
	public abstract void tocar();

}

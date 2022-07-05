package n2exercici1;

public abstract class Telefono {

	private String marca;
	private String modelo;

	// Constructor
	public Telefono(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	// Getter
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	// Setter
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Metodos
	public abstract String llamar();

}

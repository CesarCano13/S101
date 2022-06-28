package n2exercici1;

public abstract class Telefono implements Camara, Reloj {

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

	// Interfaces
	@Override
	public String fotografiar() {
		String respuesta = "";
		return respuesta = "Se está haciendo una foto";
	}

	@Override
	public String alarma() {
		String respuesta = "";
		return respuesta = "Está sonando la alarma";
	}

	// Metodos
	public abstract String llamar();

}

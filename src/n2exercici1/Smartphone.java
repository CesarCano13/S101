package n2exercici1;

public class Smartphone extends Telefono implements Camara, Reloj {

	private String numTelefo;

	// Constructor
	public Smartphone(String marca, String modelo, String numTelefo) {
		super(marca, modelo);
		this.numTelefo = numTelefo;
	}

	// Getter
	public String getNumTelefo() {
		return numTelefo;
	}

	// Setter
	public void setNumTelefo(String numTelefo) {
		this.numTelefo = numTelefo;
	}

	// Metodos
	@Override
	public String llamar() {
		String respuesta = "";
		return respuesta = "Se está llamando al número " + numTelefo;
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

}

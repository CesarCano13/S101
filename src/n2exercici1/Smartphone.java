package n2exercici1;

public class Smartphone extends Telefono implements Camara, Reloj {

	// Constructor
	public Smartphone(String marca, String modelo) {
		super(marca, modelo);

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

package n1exercici2;

public class Coche {

	static final private String marca = "Seat";
	static private String modelo;
	final private int potencia = 150;

	// DEMOSTRAR DIFERENCIA ENTRE LOS 3? NO SE PUEDE CREAR CONSUSTRUCTOR DE NINGUNO

	public static void frenar() {
		System.out.println("El vehículo está frenando");
	}

	public void acelerar() {
		System.out.println("El vehículo está acelerando");
	}

}

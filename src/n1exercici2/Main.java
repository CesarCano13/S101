package n1exercici2;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("Ibiza");
		
		System.out.println(coche1.getMarca());
		System.out.println(coche1.getModelo());
		System.out.println(coche1.getPotencia());

		Coche.frenar();
		coche1.acelerar();

	}

}

package n2exercici1;

public class Main {

	public static void main(String[] args) {

		Smartphone movil1 = new Smartphone("Iphone", "13 PRO", "6554112542");

		System.out.println(movil1.getMarca() + " " + movil1.getModelo() + "\n" + movil1.llamar() + "\n"
				+ movil1.fotografiar() + "\n" + movil1.alarma());

		// ¿QUÉ MÉTODO ES MEJOR?
		// movil1.llamar();
		// movil1.fotografiar();
		// movil1.alarma();

	}

}

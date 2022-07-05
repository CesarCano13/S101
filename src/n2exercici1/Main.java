package n2exercici1;

public class Main {

	public static void main(String[] args) {

		Smartphone movil1 = new Smartphone("Iphone", "13 PRO");

		System.out.println(movil1.getMarca() + " " + movil1.getModelo() + "\n" + movil1.llamar("636152333") + "\n"
				+ movil1.fotografiar() + "\n" + movil1.alarma());

	}

}

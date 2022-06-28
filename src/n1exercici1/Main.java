package n1exercici1;

public class Main {

	public static void main(String[] args) {

		Cuerda cuerda1 = new Cuerda("violin", 3.45);
		Percusion percusion1 = new Percusion("tambor", 18.45);
		Viento viento1 = new Viento("flauta", 9.75);

		cuerda1.tocar();
		percusion1.tocar();
		viento1.tocar();

	}

}

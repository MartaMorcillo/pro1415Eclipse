package _02ejemplos._04animales;

public class Lobo extends Canino {
	@Override
	public void comer() {
		System.out.println("El lobo come liebres");
	}

	@Override
	public void hacerRuido(){
		System.out.println("ruido de lobo");
	}
}

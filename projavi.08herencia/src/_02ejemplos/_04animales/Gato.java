package _02ejemplos._04animales;

public class Gato extends Felino {
	
	@Override
	public void comer() {
		System.out.println("Como pienso para gatos	" );
	}

	@Override
	public void hacerRuido() {
		System.out.println("Ruido de gato");
		
	}
	
	public void vacunar(){
		System.out.println("Gato vacunado");
	}

}

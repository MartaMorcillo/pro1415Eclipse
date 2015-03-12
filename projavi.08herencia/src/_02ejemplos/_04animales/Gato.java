package _02ejemplos._04animales;

public class Gato extends Felino implements AnimalDomestico{
	
	@Override
	public void comer() {
		System.out.println("Como pienso para gatos	" );
	}

	@Override
	public void hacerRuido() {
		System.out.println("Ruido de gato");
		
	}
	@Override
	public void vacunar(){
		System.out.println("Gato vacunado");
	}
	@Override
	public void cortarPelo(){
		System.out.println("Gato se corta el pelo");
	}

}

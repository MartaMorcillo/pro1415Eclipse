package _02ejemplos._04animales;

public class Perro extends Canino implements Mascota{
	
	@Override
	public void comer() {
		System.out.println("El perro come pienso para perro");
	}
	
	@Override
	public void hacerRuido(){
		System.out.println("Ruido de perro");
	}
	
	@Override
	public void vacunar(){
		System.out.println("Perro vacunado");
	}
	
	public void sacarPaseo(){
		System.out.println("Perro sale a paseo");
	}

	@Override
	public void cortarPelo() {
		System.out.println("Perro se corta pelo");
		
	}

	@Override
	public void jugar() {
		System.out.println("El perro juega");
		
	}

}

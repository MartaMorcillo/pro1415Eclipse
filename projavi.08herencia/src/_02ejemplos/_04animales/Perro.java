package _02ejemplos._04animales;

public class Perro extends Canino {
	
	@Override
	public void comer() {
		System.out.println("El perro come pienso para perro");
	}
	
	@Override
	public void hacerRuido(){
		System.out.println("Ruido de perro");
	}
	
	public void vacunar(){
		System.out.println("Perro vacunado");
	}
	
	public void sacarPaseo(){
		System.out.println("Perro vacunado");
	}

}

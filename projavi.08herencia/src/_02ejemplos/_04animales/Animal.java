package _02ejemplos._04animales;

public abstract class Animal {
//	protected String tipo_comida;
//	protected String localizacion;
//	protected String tamanyo;
//	public Animal(String tc, String l, String t){
//		this.tipo_comida = tc;
//		this.localizacion = l;
//		this.tamanyo = t;
//	}
	//En una clase abstracta puede haber métodos abstractos y no abstractos
	public void dormir(){
		System.out.println("Durmiendo ... Zzzzzzz");
	}
	
	public abstract void hacerRuido();
	public abstract void comer();
	public abstract void rugir();
	
}

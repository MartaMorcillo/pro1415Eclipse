package genericidad;

public class Armario implements Comparable<Armario>{
	private String modelo;
	public Armario(String modelo){
		this.modelo = modelo;
	}
	public int compareTo(Armario o){
		return this.modelo.compareTo(o.modelo);
	}

}

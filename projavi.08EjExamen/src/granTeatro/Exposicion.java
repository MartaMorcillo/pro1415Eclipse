package granTeatro;

public class Exposicion extends Evento{
	private int sala;
	private String clausura;
	public Exposicion(String titulo,String fecha, String hora, int sala, String clausura){
		super(titulo,fecha,hora,0);
		this.sala = sala;
		this.clausura = clausura;
	}
	@Override
	public String toString(){
		return "EXPOSICION\n" + super.toString() +
				"\nSala: " + sala + 
				"\nClausura: " + clausura;
	}

}

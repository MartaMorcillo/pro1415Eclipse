package granTeatro;

public class ObraTeatro extends Evento{
	private String director;
	private String interpretes;
	public ObraTeatro(String titulo, String fecha, String hora, double precio, String director, String interpretes){
		super(titulo,fecha,hora,precio);
		this.director = director;
		this.interpretes = interpretes;
	}
	@Override
	public String toString(){
		return "OBRA TEATRO\n" + super.toString() + 
				"\nDirector: " + director + 
				"\nInterpretes: " + interpretes;
	}
}
		

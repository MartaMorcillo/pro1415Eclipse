package granTeatro;

public class ProduccionLocal extends Evento{
	private String organizador;
	
	public ProduccionLocal(String titulo,String fecha, String hora, String organizador){
		super(titulo,fecha, hora,0);
		this.organizador = organizador;
	}
	@Override
	public String toString(){
		return "PRODUCCION LOCAL\n" + super.toString() + 
				"\nOrganizador: " + organizador;
	}

}

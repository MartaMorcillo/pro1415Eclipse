package _02ejemplos._02alumnos;

public class Alumno  extends Persona {
	private String grupo;
	
	public Alumno(String dni, String nombre, String grupo){
		super(dni,nombre); //Constructor de persona
		this.grupo = grupo;
	}
	//Este constructor también sería válido
	public Alumno(String grupo){
		super("1111111111A","sin nombre");
		this.grupo = grupo;
	}
	
	public String getGrupo(){
		return grupo;
	}
	public void setGrupo(String grupo){
		this.grupo = grupo;
	}
}

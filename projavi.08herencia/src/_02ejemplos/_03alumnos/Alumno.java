package _02ejemplos._03alumnos;

public class Alumno  extends Persona {
	private String grupo;
	
	public Alumno(String dni, String nombre, String grupo){
		super(); //<--- Si no se pone, Java lo llama implícitamente
		this.grupo = grupo;
	}
	
	public String getGrupo(){
		return grupo;
	}
	public void setGrupo(String grupo){
		this.grupo = grupo;
	}
}

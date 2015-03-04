package _02ejemplos._03alumnos;

public class Persona {
	private String dni;
	private String nombre;
	// No tiene constructor explícito, luego tiene el constructor por defecto Persona();
	public String getDni(){
		return dni;
	}
	public String getNombre(){
		return nombre;
	}
	public void setDni(String dni){
		this.dni = dni;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	@Override
	public String toString(){
		return dni + " - " + nombre;
	}

}

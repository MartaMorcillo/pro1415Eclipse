package _02ejemplos._03alumnos;

public class Test {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.setDni("37356764");
		p.setNombre("pepe");
		System.out.println(p.toString());
		
		
		Alumno a = new Alumno("3489739487","juan","1º eso A");
		
		System.out.println(a.toString());
	}
}

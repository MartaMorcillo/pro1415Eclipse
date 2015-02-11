package _03ejercicios;

public class _15Notas {
	public static void main(String[] args) {
		double notas[][] = {
				{2,3,8,5,2},
				{7,7,8,9,8},
				{2,1,3,2,4}
		};
		String alumnos[]={"pepe","juan","pedro"};
		String asignaturas[] = {"PRO","BDA","SI","LMI","ED"};
		//mostrarPorAlumno(notas,alumnos,asignaturas);
		//mostrarPorAsignatura(notas,alumnos,asignaturas);
		mostrarMediaAlumnos(notas, alumnos);
		mostrarMediaAsignatura(notas, asignaturas);
	}
	public static void mostrarPorAlumno(double n[][],String alu[],String asig[]){
		System.out.println("Notas por alumno:");
		for (int i = 0; i < n.length; i++) {
			System.out.println("Alumno " + alu[i] + ": ");
			for (int j = 0; j < n[i].length; j++) {
				System.out.println("Nota de asignatura " + asig[j] + ": " + n[i][j]);
			}
		}
	}
	public static void mostrarPorAsignatura(double n[][],String alu[],String asig[]){
		System.out.println("Notas por asignatura");
		for (int j = 0; j < n[0].length; j++) {
			System.out.println("Asignatura " + asig[j] + ": ");
			for (int i = 0; i < n.length; i++) {
				System.out.println("Nota del alumno " + alu[i] + ": " + n[i][j]);
			}
		}
		
	}
	public static void mostrarMediaAlumnos(double n[][],String alu[]){
		System.out.println("Medias por alumno:");
		for (int i = 0; i < n.length; i++) {
			double suma = 0;
			for (int j = 0; j < n[i].length; j++) {
				suma += n[i][j];
			}
			System.out.println("Alumno " + alu[i] + ": " + (suma/n[i].length));
			
		}
	}
	public static void mostrarMediaAsignatura(double n[][],String asig[]){
		System.out.println("Medias por asignatura:");
		for (int j = 0; j < n[0].length; j++) {
			double suma = 0;
			for (int i = 0; i < n.length; i++) {
				suma += n[i][j];
			}
			System.out.println("Asignatura " + asig[j] + ": " + (suma/n.length));
			
		}
	}
}

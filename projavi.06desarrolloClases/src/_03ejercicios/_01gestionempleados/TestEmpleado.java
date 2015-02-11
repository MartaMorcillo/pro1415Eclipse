package _03ejercicios._01gestionempleados;

import java.util.Scanner;

public class TestEmpleado {
	
	public static void main(String[] args) {
		System.out.println(null instanceof Empleado);
		Empleado e1 = leerEmpleado();
		Empleado e2 = leerEmpleado();
		if(e1.getSueldo() < e2.getSueldo()) e1.incremetarSueldo(20);
		else if(e1.getSueldo() > e2.getSueldo()) e2.incremetarSueldo(20);
		
		if(e1.antiguedad()>e2.antiguedad()) e1.incremetarSueldo(10);
		else if(e1.antiguedad()<e2.antiguedad()) e2.incremetarSueldo(10);
		
		System.out.println(Empleado.calcularIRPF(e1.getSueldo()));
		System.out.println(Empleado.calcularIRPF(e2.getSueldo()));
		
		
	
	}
	public static Empleado leerEmpleado (){
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre: ");
		String n = tec.nextLine();
		System.out.println("Dni: ");
		String d = tec.nextLine();
		System.out.println("Año ingreso: ");
		int a = tec.nextInt();
		System.out.println("Sueldo: ");
		double s = tec.nextDouble();
		Empleado e = new Empleado(n,d,a,s);
		return e;
		
	}
}

package _03ejercicios._01gestionempleados;

import java.util.Calendar;

public class Empleado {
	private String nombre;
	private String dni;
	private int anyo;
	private double sueldo;
	
	public Empleado(String nombre, String dni, int anyo, double sueldo){
		this.nombre = nombre;
		this.dni = dni;
		this.anyo = anyo;
		this.sueldo = sueldo;
	}
	public String getNombre(){
		return nombre;
	}
	public String getDni(){
		return dni;
	}
	public int getAnyo(){
		return anyo;
	}
	public double getSueldo(){
		return sueldo;
	}
	public int antiguedad(){
		int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
		int antig;
		
		if(anyo > anyoActual) antig = 0;
		else antig = anyoActual - anyo;
		
		return antig;
	}
	public void incremetarSueldo(double porcentaje){
		sueldo = sueldo + sueldo * porcentaje / 100;
		//sueldo += sueldo * porcentaje / 100;
		//sueldo *= 1+(sueldo/100);
	}
	@Override
	public String toString(){
		return "Nombre: " + nombre + 
				"\nDni: " + dni + 
				"\nAño de ingreso: " + anyo +
				"\nSueldo bruto anual: " + sueldo + " €";
		
	}
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Empleado)) return false;
		//Empleado e = (Empleado)o;
//		if(dni.equals(e.dni)) return true;
//		else return false;
		return dni.equals(((Empleado)o).dni);
	}
	public int compareTo(Object o){
		Empleado e = (Empleado)o;
//		if(dni.compareTo(e.dni)>0) return 1;
//		else if(dni.compareTo(e.dni)<0) return -1;
//		else return 0;
		return dni.compareTo(e.dni);
	}
	public static double calcularIRPF(double salario){
		double irpf;
		if(salario <=800) irpf = 3;
		else if(salario <=1000) irpf = 10;
		else if(salario <=1500) irpf = 15;
		else if(salario <=2100) irpf = 20;
		else irpf = 30;
		return irpf;
	}
}

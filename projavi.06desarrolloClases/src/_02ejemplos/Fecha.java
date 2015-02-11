package _02ejemplos;

public class Fecha {
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha(int dia, int mes, int anyo){
		setDia(dia);
		setMes(mes);
		setAnyo(anyo);
	}
	public Fecha(int anyo){
		this(1,1,anyo);
	}
	public int getDia(){
		return dia;
	}
	public int getMes(){
		return mes;
	}
	public int getAnyo(){
		return anyo;
	}
	public void setDia(int dia){
		if(dia<1) this.dia = 1;
		else if (dia>31) this.dia = 31;
		else this.dia = dia;
	}
	public void setMes(int mes){
		if (mes<1) this.mes = 1;
		else if(mes>12) this.mes = 12;
		else this.anyo = anyo;
	}
	public void setAnyo(int anyo){
		if(anyo<1) this.anyo = 1;
		else this.anyo = anyo;
	}
	@Override
	public String toString(){
		return dia + "/" + mes + "/" + anyo;
	}
	@Override
	public boolean equals(Object o){
		if (o == null) return false;
		else if(this == o) return true;
		else if(!(o instanceof Fecha)) return false;
		else {
			Fecha f = (Fecha) o;
			if(this.dia == f.dia && this.mes == f.mes && this.anyo == f.anyo) 
				return true;
			else 
				return false;
		}
	}
	
	public int compareTo(Object o){
		Fecha f = (Fecha) o;
		if(this.anyo < f.anyo) return -1;
		else if(this.anyo > f.anyo) return 1;
		else if(this.mes < f.mes) return -1;
		else if(this.mes > f.mes) return 1;
		else if(this.dia < f.dia) return -1;
		else if(this.dia > f.dia) return 1;
		else return 0;
	}
	
	public static boolean esBisiesto(int a){
		if(a % 400 == 0 || a%4 == 0 && a%100!=0) return true;
		else return false;
	}
	public boolean esBisiesto(){
		if(this.anyo % 400 == 0 || anyo % 4 == 0 && anyo%100!=0) return true;
		else return false;
	}
	
	public static double calcularIRPF(double salario){
		double irpf;
		if(salario < 800) irpf = 3;
		else if(salario < 1000) irpf = 10;
		else if(salario < 1500) irpf = 15;
		else if(salario < 2100) irpf = 20;
		else irpf = 30;
		return irpf;
	}
}

package _03ejercicios._01aulas;

public class Aula implements Comparable<Aula> {
	private final static double METROS_POR_ALUMNO = 1.4;
	private int codigo;
	private double longitud;
	private double anchura;
	
	public Aula(int codigo, double longitud, double anchura){
		this.codigo = codigo;
		this.longitud = longitud;
		this.anchura = anchura;
	}

	public int capacidad(){
		return (int)(superficie() / METROS_POR_ALUMNO);
		
	}
	
	protected double superficie(){
		return longitud * anchura;
	}
	@Override
	public String toString(){
		return "Codigo: " + codigo +
				"\nSuperficie: " + superficie() + 
				"\nCapacidad: " + capacidad();
	}
	@Override
	public int compareTo(Aula a){
		int cap1 = this.capacidad();
		int cap2 = a.capacidad();
		if(cap1<cap2) return -1;
		else if(cap1>cap2) return 1;
		else {
			double sup1 = this.superficie();
			double sup2 = a.superficie();
			if(sup1<sup2) return 1;
			else if(sup1>sup2) return -1;
			else return 0;
		}
	}
}

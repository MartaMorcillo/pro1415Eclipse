package _03ejercicios._01aulas;

public class Aula {
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
}

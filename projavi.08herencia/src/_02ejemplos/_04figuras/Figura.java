package _02ejemplos._04figuras;

public abstract class Figura implements Comparable{
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	@Override 
	public String toString(){
		return "Area: " + String.format("%7.2f", calcularArea()) + 
				"\nPerimetro: " + String.format("%7.2f",calcularPerimetro());
	}
	@Override 
	public final int compareTo(Object o){
		Figura f = (Figura)o;
		double area1 = this.calcularArea();
		double area2 = f.calcularArea();
		if(area1 < area2) return -1;
		else if(area1 > area2) return 1;
		else return 0;
	}
}

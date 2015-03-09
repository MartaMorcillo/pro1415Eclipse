package _02ejemplos._04figuras;

public class Circulo extends Figura{
	public double radio;
	public Circulo(double r){
		radio = r;
	}
	public double getRadio(){
		return radio;
	}
	public void setRadio(double r){
		radio = r;
	}
	@Override
	public double calcularArea() {
		return Math.PI * radio * radio;
	}
	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	@Override 
	public String toString(){
		return "Circulo"+
				"\nRadio: " + radio + 
				"\n"+super.toString();
	}
		
}

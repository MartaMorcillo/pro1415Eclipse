package _03ejercicios._01aulas;

public class AulaInformatica extends Aula {
	private final static int ALUMNOS_POR_ORDENADOR = 2;
	private int numPc;
	public AulaInformatica(int codigo, double longitud, double anchura, int numPc){
		super(codigo,longitud,anchura);
		this.numPc = numPc;
	}
	
	@Override
	public int capacidad(){
		return numPc * ALUMNOS_POR_ORDENADOR;
	}
	@Override
	public String toString(){
		return "Aula de informática\n" + super.toString();
	}
}

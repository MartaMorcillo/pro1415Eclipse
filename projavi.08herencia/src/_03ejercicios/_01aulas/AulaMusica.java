package _03ejercicios._01aulas;

public class AulaMusica extends Aula {
	private boolean tienePiano;
	public AulaMusica(int codigo, double longitud, double anchura, boolean tienePiano){
		super(codigo,longitud,anchura);
		this.tienePiano = tienePiano;
	}
	@Override
	public String toString(){
		return "Aula de musica\n" + super.toString();
	}

}

package _03ejercicios._05academia;

import _03ejercicios._01aulas.Aula;
import _03ejercicios._01aulas.AulaInformatica;
import _03ejercicios._01aulas.AulaMusica;

public class TestAcademia {
	public static void main(String[] args) {
		Academia a = new Academia("prueba","Calle Murillo, 5");
		a.ampliar(new Aula(1,10,10));
		a.ampliar(new AulaInformatica(2, 10, 10, 5));
		a.ampliar(new AulaMusica(3, 10, 15,false));
		a.ampliar(new AulaInformatica(4,11,11,5));
		
		a.ordenar();
		System.out.println(a);
		
		
	}

}

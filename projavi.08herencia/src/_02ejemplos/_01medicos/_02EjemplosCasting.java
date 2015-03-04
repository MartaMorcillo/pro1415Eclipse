package _02ejemplos._01medicos;
import java.util.*;

public class _02EjemplosCasting {
	public static void main(String[] args) {
		//Castin implicito
		Object o = new Cirujano();
		
		//Casting explícito: permite guardar cualquier objeto en cualquer otro
		//si los tipos de la izq y la dcha son compatibles
		Medico m = (Medico) o;
		
		//Pero no hacen magia: pueden dar error de ejecución aunque compilen bien
		MedicoDeCabecera mc = (MedicoDeCabecera) o;
		String s = (String) o;
		Scanner e = (Scanner) o;
	}

}

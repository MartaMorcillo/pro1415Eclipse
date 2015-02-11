package _03ejercicios;

public class _09Tocayos {
	public static void main(String[] args) {
		String g1[] = {"a","b","c","d"};
		String g2[] = {"a","c","e","f","g"};
		int cont = 0;
		//Recorrer g1
		for (int i = 0; i < g1.length; i++) {
			// Buscar g1[i] en g2
			boolean enc = false;
			for (int j = 0; j < g2.length && !enc; j++) {
				if (g1[i].equals(g2[j])) {
					enc = true;
					cont ++;
					System.out.println(g1[i] + " tiene tocayo en el segundo grupo");
				}
				
			}
		}
		System.out.println("Hay " + cont + " personas con tocayo");
	}

}

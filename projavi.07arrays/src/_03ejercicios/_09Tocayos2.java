package _03ejercicios;

public class _09Tocayos2 {
	
	//Realizando la búsquda en un método aparte
	public static void main(String[] args) {
		String g1[] = {"a","b","c","d"};
		String g2[] = {"a","c","e","f","g"};
		int cont = 0;
		//Recorrer g1
		for (int i = 0; i < g1.length; i++) {
			if(esta(g1[i],g2)){
				System.out.println(g1[i] + " tiene tocayo");
				cont ++;
			}
		}
		System.out.println("Hay " + cont + " personas con tocayo");
	}
	public static boolean esta(String x, String v[]){
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].equals(x)) enc = true;
		}
		return enc;
	}

}

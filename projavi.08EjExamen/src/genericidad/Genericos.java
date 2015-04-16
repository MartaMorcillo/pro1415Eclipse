package genericidad;

public class Genericos {
	public static boolean primeroEsMinimo(Object v[]){
		boolean enc = false;
		for (int i = 1; i < v.length && !enc; i++) {
			if(((Comparable)v[i]).compareTo(v[0])<0) enc = true;
		}
		if(enc) return false;
		else return true;
		//return !enc;
	}
	
	public static <T extends Comparable<T>> boolean primeroEsMinimo2(T v[]){
		boolean enc = false;
		for (int i = 1; i < v.length && !enc; i++) {
			if(v[i].compareTo(v[0])<0) enc = true;
		}
		if(enc) return false;
		else return true;
	}

	
	public static void main(String[] args) {
		Armario v[] = {new Armario("A"), new Armario("B"), new Armario("C")};
		System.out.println(primeroEsMinimo(v));
		System.out.println(primeroEsMinimo2(v));
	}
}

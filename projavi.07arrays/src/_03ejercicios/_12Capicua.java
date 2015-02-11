package _03ejercicios;

public class _12Capicua {
	public static void main(String[] args) {
		String v1[]= {};
		String v2[] = {"a","b","c","c","b","a"};
		String v3[] = {"a","b","c","x","b","a"};
		
		System.out.println(esCapicua(v1));
		System.out.println(esCapicua(v2));
		System.out.println(esCapicua(v3));
		
	}
	public static boolean esCapicua (String v[]){
		int i=0;
		int j=v.length-1;
		
		boolean enc = false;
		while(i<j && !enc){
			if(!v[i].equals(v[j])) enc = true;
			else {
				i++;
				j--;
			}
		}
		
		if(enc) return false; //Si hay alguna diferencia, NO es capicua
		else return true;
		// o lo que es lo mismo ...
		//return !enc;
	}

}

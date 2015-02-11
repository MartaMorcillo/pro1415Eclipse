package _03ejercicios;

public class _13SecuenciaDe3 {
	public static void main(String[] args) {
		
		int v1[] = {9,2,8,1,2,3,6,3,9};
		int pos = secuenciaDe3(v1);
		if(pos!=-1) System.out.println(v1[pos] + " " +v1[pos+1] + " " + v1[pos+2]);
		else System.out.println("No hay secuencia de tres");
		
		int v2[] = {1,1,1,1,1,1};
		pos = secuenciaDe3(v2);
		if(pos!=-1) System.out.println(v2[pos] + " " +v2[pos+1] + " " + v2[pos+2]);
		else System.out.println("No hay secuencia de tres");
	}
	public static int secuenciaDe3 (int v[]){
		boolean enc=false;
		int i;
		for (i = 0; i < v.length-2 && !enc; i++) {
			if(v[i+1] == v[i]+1 && v[i+2]==v[i]+2) enc = true;
		}
		if (enc) return i-1;
		else return -1;
	}

}

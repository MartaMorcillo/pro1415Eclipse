package _03ejercicios;

import java.util.Arrays;

public class _05SumasParciales {
	public static void main(String[] args) {
		int v[] = {1,7,2,9,4};
		int x[] = sumaParcial(v);
		System.out.println(Arrays.toString(x));
		//De otra forma: al vuelo
		System.out.println(Arrays.toString(sumaParcial(v)));
	}
	public static int[] sumaParcial(int v[]){
		int s[] = new int[v.length];
		
		s[0]=v[0];
		for (int i = 1; i < v.length; i++) {
			s[i]= s[i-1]+v[i];
		}
		return s;
	}

}

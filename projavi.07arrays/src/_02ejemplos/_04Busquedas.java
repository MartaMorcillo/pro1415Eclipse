package _02ejemplos;

public class _04Busquedas {
	public static void main(String[] args) {
		int v1[] = {1,3,8,20,29};
		int v2[] = {10,-1,3,20,12};
		System.out.println(todoPositivo(v1));
		System.out.println(todoPositivo(v2));
		
	}
	
	//Devuelve true si TODOS los elementos de v son mayores que cero
	public static boolean todoPositivo(int v[]){
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i]<=0) enc = true;
			
		}
		if(enc) return false;
		else return true;
		//return !enc;
	}
	public static boolean todoPositivo2(int v[]){
		boolean hayNegativo = false;
		for (int i = 0; i < v.length && !hayNegativo; i++) {
			if(v[i]<=0) hayNegativo = true;
			
		}
		if(hayNegativo) return false;
		else return true;
		//return !enc;
	}
	public static boolean todoPositivo3(int v[]){
		boolean todoPositivo = true;
		for (int i = 0; i < v.length && todoPositivo; i++) {
			if(v[i]<=0) todoPositivo = false;
			
		}
		if(todoPositivo) return true;
		else return false;
		//return todoPositivo;
	}
	public static boolean todoPositivo4(int v[]){
		for (int i = 0; i < v.length; i++) {
			if(v[i]<=0) return false;
		}
		return true;
		//return todoPositivo;
	}
	public static boolean esCreciente(int v[]){
		boolean enc = false;
		for (int i = 0; i < v.length -1 && !enc; i++) {
			if(v[i]>=v[i+1]){
				enc = true;
			}
		}
		if(enc) return false;
		else return true;
		//return !enc;
		
	}
	public static boolean hayPicos(int v[]){
		boolean enc = false;
		for (int i = 1; i < v.length-1; i++) {
			if(v[i]>v[i-1] && v[i]>v[i+1]) enc = true;
			
		}
		if(enc) return true;
		else return false;
		//return enc;
	}
}

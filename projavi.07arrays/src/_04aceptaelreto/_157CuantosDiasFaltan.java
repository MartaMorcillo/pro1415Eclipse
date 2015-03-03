package _04aceptaelreto;

import java.util.Scanner;

public class _157CuantosDiasFaltan {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int diasMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int casos = tec.nextInt();
		for (int i = 0; i <casos; i++) {
			int dia = tec.nextInt();
			int mes = tec.nextInt();
			
			int suma = -dia;
			for (int j = mes; j<diasMes.length;j++){
				suma += diasMes[j];
			}
			System.out.println(suma);
		}
	}

}

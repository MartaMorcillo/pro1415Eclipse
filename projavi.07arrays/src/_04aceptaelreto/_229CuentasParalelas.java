package _04aceptaelreto;

import java.util.Scanner;

public class _229CuentasParalelas {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		boolean continuar;
		do {
			continuar= resolverCaso();
		} while(continuar);
	}
	public static boolean resolverCaso(){
		int numMov = tec.nextInt();
		if(numMov==0) return false; //Se ha indicado terminar
		
		//leer movimientos y determinar la suma
		int movimientos[] = new int[numMov];
		int suma = 0;
		for (int i = 0; i < movimientos.length; i++) {
			movimientos[i]=tec.nextInt();
			suma += movimientos[i];
		}
		//Array con las sumas de izquierda a derecha
		
		int sumasIzq[] = new int[numMov];
		int sumasDer[] = new int[numMov];
		sumasIzq[0] = movimientos[0];
		sumasDer[0] = suma - sumasIzq[0];
		for (int i = 1; i < movimientos.length; i++) {
			sumasIzq[i] = sumasIzq[i-1] + movimientos[i];
			sumasDer[i] = suma - sumasIzq[i];
		}
		
		//contar veces que las cuentas son paralelas
		int cont =0;
		for (int i = 0; i < movimientos.length; i++) {
			if(sumasIzq[i] == sumasDer[i]) cont++;
		}
		if (suma==0) cont++;
		System.out.println(cont);
		return true;
	}
}

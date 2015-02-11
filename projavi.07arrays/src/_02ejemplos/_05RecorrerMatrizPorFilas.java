package _02ejemplos;

public class _05RecorrerMatrizPorFilas {
	public static void main(String[] args) {
		int m[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Fila " + i + " columna " + j + " =  " + m[i][j]);
			}
		}
	}
	
}

package _02ejemplos;

public class _07Paddel {
	public static void main(String[] args) {
		String paddel[][] = {
				{"Miguel","Paco"},
				{"Roberto","Victor"},
				{"Angel","Vicente"},
				{"Antonio","Daniel"},
				{"Luis","Carlos"}
		};
		
		for (int i = 0; i < paddel.length; i++) {
			System.out.println("Equipo " + (i+1) + ": ");
			for (int j = 0; j < paddel[i].length; j++) {
				System.out.println("  - " + paddel[i][j]);
				
			}
		}
	}
}

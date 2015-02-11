package _06juegdeocartas;

import java.util.Scanner;

public class JuegoDeCartas {

	public static int ganadora(Carta c1, Carta c2, int paloTriunfo) {
		if (c1.equals(c2))
			return 0;
		if (c1.getPalo() == c2.getPalo()) {
			// Mismo palo
			if (c1.getValor() == 1)
				return -1; // Gana la 1ª
			else if (c2.getValor() == 1)
				return 1; // Gana la 2ª
			else if (c1.getValor() > c2.getValor())
				return -1; // gana la 1º
			else
				return 1; // gana la 2ª
		} else {
			// Distinto palo
			if (c1.getPalo() == paloTriunfo)
				return -1; // gana la 1ª
			else if (c2.getPalo() == paloTriunfo)
				return 1;
			else
				return -1; // gana la 1ª
		}
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce palo (0 - 3): ");
		int palo = tec.nextInt();
		System.out.println("Introduce valor (1 - 12): ");
		int valor = tec.nextInt();
		try {
			Carta cUsuario = new Carta(palo, valor);
			System.out.println("Carta del usuario : " + cUsuario.toString());

			Carta cOrdenador = new Carta();
			System.out.println("Carta del ordenador: " + cOrdenador.toString());

			int triunfo = (int) (Math.random() * 4);
			System.out.println("Triunfo: " + triunfo);

			int ganadora = ganadora(cUsuario, cOrdenador, triunfo);
			if (ganadora == 0)
				System.out.println("Empate");
			else if (ganadora == -1)
				System.out.println("Gana: " + cUsuario.toString());
			else
				System.out.println("Gana: " + cOrdenador.toString());
		} catch (IllegalArgumentException e) {
			System.out.println("Carta incorrecta");
		}

	}
}

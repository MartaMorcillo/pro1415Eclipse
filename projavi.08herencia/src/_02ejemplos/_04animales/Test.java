package _02ejemplos._04animales;

public class Test {
	public static void main(String[] args) {
		//Podemos agrupar tigres y leones en un array de Animal
		Animal[] animalesCirco = {
				new Leon(),
				new Tigre(),
				new Leon()
		};
		//Podemos recorrer los arrays llamando a métodos de la clase Animal
		for (int i = 0; i < animalesCirco.length; i++) {
			animalesCirco[i].comer();
			animalesCirco[i].dormir();
		}
		//--------------------------------------------------------------------
		// Se puede hacer lo mismo agrupando en un array de Felino
		//Podemos agrupar tigres y leones en un array de Felino
		Felino[] animalesCirco2 = {
				new Leon(),
				new Tigre(),
				new Leon()
		};
		for (int i = 0; i < animalesCirco2.length; i++) {
			animalesCirco2[i].comer();
			animalesCirco2[i].dormir();
		}
		//---------------------------------------------------------------------
		//Podemos agrupar perros y gatos en un array de Animal
		Animal[] perrosygatos = {
				new Perro(),
				new Gato()
		};
		//Podemos recorrer el array de perros y gatos llamando a métodos de la clase Animal
		for (int i = 0; i < perrosygatos.length; i++) {
			perrosygatos[i].comer();
			perrosygatos[i].dormir();
			//Pero no puedo llamar a vacunar
			//animalesDomesticos[i].vacunar();
		}
		//---------------------------------------------------------------------
		//Podemos agrupar perros y gatos en un array de AnimalDomestico
		AnimalDomestico[] animalesDomesticos = {
				new Perro(),
				new Gato()
		};
		//Podemos recorrer el array vacunando a los AnimalesDomestico
		for (int i = 0; i < animalesDomesticos.length; i++) {
			animalesDomesticos[i].vacunar();
			//Pero no puedo llamar a dormir, comer, hacerRuido ...
			//animalesDomesticos[i].dormir();
			
		}
		//---------------------------------------------------------------------
		//Solución: Definir el array de Animal y hacer casting a AnimalDomestico
		Animal[] perrosygatos2 = {
				new Perro(),
				new Gato()
		};
		for (int i = 0; i < perrosygatos2.length; i++) {
			perrosygatos2[i].comer();
			perrosygatos2[i].dormir();
			//Pero no puedo llamar a vacunar
			((AnimalDomestico)perrosygatos2[i]).vacunar();
		}
		
	}
}

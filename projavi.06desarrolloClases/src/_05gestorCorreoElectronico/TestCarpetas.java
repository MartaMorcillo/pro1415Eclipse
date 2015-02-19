package _05gestorCorreoElectronico;

public class TestCarpetas {
	public static void main(String[] args) {
		//Creamos dos carpetas
		Carpeta recibidos = new Carpeta("Mensajes recibidos");
		Carpeta eliminados = new Carpeta ("Mensajes eliminados");
		
		//Anadimos mensajes a recibidos
		recibidos.anyadir(new Mensaje("yo@gmai.com","tu@gmail.com","saludo","hola"));
		recibidos.anyadir(new Mensaje("tu@gmai.com","tu@gmail.com","saludo","adios"));
		recibidos.anyadir(new Mensaje("el@gmai.com","tu@gmail.com","saludo","hasta luego"));
		recibidos.anyadir(new Mensaje("ella@gmai.com","tu@gmail.com","saludo","bye"));
		recibidos.anyadir(new Mensaje("yo@gmai.com","tu@gmail.com","saludo","hi"));
		
		System.out.println(recibidos.toString());
		System.out.println(eliminados.toString());
		
		//Mover el mensaje 1 a eliminados
		try {
			Carpeta.mover(recibidos, eliminados, 1);
		} catch (ElementoNoEncontradoException e) {
			System.out.println("El mensaje no existe");
		}
		
		
	}

}

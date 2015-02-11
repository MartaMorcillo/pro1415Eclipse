package _05gestorCorreoElectronico;

public class TestCorreo {
	public static void main(String args[]){
		Mensaje m1 = new Mensaje ("pepe@gmail.com", "ana@gmail.com","saludo", "hola que tal");
		Mensaje m2 = new Mensaje ("ana@gmail.com", "pepe@gmail.com","respuesta", "muy bien");
		System.out.println(m1);
		System.out.println(m2);
		
		
		System.out.println(Mensaje.validarEMail("tuCorreo@gmail.com"));
		System.out.println(Mensaje.validarEMail("tuCorreogmail.com"));
		System.out.println(Mensaje.validarEMail("tuCorreo@gmailcom"));
		System.out.println(Mensaje.validarEMail("tuCorreo.gmail@com"));
		System.out.println(Mensaje.validarEMail(m1.getEmisor()));
		
	}
}

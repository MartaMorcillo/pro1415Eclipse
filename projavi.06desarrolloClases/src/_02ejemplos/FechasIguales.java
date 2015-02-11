package _02ejemplos;

public class FechasIguales {
	public static void main(String[] args) {
		Fecha f1 = new Fecha(10,2,2000);
		Fecha f2 = new Fecha(10,2,2000);
		Fecha f3 = new Fecha(11,3,2001);
		Fecha f4 = f1;
		Fecha f5 = null;
		System.out.println(f1 == f2);
		System.out.println(f1 == f3);
		System.out.println(f1 == f4);
		System.out.println("-----");
		System.out.println(f1.equals(f2));
		System.out.println(f1.equals(f3));
		System.out.println(f1.equals(f4));
		
		
//		System.out.println(f5);
//		System.out.println(f5.getDia());
		
		System.out.println(f1.equals("hola"));
		
		System.out.println(f1.compareTo(f2));
		System.out.println(f1.compareTo(f3));
		
	}

}

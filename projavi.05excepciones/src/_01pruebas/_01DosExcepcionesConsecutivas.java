package _01pruebas;

public class _01DosExcepcionesConsecutivas {
	public static int metodo(){
		int a = 5;
		try{
			if(a==5)throw new NumberFormatException();
		}finally {
			//return 1;
		}
		return 1;
	}
	public static void main(String[] args) {
		try{
			metodo();
			System.out.println("Todo ok");
		} catch(NumberFormatException e){
			System.out.println("NumberFormatException");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
	}
}

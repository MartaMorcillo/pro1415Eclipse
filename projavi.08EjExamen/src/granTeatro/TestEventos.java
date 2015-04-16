package granTeatro;

public class TestEventos {
	public static void main(String[] args) {
		ObraTeatro o = new ObraTeatro("ttt","10/10/2015","20:00",10,"ddd","iiii");
		System.out.println(o);
		Exposicion e = new Exposicion("ttt","10/10/2015","20:00",1,"11/10/2015");
		System.out.println(e);
		ProduccionLocal pd = new ProduccionLocal("ttt","10/10/2015","20:00","oooo");
		System.out.println(pd);
	}
}

package granTeatro;

public abstract class Evento {
	private String titulo;
	private String fecha;
	private String hora;
	private double precio;
	
	public Evento(String titulo, String fecha, String hora, double precio){
		this.titulo = titulo;
		this.fecha = fecha;
		this.hora = hora;
		this.precio = precio;
	}
	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		if (!(o instanceof Evento)) return false;
		Evento e = (Evento) o;
		return this.titulo.equals(e.titulo) && this.fecha.equals(e.fecha);
	}
	@Override
	public String toString(){
		return "Titulo: " + titulo + 
				"\nFecha: " + fecha + 
				"\nHora: " + hora +
				(precio==0 ? "\nEntrada gratuita!!!" : "\nPrecio: " + precio);
	}
	public String toString2(){
		String res =  "Titulo: " + titulo + 
				"\nFecha: " + fecha + 
				"\nHora: " + hora ;
		if(precio == 0) res+= "\nEntrada gratuita!!!";
		else res += "\nPrecio: " + precio;
		return res;
	}

}

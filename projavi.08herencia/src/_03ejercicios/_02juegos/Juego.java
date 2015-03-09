package _03ejercicios._02juegos;

public class Juego {
	protected String titulo;
	protected String fabricante;
	private int anyo;
	public Juego(String t, String f, int a){
		titulo = t;
		fabricante = f;
		anyo = a;
	}
	public String getTitulo(){
		return titulo;
	}
	public String getFabricante(){
		return fabricante;
	}
	public int getAnyo(){
		return anyo;
	}
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Juego)) return false;
		Juego j = (Juego)o;
		return titulo.equals(j.titulo) && fabricante.equals(j.fabricante) && anyo == j.anyo;
	}
	public int compareTo(Object o){
		Juego j = (Juego)o;
		int compTitulo = titulo.compareTo(j.titulo);
		if(compTitulo != 0) return compTitulo;
		
		int compFab = fabricante.compareTo(j.fabricante);
		if(compFab != 0) return compFab;
		
		if(anyo < j.anyo) return -1;
		else if(anyo > j.anyo) return 1;
		else return 0;
	}
	@Override
	public String toString(){
		return "Titulo: " + titulo + 
				"\nFabricante: " + fabricante + 
				"\nAnyo: " + anyo;
	}
}

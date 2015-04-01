package _03ejercicios._06conjuntos2;

public interface Conjunto <T> {
	void anyadir(T elemento) throws ElementoDuplicado;
	void quitar(T elemento) throws ElementoNoEncontrado;
	boolean pertenece (T elemento);
}

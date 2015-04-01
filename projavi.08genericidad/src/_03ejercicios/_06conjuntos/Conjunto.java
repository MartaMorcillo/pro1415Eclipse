package _03ejercicios._06conjuntos;

public interface Conjunto {
	void anyadir(Object elemento) throws ElementoDuplicado;
	void quitar(Object elemento) throws ElementoNoEncontrado;
	boolean pertenece (Object elemento);
}

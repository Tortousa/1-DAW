package ejemploEx;

import java.util.Iterator;
/**
 * Implementacion de una lista enlazada que extiende de la clase abstracta (@link Lista)
 */
public class ListaEnlazada extends Lista{
	
	/**
	 * Clase privada para nodos internos de la lista
	 */
	private static class Nodo {
		Object dato;
		Nodo siguiente;
		
		public Nodo(Object dato) {
			this.dato = dato;
			this.siguiente = null;
		}
	}
	/**
	 * Referencia al primer nodo
	 */
	private Nodo primero;
	
	/**
	 * Con el super heredariamos el atributo de la clase Lista
	 * numero de elementos
	 */
	public ListaEnlazada() {
		super();
		this.primero = null;
	}
	
	@Override
	public void add(Object elemento) {
		Nodo nuevo = new Nodo(elemento);
		
		if(isEmpty()) {
			primero = nuevo;
		} else {
			Nodo actual = obtenerNodo(numElementos - 1);
			actual.siguiente = nuevo;
		}
		numElementos++;
	}

	private Nodo obtenerNodo(int indice) {
		Nodo actual = primero;
		
		for(int i = 0; i < indice; i++) {
			actual = actual.siguiente;
		}
		return actual;
	}
	@Override
	public void add(int indice, Object elemento) {
		if(indice < 0 || indice > numElementos) {
			throw new IndexOutOfBoundsException("Indice incorrecto");
		}
		
		Nodo nuevo = new Nodo(elemento);
		
		if(indice == 0) {
			nuevo.siguiente = primero;
			primero = nuevo;
		} else {
			Nodo anterior = obtenerNodo(indice - 1);
			nuevo.siguiente = anterior.siguiente;
			anterior.siguiente = nuevo;
		}
		numElementos++;
		
	}

	@Override
	public Object remove(int indice) {
		if(indice < 0 || indice > numElementos) {
			throw new IndexOutOfBoundsException("Indice incorrecto");
		}
		
		Object eliminado;
		if(indice == 0) {
			eliminado = primero.dato;
			primero = primero.siguiente;
		} else {
			Nodo anterior = obtenerNodo(indice - 1);
			Nodo actual = anterior.siguiente;
			eliminado = actual.dato;
			anterior.siguiente = actual.siguiente;
		}
		numElementos--;
		return eliminado;
	}

	@Override
	public int remove(Object elemento) {
		int index = indexOf(elemento);
		if(index != 1) {
			remove(index);
		}
		return index;
	}

	@Override
	public Object get(int indice) {
		Nodo nodo = obtenerNodo(indice);
		return nodo.dato;
	}

	@Override
	public int indexOf(Object elemento) {
		Nodo actual = primero;
		int index = 0;
		
		while(actual != null) {
			if(actual.dato.equals(elemento)) {
				return index;
			}
			actual = actual.siguiente;
			index++;
		}
		return -1;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

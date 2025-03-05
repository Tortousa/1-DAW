package Unidad6;

import java.util.Iterator;

public class ListaEnlazada extends Lista{
	private Nodo primero;
	
	private static class Nodo {
		Object dato;
		Nodo siguiente;
		
		public Nodo(Object dato) {
			this.dato = dato;
			this.siguiente = null;
		}
	}
	
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
			Nodo ultimo = obtenerNodo(numElementos - 1);
			ultimo.siguiente = nuevo;
		}
		numElementos++;
	}

	private Nodo obtenerNodo(int indice) {
		if(indice < 0 || indice > numElementos) {
			throw new IndexOutOfBoundsException("Indice incorrecto" + indice);
		}
		
		Nodo actual = primero;
		for(int i = 0; i < indice; i++) {
			actual = actual.siguiente;
		}
		return actual;
	}


	@Override
	public void add(int indice, Object elemento) {
		if(indice < 0 || indice > numElementos) {
			throw new IndexOutOfBoundsException("Indice incorrecto" + indice);
		}
		
		if(indice == 0) {
			Nodo nuevo = new Nodo(elemento);
			nuevo.siguiente = primero;
			primero = nuevo;
		} else {
			Nodo anterior = obtenerNodo(indice - 1);
			Nodo nuevo = new Nodo(elemento);
			nuevo.siguiente = anterior.siguiente;
			anterior.siguiente = nuevo;
		}
		numElementos++;
	}

	@Override
	public Object remove(int indice) {
		if(indice < 0 || indice > numElementos) {
			throw new IndexOutOfBoundsException("Indice incorrecto" + indice);
		}
		
		Object eliminado;
		if(indice == 0) {
			eliminado = primero.dato;
			primero = primero.siguiente;
		} else {
			Nodo anterior = obtenerNodo(indice - 1);
			eliminado = anterior.siguiente.dato;
			anterior.siguiente = anterior.siguiente.siguiente;
		}
		numElementos--;
		return eliminado;
	}

	@Override
	public int remove(Object elemento) {
		int pos = indexOf(elemento);
		if(pos != -1) {
			remove(pos);
		}
		return pos;
	}

	@Override
	public Object get(int indice) {
		return obtenerNodo(indice).dato;
	}

	@Override
	public int indexOf(Object elemento) {
		Nodo actual = primero;
		int index = 0;
		
		while(actual != null) {
			if((actual.dato == null && elemento == null) || (actual.dato != null && actual.dato.equals(elemento))) {
				return index;
			}
			actual = actual.siguiente;
			index++;
		}
		return -1;
	}
	
	@Override
	public Iterator<Object> iterator() {
		return new Iterator<Object>() {
			private Nodo actual = primero;
			@Override
			public boolean hasNext() {
				return actual != null;
			}

			@Override
			public Object next() {
				Object dato = actual.dato;
				actual = actual.siguiente;
				return dato;
			}
		};
	}
}

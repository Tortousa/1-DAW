package listaHerencia;

import java.util.Iterator;

public abstract class Lista implements Iterable<Object>{
		
	//Clase abstracta que represena el comportamiento general de 

	protected int numElementos;
	
	protected Lista() {
		this.numElementos = 0;
	}
	
	//añade un elemento al final de la lista
	//obliga  a que las subclases la implementen
	//forzar sobreescritura método abstracto
	public abstract void add(Object elemento) ;
	//elimina el elemento en el indice dado
	public abstract Object remove(int indice);
	//Elimina el objeto que le pasamos como parametro
	public abstract int remove(Object elemento);
	//el objeto que se encuentra en esta posicion
	public abstract Object get(int indice);
	//indice que devuelve el indice del elemento que le paso
	public abstract int indexOf(Object elemento);
	//el tamaño de esas listas
	public int size() {
		return numElementos;
	}
	//al ser final, ninguna subclase puede sobreescribirla
	//indica si la lista está vacía
	public final boolean isEmpty() {
		return numElementos == 0;
	}
	
	public abstract Iterator<Object> iterator();

	public void add(int indice, Object elemento) {
		
	}
}

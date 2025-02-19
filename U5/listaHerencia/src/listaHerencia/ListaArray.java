package listaHerencia;

import java.util.Iterator;

public class ListaArray extends Lista {

	/*
	 * esto lo hace la libreria de java
	 * pero para entenderlo lo estamos viendo de una forma
	 * más comprensible
	 */
	
	private static final int TAMAÑO_INICIAL=4;
	private Object[] arrayElementos;
	
	public ListaArray() {
		super();
		this.arrayElementos=new Object[TAMAÑO_INICIAL];
	}

	@Override
	public void add(Object elemento) {
		comprobarLlenado();
		arrayElementos[numElementos]=elemento;
		numElementos++;
	}

	private void comprobarLlenado() {
		if(numElementos==arrayElementos.length) {		
			Object[]arrayAmpliado=new Object[arrayElementos.length*2];
			/*esto coge el un array inicial, que empieze desde cero y que se multiplique por dos y que tenga esos elementos
			 */
			System.arraycopy(arrayAmpliado, 0, arrayAmpliado, 0, numElementos);
		}
	}
		
	public void add(int indice,Object elemento) {
		if(indice <0||indice>numElementos) {
			throw new IndexOutOfBoundsException("Indice incorrecto"+indice);
		}
		comprobarLlenado();
		//desplazamos elementos desde indice una posicion a la derecha
		System.arraycopy(arrayElementos, indice, arrayElementos, indice+1, numElementos-indice);
	}

	@Override
	public Object remove(int indice) {
		if(indice<0||indice>=numElementos) {
			throw new IndexOutOfBoundsException("Indice incorrecto"+indice);
		}
		Object elem = arrayElementos[indice];

		System.arraycopy(arrayElementos, indice, arrayElementos, indice-1, numElementos-indice-1);
		arrayElementos[numElementos-1]=null;
		numElementos--;
		return elem;
	}

	@Override
	public int remove(Object obj) {
		int indice=indexOf(obj);
		if(indice!=-1) {
			remove(indice);
		}
		return indice;
	}
	
	@Override
	public Object get(int indice) {
	    // Lanza excepción si el índice no es válido
	    if (indice >= numElementos || indice < 0) {
	        throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
	    }
	    return arrayElementos[indice];
	}

	@Override
	public int indexOf(Object elemento) {
		for(int i=0;i<numElementos;i++) {
			if(arrayElementos[i]==null&&elemento==null || (arrayElementos[i] !=null && arrayElementos[i].equals(elemento))){
				return i;
			}
		}
		return -1;
	}

	@Override
	public Iterator<Object> iterator() {
		return new Iterator<Object>() {
			private int index=0;

			@Override
			public boolean hasNext() {
				return index<numElementos;
			}

			@Override
			public Object next() {
				Object elemento=arrayElementos[index];
				index++;
				return elemento;
			}
		};
	}

	@Override
	public void add(int i, String string) {
	    if (i < 0 || i > numElementos) {
	        throw new IndexOutOfBoundsException("Índice incorrecto: " + i);
	    }
	    
	    comprobarLlenado(); 
	    
	    System.arraycopy(arrayElementos, i, arrayElementos, i + 1, numElementos - i);
	    
	    arrayElementos[i] = string;
	    numElementos++;
	}
}
package listaHerencia;

import java.util.Iterator;

public class ListaDoblementeEnlazada extends Lista{
    private Nodo primero;
    private Nodo ultimo;

    public ListaDoblementeEnlazada() {
        super();
        this.primero = null;
        this.ultimo = null;
    }

    @Override
    public void add(Object elemento) {
        addUltimo(elemento);
    }

    @Override
    public void add(int indice, Object elemento) {
        if(indice < 0 || indice > numElementos) {
            throw new IndexOutOfBoundsException("Indice in");
        }

        if(indice == 0) {
            insertarPrimero(elemento);
            return;
        }
        
        if(indice == numElementos) {
            addUltimo(elemento);
            return;
        }

        insertarIntermedio(indice, elemento);

    }

    @Override
    public Object remove(int indice) {
        //comprobacion
        if(indice == 0) {
            return removePrimero();
        }

        if(indice == numElementos) {
            return removeUltimo();
        }
        return removeIntermedio(indice);
    }

    private Object removeIntermedio(int indice) {
        Nodo actual = obtenerNodo(indice);
        Nodo anterior = actual.anterior;
        Nodo siguiente = actual.siguiente;

        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;
        numElementos--;
        return actual.dato;
    }

    private Object removeUltimo() {
        Nodo nodoEliminado = ultimo;

        if(numElementos == 1) {
            primero = null;
            ultimo = null;
        } else {
            ultimo = ultimo.anterior;
            ultimo.siguiente = null;
        }
        numElementos--;
        return nodoEliminado.dato;
    }


    private Object removePrimero() {
        Nodo nodoEliminado = primero;

        if(numElementos == 1) {
            primero = null;
            ultimo = null;
        } else {
            primero = primero.siguiente;
            primero.anterior = null;
        }
        numElementos--;
        return nodoEliminado.dato;
    }

    @Override
    public int remove(Object elemento) {
        int idx = indexOf(elemento);
        if(idx != -1) {
            remove(idx);
        }
        return idx;
    }

    @Override
    public Object get(int indice) {
        Nodo nodo = obtenerNodo(indice);
        return nodo.dato;
    }

    @Override
    public int indexOf(Object elemento) {
        Nodo actual = primero;
        for(int i = 0; i < numElementos; i++) {
            if(actual.dato.equals(elemento)) {
                return i;
            }
            actual = actual.siguiente;
        }
        return -1;
    }

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            private Nodo current = primero;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Object next() {
                Object dato = current.dato;
                current = current.siguiente;
                return dato;
            }
        };
    }

    public void addUltimo(Object elemento) {
        Nodo nuevo = new Nodo(elemento);
        if(numElementos == 0) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
        numElementos++;
    }

    private void insertarPrimero(Object dato) {
        Nodo nuevo = new Nodo(dato);

        if(numElementos == 0) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
    }

    private void insertarIntermedio(int indice, Object elemento) {
        Nodo nuevo = new Nodo(elemento);
        Nodo actual = obtenerNodo(indice);
        Nodo anterior = actual.anterior;

        anterior.siguiente = nuevo;
        nuevo.anterior = anterior;
        nuevo.siguiente = actual;
        actual.anterior = nuevo;
        numElementos++;
    }

    private ListaDoblementeEnlazada.Nodo obtenerNodo(int indice) {
        Nodo actual = primero;
        for(int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual;
    }

    private static class Nodo {
        Object dato;
        Nodo anterior, siguiente;

        public Nodo(Object dato) {
            this.dato = dato;
            this.anterior = null;
            this.siguiente = null;
        }

    } 
}
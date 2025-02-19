package listaHerencia;

import java.util.Iterator;

public class ListaEnlazada extends Lista{

    private Nodo primero; //referencia al primer nodo

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
        //numElementos = 0 viene de super
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

    public void add(int indice, Object elemento) {
        if(indice < 0 || indice > numElementos) {
           throw new IndexOutOfBoundsException("Indice incorrecto");
        }

        Nodo nuevo = new Nodo(elemento);

        if(indice == 0) {
            nuevo.siguiente = primero;
            primero = nuevo;
        }

        Nodo anterior = obtenerNodo(indice - 1);
        nuevo = new Nodo(elemento);

        nuevo.siguiente = anterior.siguiente;
        anterior.siguiente = nuevo;
        numElementos++;
    }

    public Object get(int indice) {
        return null;
    }

    public Object remove(int indice) {
        if(indice < 0 || indice >= numElementos) {
            throw new IndexOutOfBoundsException("Indice incorrecto: " + indice);
        }

    }

    public int indexOf(Object elemento) {
        Nodo actual = primero;
        int index = 0;

        while (actual != null) {
            if(actual.dato.equals(elemento)) {
                return index;
            }
            actual = actual.siguiente;
            index++;
        }
        return -1;
    }

    public int remove(Object obj) {
        int pos = indexOf(obj);
        if(pos != -1) {
            remove(pos);
        }
        return pos;
    }
        
    private Nodo obtenerNodo(int indice) {
        Nodo actual = primero;
        for(int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual;
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
}
package Unidad6;

import java.util.Iterator;

/**
 * Clase que representa una lista enlazada simple. Extiende la clase abstracta {@link Lista}
 * e implementa la interfaz {@link Iterable} para permitir la iteración sobre sus elementos.
 */
public class ListaEnlazada extends Lista {
    private Nodo primero; // Referencia al primer nodo de la lista

    /**
     * Clase interna que representa un nodo de la lista enlazada.
     */
    private static class Nodo {
        Object dato;      // Dato almacenado en el nodo
        Nodo siguiente;   // Referencia al siguiente nodo

        /**
         * Constructor que inicializa un nodo con el dato especificado.
         *
         * @param dato el objeto a almacenar en el nodo.
         */
        public Nodo(Object dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    /**
     * Constructor que inicializa una lista vacía.
     */
    public ListaEnlazada() {
        super(); // Llama al constructor de la clase padre (Lista)
        this.primero = null;
    }

    /**
     * Añade un elemento al final de la lista.
     *
     * @param elemento el objeto a añadir.
     */
    @Override
    public void add(Object elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (isEmpty()) {
            primero = nuevo;
        } else {
            Nodo ultimo = obtenerNodo(numElementos - 1);
            ultimo.siguiente = nuevo;
        }
        numElementos++;
    }

    /**
     * Obtiene el nodo en la posición especificada.
     *
     * @param indice la posición del nodo a obtener.
     * @return el nodo en esa posición.
     * @throws IndexOutOfBoundsException si el índice está fuera de rango.
     */
    private Nodo obtenerNodo(int indice) {
        if (indice < 0 || indice >= numElementos) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }

        Nodo actual = primero;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual;
    }

    /**
     * Inserta un elemento en la posición especificada.
     *
     * @param indice   la posición en la que se insertará el elemento.
     * @param elemento el objeto a insertar.
     * @throws IndexOutOfBoundsException si el índice está fuera de rango.
     */
    @Override
    public void add(int indice, Object elemento) {
        if (indice < 0 || indice > numElementos) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }

        if (indice == 0) {
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

    /**
     * Elimina y retorna el elemento en la posición especificada.
     *
     * @param indice la posición del elemento a eliminar.
     * @return el elemento eliminado.
     * @throws IndexOutOfBoundsException si el índice está fuera de rango.
     */
    @Override
    public Object remove(int indice) {
        if (indice < 0 || indice >= numElementos) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }

        Object eliminado;
        if (indice == 0) {
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

    /**
     * Elimina la primera aparición del elemento especificado.
     *
     * @param elemento el objeto a eliminar.
     * @return el índice del elemento eliminado, o -1 si no se encontró.
     */
    @Override
    public int remove(Object elemento) {
        int pos = indexOf(elemento);
        if (pos != -1) {
            remove(pos);
        }
        return pos;
    }

    /**
     * Retorna el elemento en la posición especificada.
     *
     * @param indice la posición del elemento a obtener.
     * @return el objeto en esa posición.
     * @throws IndexOutOfBoundsException si el índice está fuera de rango.
     */
    @Override
    public Object get(int indice) {
        return obtenerNodo(indice).dato;
    }

    /**
     * Retorna el índice de la primera ocurrencia del elemento especificado.
     *
     * @param elemento el objeto a buscar.
     * @return el índice del elemento, o -1 si no se encuentra.
     */
    @Override
    public int indexOf(Object elemento) {
        Nodo actual = primero;
        int index = 0;

        while (actual != null) {
            if ((actual.dato == null && elemento == null) || (actual.dato != null && actual.dato.equals(elemento))) {
                return index;
            }
            actual = actual.siguiente;
            index++;
        }
        return -1;
    }

    /**
     * Retorna un iterador sobre los elementos de la lista.
     *
     * @return un iterador.
     */
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
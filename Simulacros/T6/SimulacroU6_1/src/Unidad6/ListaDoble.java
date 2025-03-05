package Unidad6;

import java.util.Iterator;

public class ListaDoble extends Lista {
    // Nodos para el inicio y fin de la lista
    private Nodo primero;
    private Nodo ultimo;

    // Constructor: inicializa la lista vacía
    public ListaDoble() {
        super(); // Llama al constructor de la clase padre (Lista)
        this.primero = null;
        this.ultimo = null;
    }

    // Añade un elemento al final de la lista
    @Override
    public void add(Object elemento) {
        addUltimo(elemento);
    }

    // Inserta un elemento en un índice específico
    @Override
    public void add(int indice, Object elemento) {
        // Validación del índice
        if (indice < 0 || indice > numElementos) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        // Casos especiales: insertar al principio o al final
        if (indice == 0) {
            insertarPrimero(elemento);
            return;
        }

        if (indice == numElementos) {
            addUltimo(elemento);
            return;
        }

        // Caso general: insertar en medio de la lista
        insertarIntermedio(indice, elemento);
    }

    // Elimina el elemento en un índice específico
    @Override
    public Object remove(int indice) {
        // Casos especiales: eliminar el primero o el último
        if (indice == 0) {
            return removePrimero();
        }

        if (indice == numElementos - 1) {
            return removeUltimo();
        }

        // Caso general: eliminar un elemento intermedio
        return removeIntermedio(indice);
    }

    // Elimina un elemento intermedio
    private Object removeIntermedio(int indice) {
        Nodo actual = obtenerNodo(indice);
        Nodo anterior = actual.anterior;
        Nodo siguiente = actual.siguiente;

        // Reorganiza los enlaces
        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;
        numElementos--;
        return actual.dato;
    }

    // Elimina el último elemento
    private Object removeUltimo() {
        Nodo nodoEliminado = ultimo;

        // Casos especiales: lista de un solo elemento o varios elementos
        if (numElementos == 1) {
            primero = null;
            ultimo = null;
        } else {
            ultimo = ultimo.anterior;
            ultimo.siguiente = null;
        }
        numElementos--;
        return nodoEliminado.dato;
    }

    // Elimina el primer elemento
    private Object removePrimero() {
        Nodo eliminado = primero;

        // Casos especiales: lista de un solo elemento o varios elementos
        if (numElementos == 1) {
            primero = null;
            ultimo = null;
        } else {
            primero = primero.siguiente;
            primero.anterior = null;
        }
        numElementos--;
        return eliminado.dato;
    }

    // Elimina la primera aparición de un elemento
    @Override
    public int remove(Object elemento) {
        int idx = indexOf(elemento);
        if (idx != -1) {
            remove(idx);
        }
        return idx;
    }

    // Obtiene el elemento en un índice específico
    @Override
    public Object get(int indice) {
        Nodo nodo = obtenerNodo(indice);
        return nodo.dato;
    }

    // Encuentra el índice de la primera aparición de un elemento
    @Override
    public int indexOf(Object elemento) {
        Nodo actual = primero;
        for (int i = 0; i < numElementos; i++) {
            if (actual.dato.equals(elemento)) {
                return i;
            }
            actual = actual.siguiente;
        }
        return -1;
    }

    // Iterador para recorrer la lista
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

    // Añade un elemento al final de la lista
    public void addUltimo(Object elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (numElementos == 0) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
        numElementos++;
    }

    // Inserta un elemento al principio de la lista
    private void insertarPrimero(Object dato) {
        Nodo nuevo = new Nodo(dato);

        if (numElementos == 0) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
        numElementos++;
    }

    // Inserta un elemento en medio de la lista
    private void insertarIntermedio(int indice, Object elemento) {
        Nodo nuevo = new Nodo(elemento);
        Nodo actual = obtenerNodo(indice);
        Nodo anterior = actual.anterior;

        // Reorganiza los enlaces
        anterior.siguiente = nuevo;
        nuevo.anterior = anterior;
        nuevo.siguiente = actual;
        actual.anterior = nuevo;
        numElementos++;
    }

    // Obtiene el nodo en un índice específico
    private ListaDoble.Nodo obtenerNodo(int indice) {
        Nodo actual = primero;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual;
    }

    // Clase interna para representar un nodo de la lista
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
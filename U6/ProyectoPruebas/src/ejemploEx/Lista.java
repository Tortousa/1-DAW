package ejemploEx;

import java.util.Iterator;

public abstract class Lista implements Iterable<Object> {
    
    /**
     * Número de elementos en la lista.
     * Uso de encapsulamiento para proteger el estado interno.
     */
    protected int numElementos;
    
    /**
     * Constructor que inicializa la lista vacía.
     */
    protected Lista() {
        this.numElementos = 0;
    }
    
    /**
     * Añade un elemento al final de la lista.
     * Método abstracto que debe ser implementado en las subclases.
     */
    public abstract void add(Object elemento);
    
    /**
     * Añade un elemento en una posición específica de la lista.
     */
    public abstract void add(int indice, Object elemento);
    
    /**
     * Elimina el elemento en el índice dado y devuelve el elemento eliminado.
     */
    public abstract Object remove(int indice);
    
    /**
     * Elimina un objeto específico de la lista y devuelve su índice.
     */
    public abstract int remove(Object obj);
    
    /**
     * Devuelve el objeto almacenado en la posición indicada.
     */
    public abstract Object get(int indice);
    
    /**
     * Devuelve el índice del primer elemento que coincide con el objeto dado.
     */
    public abstract int indexOf(Object elemento);
    
    /**
     * Devuelve el número de elementos en la lista.
     * Uso de métodos en la jerarquía de clases para evitar redundancia.
     */
    public int size() {
        return numElementos;
    }
    
    /**
     * Indica si la lista está vacía.
     * Uso de método final para evitar sobreescritura en subclases.
     */
    public final boolean isEmpty() {
        return numElementos == 0;
    }
    
    /**
     * Implementa la interfaz Iterable para permitir la iteración sobre los elementos de la lista.
     */
    @Override
    public abstract Iterator<Object> iterator();
}

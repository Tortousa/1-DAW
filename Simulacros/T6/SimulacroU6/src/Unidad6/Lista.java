package Unidad6;
/**
 * Clase abstracta que representa el comportamiento general de una lista.
 */
public abstract class Lista implements Iterable<Object> {

    /** Número de elementos en la lista. */
    protected int numElementos;

    /**
     * Constructor protegido para ser usado en subclases.
     * Inicializa numElementos a 0.
     */
    protected Lista() {
        this.numElementos = 0;
    }

    /**
     * Añade un elemento al final de la lista.
     * @param elemento objeto a insertar
     */
    public abstract void add(Object elemento);

    /**
     * Inserta un elemento en la posición especificada.
     * @param indice posición en la que se insertará el elemento
     * @param elemento objeto a insertar
     */
    public abstract void add(int indice, Object elemento);

    /**
     * Elimina y retorna el elemento en el índice dado.
     * @param indice posición del elemento a eliminar
     * @return el elemento eliminado
     */
    public abstract Object remove(int indice);

    /**
     * Elimina la primera aparición de un elemento.
     * @param elemento objeto a eliminar
     * @return índice en el que estaba el objeto, o -1 si no se encontró
     */
    public abstract int remove(Object elemento);

    /**
     * Retorna el elemento en una posición concreta.
     * @param indice índice del elemento a obtener
     * @return el objeto en esa posición
     */
    public abstract Object get(int indice);

    /**
     * Retorna el índice de la primera ocurrencia de un elemento o -1 si no está.
     * @param elemento objeto a buscar
     * @return índice del elemento o -1 si no se encuentra
     */
    public abstract int indexOf(Object elemento);

    /**
     * Devuelve el número de elementos en la lista.
     * @return número de elementos
     */
    public int size() {
        return numElementos;
    }

    /**
     * Indica si la lista está vacía. Es final para que no se sobrescriba.
     * @return true si está vacía, false en caso contrario
     */
    public final boolean isEmpty() {
        return numElementos == 0;
    }
}

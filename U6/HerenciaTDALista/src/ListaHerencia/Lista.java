package ListaHerencia;

import java.util.Iterator;

public abstract class Lista implements Iterable<Object> {
    protected int numElementos;

    protected Lista() {
        this.numElementos = 0;
    }

    public abstract void add(Object elemento);
    
    public abstract void add(int indice, Object elemento);
    
    public abstract Object remove(int indice);
    
    public abstract int remove(Object obj);
    
    public abstract Object get(int indice);

    public abstract int indexOf(Object elemento);

    public int size() {
        return numElementos;
    }

    public final boolean isEmpty() {
        return numElementos == 0;
    }

    @Override
    public abstract Iterator<Object> iterator();
}
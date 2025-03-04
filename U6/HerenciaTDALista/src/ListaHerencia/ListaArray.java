package ListaHerencia;

import java.util.Iterator;

public class ListaArray extends Lista {
    private static final int TAMAÑO_INICIAL = 4;
    private Object[] arrayElementos;

    public ListaArray() {
        super();
        arrayElementos = new Object[TAMAÑO_INICIAL];
    }

    @Override
    public void add(Object elemento) {
        comprobarLlenado();
        arrayElementos[numElementos] = elemento;
        numElementos++;
    }

    @Override
    public Object remove(int indice) {
        if (indice < 0 || indice >= numElementos) {
            throw new IndexOutOfBoundsException("Indice incorrecto");
        }
        
        Object elem = arrayElementos[indice];
        
        // Desplaza los elementos hacia la izquierda para rellenar el hueco
        System.arraycopy(arrayElementos, indice + 1, arrayElementos, indice, numElementos - indice - 1);
        
        arrayElementos[numElementos - 1] = null; // Elimina la referencia al último elemento
        numElementos--;
        return elem;
    }

    @Override
    public int remove(Object obj) {
        int indice = indexOf(obj);
        if (indice != -1) {
            remove(indice);
        }
        return indice;
    }

    @Override
    public Object get(int indice) {
        if (indice < 0 || indice >= numElementos) {
            throw new IndexOutOfBoundsException("Indice incorrecto: " + indice);
        }
        return arrayElementos[indice];
    }

    @Override
    public int indexOf(Object elemento) {
        for (int i = 0; i < numElementos; i++) {
            if ((arrayElementos[i] == null && elemento == null) || (arrayElementos[i] != null && arrayElementos[i].equals(elemento))) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(int indice, Object elemento) {
        if (indice < 0 || indice > numElementos) {
            throw new IndexOutOfBoundsException("Indice incorrecto");
        }

        comprobarLlenado();
        
        // Desplaza los elementos hacia la derecha para hacer espacio
        System.arraycopy(arrayElementos, indice, arrayElementos, indice + 1, numElementos - indice);
        
        arrayElementos[indice] = elemento;
        numElementos++;
    }

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            private int index = 0;
            
            @Override
            public boolean hasNext() {
                return index < numElementos;
            }
            
            @Override
            public Object next() {
                return arrayElementos[index++];
            }
        };
    }

    private void comprobarLlenado() {
        if (numElementos == arrayElementos.length) {
            Object[] arrayAmpliado = new Object[arrayElementos.length * 2];
            System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, numElementos);
            arrayElementos = arrayAmpliado;
        }
    }
}

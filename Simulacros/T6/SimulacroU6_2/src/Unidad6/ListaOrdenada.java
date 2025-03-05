package Unidad6;

/**
 * Clase que representa una lista doblemente enlazada ordenada. Extiende la clase {@link ListaDoble}
 * y asegura que los elementos se añadan en orden ascendente según su orden natural.
 */
public class ListaOrdenada extends ListaEnlazada{
	
	/**
     * Añade un elemento a la lista en la posición correcta para mantener el orden ascendente.
     *
     * @param elemento el objeto a añadir.
     */
	@Override
	public void add(Object elemento) {
		if(isEmpty()) {
			super.add(elemento);
			return;
		}
		
		int i = 0;
		while(i < size() && ((String)get(i)).compareToIgnoreCase((String)elemento) < 0) {
			i++;
		}
		super.add(i, elemento);
	}
}
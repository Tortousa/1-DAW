package ejemploEx;

public class ListaOrdenada extends ListaEnlazada{
/**
 * Sobreescribimos add(Object) para insertar en ordenAlfabetico
 */
	
	@Override
	public void add(Object elemento) {
		if(isEmpty()) {
			super.add(elemento);
			return;
		}
		
		int i = 0;
		while(i < size() && ((String)get(i)).compareToIgnoreCase((String)elemento)<0) {
			i++;
		}
		super.add(i, elemento);
	}
}

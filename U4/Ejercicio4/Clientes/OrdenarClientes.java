package Clientes;

public class OrdenarClientes {
	
	public static Cliente[] ordenarClientes(Cliente[] array) {
		if(array == null || array.length < 2) {
			return array;
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j].getApellidos().compareToIgnoreCase(array[j + 1].getApellidos()) > 0) {
					Cliente aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		return array;
	}
}

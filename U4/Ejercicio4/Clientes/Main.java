package Clientes;

public class Main {

	public static void main(String[] args) {
		Cliente[] listaClientes = {new Cliente("Ana", "Lopez"), 
				new Cliente("Paco", "Martinez"), 
				new Cliente("Pedro", "Fernandez"), 
				new Cliente("Maria", "Alvarez")
		};
	
		System.out.println("---- Lista Desordenada ----");
		
		for(Cliente c: listaClientes) {
			System.out.println(c);
		}
		
		OrdenarClientes.ordenarClientes(listaClientes);
		
		System.out.println("---- Lista Ordenada ----");
		
		for(Cliente c: listaClientes) {
			System.out.println(c);
		}
	}
}
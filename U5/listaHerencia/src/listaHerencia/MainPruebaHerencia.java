package listaHerencia;

public class MainPruebaHerencia {
	public static void main(String[] args) {
	Lista listaArray = new ListaArray();

	listaArray.add("x");
	listaArray.add("y");
	listaArray.add("z");
	listaArray.add(0,"w");

	mostrarLista(listaArray);
	}
	
	private static void mostrarLista(Lista lista) {
		for(int i=0;i<lista.size();i++) {
			System.out.println("["+i+"]:"+lista.get(i));
		}
		System.out.println("Tamaño Actual: " +lista.size());
		System.out.println("Está vacio: "+lista.isEmpty());

	}
}
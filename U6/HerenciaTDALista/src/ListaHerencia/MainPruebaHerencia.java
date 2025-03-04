package ListaHerencia;

public class MainPruebaHerencia {
    public static void main(String[] args) {
        
        // Creación de una lista enlazada
        Lista listaEnlazada = new ListaEnlazada();
        
        // Añadiendo elementos a la lista
        listaEnlazada.add("X");
        listaEnlazada.add("Y");
        listaEnlazada.add("Z");
        listaEnlazada.add(0, "W"); // Insertando "W" en la posición 0
        
        System.out.println("\nContenido de ListaArray");
        mostrarLista(listaEnlazada);
    }
    
    private static void mostrarLista(Lista lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("[" + i + "]: " + lista.get(i));
        }
        
        // Mostrando propiedades de la lista
        System.out.println("Tamaño actual:" + lista.size());
        System.out.println("¿Está vacía? " + lista.isEmpty());
    }
}

package ListaHerencia;

public class MainListaDoble {

    public static void main(String[] args) {
        Lista listaDoble = new ListaDoblementeEnlazada();

        listaDoble.add("UNO");
        listaDoble.add("DOS");
        listaDoble.add("TRES");
        listaDoble.add(1, "CUATRO"); // insertamos en medio

        System.out.println("\nContenido de ListaDoble:");
        mostrarLista(listaDoble);

        // Eliminamos el último
        System.out.println("Eliminando índice 3 (último): " + listaDoble.remove(3));
        System.out.println("Tras eliminar último:");
        mostrarLista(listaDoble);

        // Eliminamos el primero
        System.out.println("Eliminando índice 0 (primero): " + listaDoble.remove(0));
        System.out.println("Tras eliminar primero:");
        mostrarLista(listaDoble);

        // Ejemplo extra: recorrer con for-each gracias a Iterable<Object>
        System.out.println("\nRecorriendo listaDoble con for-each:");
        for (Object dato : listaDoble) {
            System.out.println(" - " + dato);
        }
    }

    public static void mostrarLista(Lista lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("[" + i + "]: " + lista.get(i));
        }
        System.out.println("Tamaño actual: " + lista.size());
        System.out.println("Está vacía? " + lista.isEmpty());
    }
}